import java.util.ArrayList;

public class Disciplina {
    String codigo;
    String nome;
    Professor professor;
    ArrayList<MatriculaAlunoDisciplina> alunosMatriculados;
    public Disciplina (String c, String n) {
        codigo = c;
        nome = n;
        alunosMatriculados = new ArrayList<MatriculaAlunoDisciplina>();
    }
    void matricularAluno (MatriculaAlunoDisciplina matr) {
        alunosMatriculados.add(matr);
    }
    void associarProfessor (Professor p) {
        this.professor = p;
    }

    void listarNotas () {
        System.out.println("Listagem da disciplina: " + this.codigo + ": " + this.nome);
        System.out.println("Professor: " + professor.nome);
        for (MatriculaAlunoDisciplina m: alunosMatriculados) {
            System.out.println(m.aluno.nome + " | " + m.nota);
        }
    }

    void mediaNotas () {
        double soma=0;
        int nAlunos=0;
        for(MatriculaAlunoDisciplina m: alunosMatriculados) {
            soma += m.nota;
            nAlunos++;
        }
        double media = soma / nAlunos;
        System.out.printf("Media da disciplina: %.1f%n", media);
    }
}
