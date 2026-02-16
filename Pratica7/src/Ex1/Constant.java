package Ex1;

public class Constant extends Expression {
    private int value;
    public Constant(int value){
        this.value = value;
    }
    public int evaluate(){
        return this.value;
    }
    public String toString(){
        return String.format(" %d ", this.value);
    }
}
