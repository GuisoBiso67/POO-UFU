package Ex2;

public class Teste {
    public static void main(String[] args) {
        NotificadorEmail notificador1 = new NotificadorEmail();
        notificador1.enviar("Problema Indentificado no Gerador 1");
        NotificadorSMS notificador2 = new NotificadorSMS();
        notificador2.enviar("Problema Indentificado no Gerador 1");
        NotificadorPush notificador3 = new NotificadorPush();
        notificador3.enviar("Problema Indentificado no Gerador 1");

        ServicoAlerta notificador1a = new ServicoAlerta(notificador1);
        ServicoAlerta notificador2a = new ServicoAlerta(notificador2);
        ServicoAlerta notificador3a = new ServicoAlerta(notificador3);
        notificador1a.alertaCritico("Problema Indentificado no Gerador 1");
        notificador2a.alertaCritico("Problema Indentificado no Gerador 1");
        notificador3a.alertaCritico("Problema Indentificado no Gerador 1");
    }
}
