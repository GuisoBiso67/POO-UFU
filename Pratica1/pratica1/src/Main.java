import javax.swing.*;
class Pessoa {
    String nome;
    double peso, altura;

    double calcIMC(){
        return peso / (altura*altura);
    }

    String avalIMC(){
        double imc = calcIMC();
        if(imc < 18.5)
            return "abaixo do peso!";
        if(imc <= 25)
            return "com peso normal!";
        if(imc <= 30)
            return "acima do peso";
        return "obeso!";
    }
}

class Main {
    public static void main (String args[]){
        Pessoa p1 = new Pessoa();
        p1.nome = JOptionPane.showInputDialog("Entre com seu nome");
        p1.altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com sua altura"));
        p1.peso = Double.parseDouble(JOptionPane.showInputDialog("Entre com seu peso"));
        JOptionPane.showMessageDialog(null, ""+ p1.nome + ", seu IMC = " + p1.calcIMC());
        JOptionPane.showMessageDialog(null, "Isso signifca que voce estah " + p1.avalIMC());

        Pessoa p2 = new Pessoa();
        p2.nome = JOptionPane.showInputDialog("Entre com seu nome");
        p2.altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com sua altura"));
        p2.peso = Double.parseDouble(JOptionPane.showInputDialog("Entre com seu peso"));
        JOptionPane.showMessageDialog(null, ""+ p2.nome + ", seu IMC = " + p2.calcIMC());
        JOptionPane.showMessageDialog(null, "Isso signifca que voce estah " + p2.avalIMC());

        /*
         * acho que o apropriado seria criar um classe imc para armazenar esses cálculos e comparações envolvendo peso e altura;
         * */
        if(p1.calcIMC() > p2.calcIMC())
            JOptionPane.showMessageDialog(null, ""+ p1.nome + "eh mais obeso que " + p2.nome);
        else
            JOptionPane.showMessageDialog(null, ""+ p2.nome + " eh mais obeso(a) que " + p1.nome);
    }
}