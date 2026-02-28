public class Main{
    public static void main(String[] args){
        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        c1.nome = "Guilherme";
        c1.saldo = 5000;
        c1.especial = true;
        c2.nome = "Sara";
        c2.saldo = 2500;
        c2.especial = false;

        System.out.println("-----------------------------");

        c1.emitirSaldo();
        c1.depositar(1000);
        c1.sacar(500);
        c1.tipoUsuario();
        c1.sacar(10000);

        System.out.println("-----------------------------");

        c2.emitirSaldo();
        c2.depositar(400);
        c2.sacar(50);
        c2.tipoUsuario();
        c2.sacar(10000);

        System.out.println("-----------------------------");

        c1.transferir(300,c2);
        c2.emitirSaldo();

        System.out.println("-----------------------------");

        c2.transferir(6000,c1);
    }
}