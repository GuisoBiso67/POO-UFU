package Ex2;

public class NotificadorSMS implements Notificador{
    public String getTipo() {
        return "[SMS]: ";
    }
    public void enviar(String mensagem) {
        System.out.println(this.getTipo() + mensagem);
    }
}
