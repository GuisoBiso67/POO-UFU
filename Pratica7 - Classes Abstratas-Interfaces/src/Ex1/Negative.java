package Ex1;

public class Negative extends Expression{
    //private final Expression left;
    private final Expression right;
    public Negative(Expression right){
        //this.left = left;
        this.right = right;
    }
    public int evaluate(){
        return - (right.evaluate());
    }
    public String toString(){
        return String.format(" ( - %s ) ", this.right);
    }
}
