import java.util.ArrayList;

public class PilhaSemGenerics {
    private ArrayList<Object> pilha;
    public PilhaSemGenerics(){
        this.pilha = new ArrayList<>();
    }

    public ArrayList<Object> getPilha() {
        return pilha;
    }

    public int isEmpty(){
        return pilha.size();
    }

    public void push(Object o){
        this.getPilha().addFirst(o);
    }

    public Object pop(){
        return this.getPilha().removeFirst();
    }

    public void print(){
        for (Object o : this.getPilha()){
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
