public class Main{
    public static void main(String[] args){
        Banco banco = new Banco();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        c1.nome = "Guilherme";
        c1.saldo = 5000;
        c1.especial = true;
        c2.nome = "Sara";
        c2.saldo = 2500;
        c2.especial = false;
        ContaCorrente cc1 = new ContaCorrente(c1, banco);
        ContaCorrente cc2 = new ContaCorrente(c2, banco);

        System.out.println("-----------------------------");

        cc1.emitirSaldo();
        cc1.depositar(1000);
        cc1.sacar(500);
        cc1.tipoUsuario();
        cc1.sacar(10000);

        System.out.println("-----------------------------");

        cc2.emitirSaldo();
        cc2.depositar(400);
        cc2.sacar(50);
        cc2.tipoUsuario();
        cc2.sacar(10000);

        System.out.println("-----------------------------");

        cc1.transferir(300,cc2);
        cc2.emitirSaldo();

        System.out.println("-----------------------------");

        cc2.transferir(6000,cc1);
        cc1.emitirExtrato();
        cc2.emitirExtrato();
        banco.imprimirContas();
    }
}