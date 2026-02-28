import java.util.ArrayList;

public class Ouvinte extends Participante {
    private ArrayList<String> palestrasAssistidas;

    public Ouvinte (String n, Evento e) {
        super(n, e);
        palestrasAssistidas = new ArrayList<String>();
    }
    public void addPalestra (String p) {
        palestrasAssistidas.add(p);
    }

    @Override
    public String getCertificado() {
        return super.getCertificado() + " e assistiu as seguintes palestras: " + getPalestras();
    }

    private String getPalestras () {
        String palestras = "";
        for (String p: palestrasAssistidas) {
            palestras += p + "; ";
        }
        return palestras;
    }
}
