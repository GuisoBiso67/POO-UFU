import java.util.*;

public class Organizador extends Participante{

    public Organizador(String n, Evento e){
        super(n,e);
    }

    public String getCertificado(){
        return super.getNome() + " organizou o evento " + super.getEvento();
    }
}
