package Atividade2;

public class ValidadorSaldo {
    public static void verificarSaldo(double valor, double valorDisponivel) throws SaldoInsuficienteException {
        if(valor > valorDisponivel) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
    }
}
