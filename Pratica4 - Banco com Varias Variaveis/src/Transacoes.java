public class Transacoes {
    String acao;
    ContaCorrente contaCorrente;
    double valor;
    String data;

    public Transacoes(String acao, ContaCorrente contaCorrente, double valor, String data) {
        this.acao = acao;
        this.contaCorrente = contaCorrente;
        this.valor = valor;
        this.data = data;
    }

    void formatarMensagem(){
        System.out.println("Usuario " + contaCorrente.id + " " + acao + " " + valor + " | " + data);
    }
}
