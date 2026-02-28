public class Voluntario extends Participante{
    String atividadeAuxiliar;

    public Voluntario(String n, Evento e, String aa) {
        super(n, e);
        atividadeAuxiliar = aa;
    }

    public String getCertificado() {
        return super.getCertificado() + " e auxiliou no evento como " + atividadeAuxiliar;
    }
}
