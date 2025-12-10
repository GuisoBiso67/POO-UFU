//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Professores profsFACOM = new Professores("FACOM");
        // professores FACOM
        Disciplina d1c = new Disciplina("POO", "Programacao Orientada a Objetos");
        Disciplina d2c = new Disciplina("AEDI", "Algoritmos e Estruturas de Dados I");
        Professor p1c = new Professor("Marcelo Maia", "FACOM");
        profsFACOM.cadastrarProfessor(p1c);
        d1c.associarProfessor(p1c);
        d2c.associarProfessor(p1c);


        Disciplina d3c = new Disciplina("BD", "Banco de Dados");
        Disciplina d4c = new Disciplina("ES", "Engenharia de Software");
        Professor p2c = new Professor("Joao Victor Pereira", "FACOM");
        profsFACOM.cadastrarProfessor(p2c);
        d3c.associarProfessor(p2c);
        d4c.associarProfessor(p2c);

        Disciplina d5c = new Disciplina("AEDII", "Algoritmos e Estruturas de Dados II");
        Disciplina d6c = new Disciplina("SO", "Sistemas Operacionais");
        Professor p3c = new Professor("Rafael Tavares", "FACOM");
        profsFACOM.cadastrarProfessor(p3c);
        d5c.associarProfessor(p3c);
        d6c.associarProfessor(p3c);

        Disciplina d7c = new Disciplina("RC", "Redes de Computadores");
        Disciplina d8c = new Disciplina("SI", "Segurança da Informacao");
        Professor p4c = new Professor("Lucia Almeida", "FACOM");
        profsFACOM.cadastrarProfessor(p4c);
        d7c.associarProfessor(p4c);
        d8c.associarProfessor(p4c);

        Disciplina d9c = new Disciplina("IA", "Inteligencia Artificial");
        Professor p5c = new Professor("Felipe Rocha", "FACOM");
        profsFACOM.cadastrarProfessor(p5c);
        d9c.associarProfessor(p5c);

        Disciplina d10c = new Disciplina("PF", "Programacao Funcional");
        Professor p6c = new Professor("Gustavo Nogueira", "FACOM");
        profsFACOM.cadastrarProfessor(p6c);
        d10c.associarProfessor(p6c);

        Disciplina d11c = new Disciplina("LP", "Logica de Programacao");
        Professor p7c = new Professor("Daniela Monteiro", "FACOM");
        profsFACOM.cadastrarProfessor(p7c);
        d11c.associarProfessor(p7c);

        Professores profsIME = new Professores("IME");
        // professores IME
        Disciplina d1m = new Disciplina("C1", "Calculo I");
        Disciplina d2m = new Disciplina("AL", "Algebra Linear");
        Professor p1m = new Professor("Ana Beatriz Souza", "IME");
        profsIME.cadastrarProfessor(p1m);
        d1m.associarProfessor(p1m);
        d2m.associarProfessor(p1m);

        Disciplina d3m = new Disciplina("GA", "Geometria Analitica");
        Disciplina d4m = new Disciplina("C2", "Calculo II");
        Professor p2m = new Professor("Luiza Carvalho", "IME");
        profsIME.cadastrarProfessor(p2m);
        d3m.associarProfessor(p2m);
        d4m.associarProfessor(p2m);

        Disciplina d5m = new Disciplina("CN", "Calculo Numerico");
        Professor p3m = new Professor("Alessandro Alves", "IME");
        profsIME.cadastrarProfessor(p3m);
        d5m.associarProfessor(p3m);

        Disciplina d6m = new Disciplina("MD", "Matematica Discreta");
        Professor p4m = new Professor("Marcio Colombo", "IME");
        profsIME.cadastrarProfessor(p4m);
        d6m.associarProfessor(p4m);

        Disciplina d7m = new Disciplina("C3", "Calculo III");
        Professor p5m = new Professor("Juliana Ribeiro", "IME");
        profsIME.cadastrarProfessor(p5m);
        d7m.associarProfessor(p5m);

        Disciplina d8m = new Disciplina("MA", "Matematica Aplicada");
        Professor p6m = new Professor("Patricia Silva", "IME");
        profsIME.cadastrarProfessor(p6m);
        d8m.associarProfessor(p6m);

        profsFACOM.listarProfessoresDepartamento();
        profsIME.listarProfessoresDepartamento();

        Alunos listaAlunos = new Alunos();

        Aluno a1 = new Aluno("Guilherme Santos", "12421BCC001");
        listaAlunos.cadastrarAluno(a1);
        Aluno a2 = new Aluno("Ana Beatriz Souza", "12421MAT002");
        listaAlunos.cadastrarAluno(a2);
        Aluno a3 = new Aluno("Lucas Almeida", "12421BCC003");
        listaAlunos.cadastrarAluno(a3);
        Aluno a4 = new Aluno("Mariana Costa", "12421MAT004");
        listaAlunos.cadastrarAluno(a4);
        Aluno a5 = new Aluno("João Victor Pereira", "12421BCC005");
        listaAlunos.cadastrarAluno(a5);
        Aluno a6 = new Aluno("Isabela Torres", "12421MAT006");
        listaAlunos.cadastrarAluno(a6);
        Aluno a7 = new Aluno("Rafael Tavares", "12421BCC007");
        listaAlunos.cadastrarAluno(a7);
        Aluno a8 = new Aluno("Camila Duarte", "12421MAT008");
        listaAlunos.cadastrarAluno(a8);
        Aluno a9 = new Aluno("Pedro Henrique Silva", "12421BCC009");
        listaAlunos.cadastrarAluno(a9);
        Aluno a10 = new Aluno("Fernanda Lima", "12421MAT010");
        listaAlunos.cadastrarAluno(a10);
        Aluno a11 = new Aluno("Bruno Oliveira", "12421BCC011");
        listaAlunos.cadastrarAluno(a11);
        Aluno a12 = new Aluno("Juliana Ribeiro", "12421MAT012");
        listaAlunos.cadastrarAluno(a12);
        Aluno a13 = new Aluno("Daniel Monteiro", "12421BCC013");
        listaAlunos.cadastrarAluno(a13);
        Aluno a14 = new Aluno("Sofia Martins", "12421MAT014");
        listaAlunos.cadastrarAluno(a14);
        Aluno a15 = new Aluno("André Fernandes", "12421BCC015");
        listaAlunos.cadastrarAluno(a15);
        Aluno a16 = new Aluno("Patrícia Silva", "12421MAT016");
        listaAlunos.cadastrarAluno(a16);
        Aluno a17 = new Aluno("Gustavo Nogueira", "12421BCC017");
        listaAlunos.cadastrarAluno(a17);
        Aluno a18 = new Aluno("Carolina Mendes", "12421MAT018");
        listaAlunos.cadastrarAluno(a18);
        Aluno a19 = new Aluno("Felipe Rocha", "12421BCC019");
        listaAlunos.cadastrarAluno(a19);
        Aluno a20 = new Aluno("Luiza Carvalho", "12421MAT020");
        listaAlunos.cadastrarAluno(a20);
        Aluno a21 = new Aluno("Eduardo Pires", "12421BCC021");

        listaAlunos.listarTodosOsAlunos();
        // --- Aluno 1: Guilherme Santos (BCC) ---
        a1.matricularEmDisciplina(d1c); // POO (FACOM)
        a1.matricularEmDisciplina(d2c); // AEDI (FACOM)
        a1.matricularEmDisciplina(d1m); // Calculo I (IME)
        a1.matricularEmDisciplina(d2m); // Algebra Linear (IME)
        a1.adicionarNota(d1c, 8.5);
        a1.adicionarNota(d2c, 7.8);
        a1.adicionarNota(d1m, 9.0);
        a1.adicionarNota(d2m, 6.5);
        a1.mostrarHistorico();

        // --- Aluno 2: Ana Beatriz Souza (MAT) ---
        a2.matricularEmDisciplina(d1m); // Calculo I (IME)
        a2.matricularEmDisciplina(d2m); // Algebra Linear (IME)
        a2.matricularEmDisciplina(d3m); // Geometria Analitica (IME)
        a2.matricularEmDisciplina(d4m); // Calculo II (IME)
        a2.adicionarNota(d1m, 9.2);
        a2.adicionarNota(d2m, 8.1);
        a2.adicionarNota(d3m, 7.5);
        a2.adicionarNota(d4m, 9.8);
        a2.mostrarHistorico();

        // --- Aluno 3: Lucas Almeida (BCC) ---
        a3.matricularEmDisciplina(d3c); // Banco de Dados (FACOM)
        a3.matricularEmDisciplina(d4c); // Engenharia de Software (FACOM)
        a3.matricularEmDisciplina(d1m); // Calculo I (IME)
        a3.matricularEmDisciplina(d6m); // Matematica Discreta (IME)
        a3.adicionarNota(d3c, 7.0);
        a3.adicionarNota(d4c, 8.2);
        a3.adicionarNota(d1m, 5.5);
        a3.adicionarNota(d6m, 6.8);
        a3.mostrarHistorico();

        // --- Aluno 4: Mariana Costa (MAT) ---
        a4.matricularEmDisciplina(d5m); // Calculo Numerico (IME)
        a4.matricularEmDisciplina(d6m); // Matematica Discreta (IME)
        a4.matricularEmDisciplina(d7m); // Calculo III (IME)
        a4.matricularEmDisciplina(d8m); // Matematica Aplicada (IME)
        a4.adicionarNota(d5m, 8.4);
        a4.adicionarNota(d6m, 9.1);
        a4.adicionarNota(d7m, 7.3);
        a4.adicionarNota(d8m, 6.9);
        a4.mostrarHistorico();

        // --- Aluno 5: João Victor Pereira (BCC) ---
        a5.matricularEmDisciplina(d1c); // POO (FACOM)
        a5.matricularEmDisciplina(d5c); // AEDII (FACOM)
        a5.matricularEmDisciplina(d7c); // Redes de Computadores (FACOM)
        a5.matricularEmDisciplina(d3m); // Geometria Analitica (IME)
        a5.adicionarNota(d1c, 9.5);
        a5.adicionarNota(d5c, 8.0);
        a5.adicionarNota(d7c, 7.2);
        a5.adicionarNota(d3m, 6.1);
        a5.mostrarHistorico();

        // --- Aluno 6: Isabela Torres (MAT) ---
        a6.matricularEmDisciplina(d1m); // Calculo I (IME)
        a6.matricularEmDisciplina(d3m); // Geometria Analitica (IME)
        a6.matricularEmDisciplina(d5m); // Calculo Numerico (IME)
        a6.matricularEmDisciplina(d7m); // Calculo III (IME)
        a6.adicionarNota(d1m, 8.0);
        a6.adicionarNota(d3m, 7.5);
        a6.adicionarNota(d5m, 9.0);
        a6.adicionarNota(d7m, 8.2);
        a6.mostrarHistorico();

        // --- Aluno 7: Rafael Tavares (BCC) ---
        a7.matricularEmDisciplina(d6c); // Sistemas Operacionais (FACOM)
        a7.matricularEmDisciplina(d9c); // Inteligencia Artificial (FACOM)
        a7.matricularEmDisciplina(d1m); // Calculo I (IME)
        a7.matricularEmDisciplina(d6m); // Matematica Discreta (IME)
        a7.adicionarNota(d6c, 9.8);
        a7.adicionarNota(d9c, 8.5);
        a7.adicionarNota(d1m, 7.0);
        a7.adicionarNota(d6m, 8.8);
        a7.mostrarHistorico();

        // --- Aluno 8: Camila Duarte (MAT) ---
        a8.matricularEmDisciplina(d2m); // Algebra Linear (IME)
        a8.matricularEmDisciplina(d4m); // Calculo II (IME)
        a8.matricularEmDisciplina(d6m); // Matematica Discreta (IME)
        a8.matricularEmDisciplina(d8m); // Matematica Aplicada (IME)
        a8.adicionarNota(d2m, 6.7);
        a8.adicionarNota(d4m, 8.3);
        a8.adicionarNota(d6m, 9.4);
        a8.adicionarNota(d8m, 7.6);
        a8.mostrarHistorico();

        // --- Aluno 9: Pedro Henrique Silva (BCC) ---
        a9.matricularEmDisciplina(d10c); // Programacao Funcional (FACOM)
        a9.matricularEmDisciplina(d11c); // Logica de Programacao (FACOM)
        a9.matricularEmDisciplina(d2c); // AEDI (FACOM)
        a9.matricularEmDisciplina(d1m); // Calculo I (IME)
        a9.adicionarNota(d10c, 10.0);
        a9.adicionarNota(d11c, 9.5);
        a9.adicionarNota(d2c, 8.0);
        a9.adicionarNota(d1m, 8.5);
        a9.mostrarHistorico();

        // --- Aluno 10: Fernanda Lima (MAT) ---
        a10.matricularEmDisciplina(d1m); // Calculo I (IME)
        a10.matricularEmDisciplina(d2m); // Algebra Linear (IME)
        a10.matricularEmDisciplina(d7m); // Calculo III (IME)
        a10.matricularEmDisciplina(d8m); // Matematica Aplicada (IME)
        a10.adicionarNota(d1m, 5.0);
        a10.adicionarNota(d2m, 6.5);
        a10.adicionarNota(d7m, 7.0);
        a10.adicionarNota(d8m, 8.1);
        a10.mostrarHistorico();

        // --- Aluno 11: Bruno Oliveira (BCC) ---
        a11.matricularEmDisciplina(d1c); // POO (FACOM)
        a11.matricularEmDisciplina(d3c); // Banco de Dados (FACOM)
        a11.matricularEmDisciplina(d5c); // AEDII (FACOM)
        a11.matricularEmDisciplina(d1m); // Calculo I (IME)
        a11.adicionarNota(d1c, 8.9);
        a11.adicionarNota(d3c, 7.7);
        a11.adicionarNota(d5c, 6.9);
        a11.adicionarNota(d1m, 7.2);
        a11.mostrarHistorico();

        // --- Aluno 12: Juliana Ribeiro (MAT) ---
        a12.matricularEmDisciplina(d2m); // Algebra Linear (IME)
        a12.matricularEmDisciplina(d3m); // Geometria Analitica (IME)
        a12.matricularEmDisciplina(d4m); // Calculo II (IME)
        a12.matricularEmDisciplina(d5m); // Calculo Numerico (IME)
        a12.adicionarNota(d2m, 9.0);
        a12.adicionarNota(d3m, 8.0);
        a12.adicionarNota(d4m, 9.5);
        a12.adicionarNota(d5m, 8.8);
        a12.mostrarHistorico();

        // --- Aluno 13: Daniel Monteiro (BCC) ---
        a13.matricularEmDisciplina(d8c); // Segurança da Informacao (FACOM)
        a13.matricularEmDisciplina(d7c); // Redes de Computadores (FACOM)
        a13.matricularEmDisciplina(d2c); // AEDI (FACOM)
        a13.matricularEmDisciplina(d6m); // Matematica Discreta (IME)
        a13.adicionarNota(d8c, 7.4);
        a13.adicionarNota(d7c, 8.1);
        a13.adicionarNota(d2c, 9.0);
        a13.adicionarNota(d6m, 6.3);
        a13.mostrarHistorico();

        // --- Aluno 14: Sofia Martins (MAT) ---
        a14.matricularEmDisciplina(d6m); // Matematica Discreta (IME)
        a14.matricularEmDisciplina(d7m); // Calculo III (IME)
        a14.matricularEmDisciplina(d8m); // Matematica Aplicada (IME)
        a14.matricularEmDisciplina(d1m); // Calculo I (IME)
        a14.adicionarNota(d6m, 9.6);
        a14.adicionarNota(d7m, 8.7);
        a14.adicionarNota(d8m, 7.9);
        a14.adicionarNota(d1m, 8.0);
        a14.mostrarHistorico();

        // --- Aluno 15: André Fernandes (BCC) ---
        a15.matricularEmDisciplina(d1c); // POO (FACOM)
        a15.matricularEmDisciplina(d4c); // Engenharia de Software (FACOM)
        a15.matricularEmDisciplina(d9c); // Inteligencia Artificial (FACOM)
        a15.matricularEmDisciplina(d2m); // Algebra Linear (IME)
        a15.adicionarNota(d1c, 6.0);
        a15.adicionarNota(d4c, 7.5);
        a15.adicionarNota(d9c, 8.8);
        a15.adicionarNota(d2m, 9.1);
        a15.mostrarHistorico();

        // --- Aluno 16: Patrícia Silva (MAT) ---
        a16.matricularEmDisciplina(d1m); // Calculo I (IME)
        a16.matricularEmDisciplina(d2m); // Algebra Linear (IME)
        a16.matricularEmDisciplina(d3m); // Geometria Analitica (IME)
        a16.matricularEmDisciplina(d5m); // Calculo Numerico (IME)
        a16.adicionarNota(d1m, 7.3);
        a16.adicionarNota(d2m, 8.4);
        a16.adicionarNota(d3m, 9.2);
        a16.adicionarNota(d5m, 6.7);
        a16.mostrarHistorico();

        // --- Aluno 17: Gustavo Nogueira (BCC) ---
        a17.matricularEmDisciplina(d10c); // Programacao Funcional (FACOM)
        a17.matricularEmDisciplina(d11c); // Logica de Programacao (FACOM)
        a17.matricularEmDisciplina(d1m); // Calculo I (IME)
        a17.matricularEmDisciplina(d2m); // Algebra Linear (IME)
        a17.adicionarNota(d10c, 8.6);
        a17.adicionarNota(d11c, 9.3);
        a17.adicionarNota(d1m, 7.1);
        a17.adicionarNota(d2m, 8.0);
        a17.mostrarHistorico();

        // --- Aluno 18: Carolina Mendes (MAT) ---
        a18.matricularEmDisciplina(d4m); // Calculo II (IME)
        a18.matricularEmDisciplina(d6m); // Matematica Discreta (IME)
        a18.matricularEmDisciplina(d7m); // Calculo III (IME)
        a18.matricularEmDisciplina(d8m); // Matematica Aplicada (IME)
        a18.adicionarNota(d4m, 9.9);
        a18.adicionarNota(d6m, 8.9);
        a18.adicionarNota(d7m, 7.9);
        a18.adicionarNota(d8m, 6.9);
        a18.mostrarHistorico();

        // --- Aluno 19: Felipe Rocha (BCC) ---
        a19.matricularEmDisciplina(d1c); // POO (FACOM)
        a19.matricularEmDisciplina(d2c); // AEDI (FACOM)
        a19.matricularEmDisciplina(d5c); // AEDII (FACOM)
        a19.matricularEmDisciplina(d6c); // Sistemas Operacionais (FACOM)
        a19.adicionarNota(d1c, 7.0);
        a19.adicionarNota(d2c, 8.3);
        a19.adicionarNota(d5c, 9.1);
        a19.adicionarNota(d6c, 6.6);
        a19.mostrarHistorico();

        // --- Aluno 20: Luiza Carvalho (MAT) ---
        a20.matricularEmDisciplina(d1m); // Calculo I (IME)
        a20.matricularEmDisciplina(d3m); // Geometria Analitica (IME)
        a20.matricularEmDisciplina(d4m); // Calculo II (IME)
        a20.matricularEmDisciplina(d8m); // Matematica Aplicada (IME)
        a20.adicionarNota(d1m, 10.0);
        a20.adicionarNota(d3m, 9.0);
        a20.adicionarNota(d4m, 8.0);
        a20.adicionarNota(d8m, 7.0);
        a20.mostrarHistorico();

        d1c.listarNotas();
        d1c.mediaNotas();
    }
}