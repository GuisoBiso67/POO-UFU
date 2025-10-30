public class ContaCorrente {
    String nome;
    double saldo;
    boolean especial;

    void emitirSaldo(){
        System.out.println("Usuario: " + nome);
        System.out.println("Saldo atual: " + saldo);
    }

    boolean ehEspecial(){
        return especial;
    }

    void tipoUsuario(){
        if(ehEspecial()){
            System.out.println(nome + " eh usuario especial!");
        }else{
            System.out.println(nome + " eh usuario normal!");
        }
    }

    void depositar(double valor){
        saldo += valor;
        System.out.println("Valor depositado com sucesso!");
        System.out.println("Saldo atual: " + saldo);
    }

    void sacar(double valor){
        if(valor > saldo && !ehEspecial()){
            System.out.println("Nao foi possivel sacar. Saldo insuficiente!");
        }else{
            saldo -= valor;
            System.out.println("Valor retirado com sucesso!");
            System.out.println("Saldo restante: " + saldo);
        }
    }

    void transferir(double valor,  ContaCorrente conta2){
        if(valor > saldo && !ehEspecial()){
            System.out.println("Nao foi possivel transferir. Saldo insuficiente!");
        }else{
            saldo -= valor;
            conta2.saldo += valor;
            System.out.println(valor + " transferido com sucesso para " + conta2.nome);
            System.out.println("Saldo restante: " + saldo);
        }
    }
}
