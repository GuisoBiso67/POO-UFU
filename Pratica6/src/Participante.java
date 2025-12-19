public class Participante {
    private String nome;
    private Evento evento;

    public Participante (String n, Evento e) {
        nome = n;
        evento = e;
    }

    public String getCertificado () {
        return "Declaramos que " + nome + " participou do evento: " + evento.getNome();
    }

    public String getNome () {
        return nome;
    }
    
    public String getEvento () {
        return evento.getNome();
    }
}
