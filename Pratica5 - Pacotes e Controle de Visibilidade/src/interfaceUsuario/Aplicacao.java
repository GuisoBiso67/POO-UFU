package interfaceUsuario;
import java.util.*;
import entities.*;
import operations.ContaCorrente;

public class Aplicacao {
    private List<Banco> bancos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void execucao(){
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Banco");
            System.out.println("2. Buscar Banco");
            System.out.println("3. Listar Bancos");
            System.out.println("4. Cadastrar Usuario em Banco");
            System.out.println("5. Buscar Usuario de Banco");
            System.out.println("6. Extrato de Usuario");
            System.out.println("7. Simular Saque");
            System.out.println("8. Simular Deposito");
            System.out.println("9. Simular Transferencia");
            System.out.println("10. Listar Clientes Banco");
            //System.out.println("0. Sair");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> this.criarBanco();
                case 2 -> buscarBanco();
                case 3 -> listarBancos();
                case 4 -> cadastrarCliente();
                case 5 -> infoCliente();
                case 6 -> mostrarExtratoUsuario();
                case 7 -> simulacaoSaque();
                case 8 -> simulacaoDeposito();
                case 9 -> simulacaoTransferencia();
                case 10 -> listarContasBanco();
            }
        } while (opcao != 0);
    }

    private void criarBanco(){
        System.out.println("Nome do Banco:");
        String nome = scanner.nextLine();
        bancos.add(new Banco(nome));
        System.out.println("Banco " + nome + " criado!");
    }

    private Banco buscarBanco(){
        System.out.println("Nome do Banco:");
        String nome = scanner.nextLine();
        for (Banco banco : bancos) {
            if(banco.name.equals(nome)){
                return banco;
            }
        }
        System.out.println("Banco " + nome + " nao cadastrado!");
        return null;
    }

    private void listarBancos(){
        System.out.println("--- BANCOS CADASTRADOS ---");
        int i=0;
        for (Banco banco : bancos){
            System.out.println((i+1) + " - " + banco.name);
            i++;
        }
    }

    private void cadastrarCliente(){
        Banco banco = buscarBanco();
        if(banco == null){
            System.out.println("Banco nao existe!");
            return;
        }
        Cliente novoCliente = new Cliente(); // ver isso depois, write-only object;
        System.out.println("Nome: ");
        novoCliente.nome = scanner.nextLine();
        System.out.println("Endereco: ");
        novoCliente.endereco = scanner.nextLine();
        System.out.println("Saldo: ");
        novoCliente.saldo = scanner.nextDouble();
        System.out.println("Cliente Especial? (True / False): ");
        novoCliente.especial = scanner.nextBoolean();
        ContaCorrente novaCC = new ContaCorrente(novoCliente, banco);
    }

    private ContaCorrente buscarCliente(){ // busca pela contaCorrente do usuario;
        Banco banco = buscarBanco();
        if(banco == null){
            System.out.println("Banco nao existe!");
            return null;
        }
        System.out.println("Nome: ");
        String nomeCliente = scanner.nextLine();
        for (ContaCorrente conta : banco.contas) {
            if(conta.cliente.nome.equals(nomeCliente)){
                return conta;
            }
        }
        System.out.println("Cliente " + nomeCliente + " nao cadastrado!");
        return null;
    }

    private void infoCliente(){
        ContaCorrente contaCliente = buscarCliente();
        if(contaCliente == null){
            System.out.println("Cliente nao existe!");
            return;
        }
        contaCliente.mostrarInfo();
    }

    private void mostrarExtratoUsuario(){
        ContaCorrente cliente = buscarCliente();
        if(cliente == null){
            System.out.println("Operacao falhou!");
            return;
        }
        cliente.emitirExtrato();
    }

    private void simulacaoSaque(){
        ContaCorrente contaCliente = buscarCliente();
        if(contaCliente == null){
            System.out.println("Operacao falhou!");
            return;
        }
        System.out.println("Valor a ser resgatado: ");
        double valor = scanner.nextDouble();
        contaCliente.sacar(valor);
    }

    private void simulacaoDeposito(){
        ContaCorrente contaCliente = buscarCliente();
        if(contaCliente == null){
            System.out.println("Operacao falhou!");
            return;
        }
        System.out.println("Valor a ser depositado: ");
        double valor = scanner.nextDouble();
        contaCliente.depositar(valor);
    }

    private void simulacaoTransferencia(){
        System.out.println("Dados conta 1 (conta que vai transferir): ");
        ContaCorrente contaCliente1 = buscarCliente();
        if(contaCliente1 == null){
            System.out.println("Operacao falhou!");
            return;
        }
        System.out.println("Dados conta 2 (conta que vai receber): ");
        ContaCorrente contaCliente2 = buscarCliente();
        if(contaCliente2 == null){
            System.out.println("Operacao falhou!");
            return;
        }

        System.out.println("Valor a ser transferido: ");
        double valor = scanner.nextDouble();
        contaCliente1.transferir(valor, contaCliente2);
    }

    private void listarContasBanco(){
        Banco banco = buscarBanco();
        if(banco == null){
            System.out.println("Banco nao existe!");
            return;
        }
        int i=0;
        for(ContaCorrente conta : banco.contas){
            System.out.println("Conta "+ (i+1) + ": " + conta.id + " - " + conta.cliente.nome);
            i++;
        }
    }
}
