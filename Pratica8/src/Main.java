public class Main{
    public static void main(String[] args){
        Agenda agenda = new Agenda();
        Pessoa p1 = new Pessoa("Guilherme", "00000", "Rua A");
        Pessoa p2 = new Pessoa("Ana", "11111", "Rua B");
        Pessoa p3 = new Pessoa("Caio", "22222", "Rua C");
        Pessoa p4 = new Pessoa("Sara", "33333", "Rua D");
        Pessoa p5 = new Pessoa("Marcio", "44444", "Rua E");

        agenda.addPessoa(p1);
        agenda.addPessoa(p2);
        agenda.addPessoa(p3);
        agenda.addPessoa(p4);
        agenda.addPessoa(p5);

        Interface interface1 = new Interface(agenda);
    }
}
