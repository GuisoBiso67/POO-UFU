import java.util.ArrayList;

public class Agenda {
    ArrayList<Pessoa> agenda;

    public Agenda() {
        this.agenda = new ArrayList<Pessoa>();
    }

    public void addPessoa(Pessoa p){
        this.agenda.add(p);
    }

    public ArrayList<Pessoa> getAgenda() {
        return agenda;
    }
}
