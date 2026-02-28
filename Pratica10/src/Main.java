import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        PilhaSemGenerics p1 = new PilhaSemGenerics();
        ArrayList<Integer> array = new ArrayList();
        for(int i =0; i<10; i++){
            array.add(i);
        }
        for(int i =0; i<10; i++){
            p1.push(array.get(i));
        }
        Integer valor = (Integer) p1.pop();
        System.out.println("O valor desempilhado é: " + valor);
        p1.push("Texto");
        Integer erro = (Integer) p1.pop();
        System.out.println("O valor desempilhado é: " + erro);
        //p1.print();
        */

        PilhaComGenerics<Integer> p1 = new PilhaComGenerics<>();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i =0; i<10; i++){
            array.add(i);
        }
        for(int i =0; i<10; i++){
            p1.push(array.get(i));
        }
        Integer valor = (Integer) p1.pop();
        System.out.println("O valor desempilhado é: " + valor);
        p1.push("Texto");
        Integer erro = (Integer) p1.pop();
        System.out.println("O valor desempilhado é: " + erro);
    }
}
