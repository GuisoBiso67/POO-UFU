package Ex2;

public class NotificadorPush implements Notificador{
    public String getTipo() {
        return "[PUSH]: ";
    }
    public void enviar(String mensagem) {
        System.out.println(this.getTipo() + mensagem);
    }
}
