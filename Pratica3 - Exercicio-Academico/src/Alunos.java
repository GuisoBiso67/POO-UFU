import java.util.ArrayList;

public class Alunos {
    ArrayList<Aluno> alunos;

    public Alunos(){
        this.alunos = new ArrayList<>();
    }

    void cadastrarAluno(Aluno al) {
        this.alunos.add(al);
    }

    public void listarTodosOsAlunos() {
        System.out.println("--- Lista de Todos os Alunos ---");
        for (Aluno a : this.alunos) {
            System.out.println("Nome: " + a.nome + " | Matrícula: " + a.nMatricula);
        }
    }

}
