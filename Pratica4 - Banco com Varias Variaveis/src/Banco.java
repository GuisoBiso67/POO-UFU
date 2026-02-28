import java.util.ArrayList;

public class Banco {
    ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();

    void addContaCorrente(ContaCorrente conta){
        contas.add(conta);
    }

    void imprimirContas(){
        System.out.println("------ CONTAS ATIVAS ------");
        for(ContaCorrente conta : contas){
            System.out.println(conta.cliente.nome); // melhorar isso depois;
        }
        System.out.println("---------------------------");
    }
}
