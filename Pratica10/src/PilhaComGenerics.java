import java.util.ArrayList;

public class PilhaComGenerics<T> {
    private ArrayList<T> pilha;
    public PilhaComGenerics(){
        this.pilha = new ArrayList<T>();
    }

    public ArrayList<T> getPilha() {
        return pilha;
    }

    public int isEmpty(){
        return pilha.size();
    }

    public void push(T t){
        this.getPilha().addFirst(t);
    }

    public T pop(){
        return this.getPilha().removeFirst();
    }

    public void print(){
        for (T t : this.getPilha()){
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
