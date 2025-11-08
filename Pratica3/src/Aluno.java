import java.awt.*;
import java.util.ArrayList;

public class Aluno {
    String nome;
    String nMatricula;
    ArrayList<MatriculaAlunoDisciplina> matriculas;

    public Aluno (String nome, String numero) {
        this.nome = nome;
        this.nMatricula = numero;
        this.matriculas = new ArrayList<MatriculaAlunoDisciplina>();
    }

    void matricularEmDisciplina(Disciplina d) {
        MatriculaAlunoDisciplina matricula = new MatriculaAlunoDisciplina(this, d);
        matriculas.add(matricula);
        d.matricularAluno(matricula);
    }

    void adicionarNota(Disciplina d, double nota) {
        for (MatriculaAlunoDisciplina m : this.matriculas) {
            if (m.disciplina == d) {
                m.nota = nota;
                return;
            }
        }
        System.out.println("Aluno " + nome + " não está matriculado na disciplina " + d.nome);
    }

    void mostrarHistorico () {
        double soma = 0;
        int nMatr = 0;
        System.out.println("--- Historico de " + this.nome + " ---");
        for (MatriculaAlunoDisciplina m: this.matriculas) {
            soma += m.nota;
            nMatr++;
            System.out.println(m.disciplina.nome + " | Nota: " + m.nota + " | Situacao: " + m.situacao);
        }
        double media = soma / nMatr;
        System.out.printf("Media Geral: %.1f%n", media);
    }
}
