import java.util.ArrayList;

public class Professores {
    String departamento;
    ArrayList<Professor> professores;

    public Professores(String depart){
        this.departamento = depart;
        this.professores = new ArrayList<>();
    }

    void cadastrarProfessor(Professor p){
        this.professores.add(p);
    }

    void listarProfessoresDepartamento() {
        System.out.println("Professores do " + this.departamento);
        for (Professor p : this.professores) {
            System.out.println("Nome: " + p.nome + " | Faculdade: " + p.faculdade);
        }
    }
}
