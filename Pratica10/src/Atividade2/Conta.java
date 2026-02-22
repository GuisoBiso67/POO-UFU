package Atividade2;

public class Conta {
    double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Valor negativo!");
        }else{
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        try{
            ValidadorSaldo.verificarSaldo(valor, this.saldo);
            this.saldo -= valor;
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
