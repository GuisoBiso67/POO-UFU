package entities;
import operations.*;
import java.util.ArrayList;

public class Banco {
    public String name;
    public int quantClientes=0;
    public Banco (String name){this.name = name;};
    public ArrayList<ContaCorrente> contas = new ArrayList<>();

    public void addContaCorrente(ContaCorrente conta){
        contas.add(conta);
        quantClientes += 1;
    }
    public String getNome(){return name;}

    public void imprimirContas(){
        System.out.println("------ CONTAS ATIVAS ------");
        for(ContaCorrente conta : contas){
            System.out.println(conta.cliente.nome); // melhorar isso depois;
        }
        System.out.println("---------------------------");
    }
}
