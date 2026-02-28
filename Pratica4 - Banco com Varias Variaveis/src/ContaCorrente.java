import java.util.ArrayList;
import java.util.Random;

public class ContaCorrente {
    Cliente cliente;
    int id;
    Banco banco;
    ArrayList<Transacoes> extrato;
    Random geradorID = new Random(); // melhorar isso depois;

    public ContaCorrente(Cliente cliente, Banco banco) {
        this.cliente = cliente;
        this.extrato = new ArrayList<Transacoes>();
        this.id = geradorID.nextInt(10000);;
        banco.addContaCorrente(this);
    }

    void mostrarInfo(){
        System.out.println("Usuario: " + cliente.nome);
        System.out.println("Endereco: " + cliente.endereco);
        if(cliente.especial){
            System.out.println("Conta: Especial");
        }else{
            System.out.println("Conta: Normal");
        }
        System.out.println("Saldo atual: " + cliente.saldo);
    }

    void emitirSaldo(){
        System.out.println("Usuario: " + cliente.nome);
        System.out.println("Saldo atual: " + cliente.saldo);
    }

    void emitirExtrato(){
        System.out.println("--- EXTRATO " + cliente.nome + " ---");
        for(Transacoes t : extrato){
            t.formatarMensagem();
        }
    }

    boolean ehEspecial(){
        return cliente.especial;
    }

    void tipoUsuario(){
        if(ehEspecial()){
            System.out.println(cliente.nome + " eh usuario especial!");
        }else{
            System.out.println(cliente.nome + " eh usuario normal!");
        }
    }

    void depositar(double valor){
        cliente.saldo += valor;
        System.out.println("Valor depositado com sucesso!");
        System.out.println("Saldo atual: " + cliente.saldo);
        DataHora dataHoraAtual = new DataHora();
        Transacoes deposito = new Transacoes("depositou",this,valor, dataHoraAtual.formatDataHora());
        //String movimentacao = deposito.entradaDados1Usuario("depositou", id, cliente.saldo, dataHoraAtual.formatDataHora());
        extrato.add(deposito);
    }

    void sacar(double valor){
        if(valor > cliente.saldo && !ehEspecial()){
            System.out.println("Nao foi possivel sacar. Saldo insuficiente!");
        }else{
            cliente.saldo -= valor;
            System.out.println("Valor retirado com sucesso!");
            System.out.println("Saldo restante: " + cliente.saldo);
            DataHora dataHoraAtual = new DataHora();
            Transacoes saque = new Transacoes("sacou",this,valor, dataHoraAtual.formatDataHora());
            extrato.add(saque);
        }
    }

    void transferir(double valor,  ContaCorrente conta2){
        if(valor > cliente.saldo && !ehEspecial()){
            System.out.println("Nao foi possivel transferir. Saldo insuficiente!");
        }else{
            cliente.saldo -= valor;
            conta2.cliente.saldo += valor;
            System.out.println(valor + " transferido com sucesso para " + conta2.cliente.nome);
            System.out.println("Saldo restante: " + cliente.saldo);
            DataHora dataHoraAtual = new DataHora();
            Transacoes transferencia = new Transacoes("transferiu",this,valor, dataHoraAtual.formatDataHora());
            Transacoes transferido = new Transacoes("recebeu",conta2,valor, dataHoraAtual.formatDataHora());
            extrato.add(transferencia);
            conta2.extrato.add(transferido);
        }
    }
}
