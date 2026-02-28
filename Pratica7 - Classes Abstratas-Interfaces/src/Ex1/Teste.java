package Ex1;

public class Teste {
    public static void main(String[] args) {
        Constant c1 = new Constant(8);
        Constant c2 = new Constant(3);
        Constant c3 = new Constant(7);
        Constant c4 = new Constant(4);

        Addition a1 = new Addition(c1, c2);
        Multiplication m1 = new Multiplication(c3, c4);
        Negative n1 = new Negative(m1);
        Subtraction s1 = new Subtraction(a1, n1);
        System.out.println(s1.toString() + " = " + s1.evaluate());
    }
}
