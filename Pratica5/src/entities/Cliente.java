package entities;

public class Cliente {
    public String nome;
    public double saldo; // saldo nao pode ser publico, melhor usar uma função "get", depois faço isso
    public boolean especial;
    public String endereco;
}
