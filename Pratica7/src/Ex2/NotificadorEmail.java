package Ex2;

public class NotificadorEmail implements Notificador {
    public String getTipo() {
        return "[EMAIL]: ";
    }
    public void enviar(String mensagem) {
        System.out.println(this.getTipo() + mensagem);
    }
}
