public class MatriculaAlunoDisciplina {
    Aluno aluno;
    Disciplina disciplina;
    double nota;
    SituacaoDisciplina situacao;

    public MatriculaAlunoDisciplina (Aluno a, Disciplina d) {
        aluno = a;
        disciplina = d;
        situacao = SituacaoDisciplina.CURSANDO;
    }
}
