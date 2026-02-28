package Ex2;

public class ServicoAlerta {
    private final Notificador notificador;

    public ServicoAlerta(Notificador n) {
        this.notificador = n;
    }

    void alertaCritico(String mensagem){
        String prefix = notificador.getTipo();
        System.out.println(prefix + "!ALERTA CRITICO!: " + mensagem);
    }
}
