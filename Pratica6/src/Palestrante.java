public class Palestrante extends Participante {
    private String tituloPalestra;

    public Palestrante (String n, Evento e, String p) {
        super(n,e);
        tituloPalestra = p;
    }

    @Override
    public String getCertificado() {
        return super.getCertificado() + " tendo ministrado a palestra intitulada: "
                + tituloPalestra;
    }
    public String getTituloPalestra () {
        return tituloPalestra;
    }
}
