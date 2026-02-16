package Ex1;

public class Addition extends Expression{
    private final Expression left;
    private final Expression right;
    public Addition(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    public int evaluate(){
        return left.evaluate() + right.evaluate();
    }
    public String toString(){
        return String.format(" (%s + %s)", this.left, this.right);
    }
}
