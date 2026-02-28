public class Pessoa {
    String nome;
    String telefone;
    String endereco;

    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    String getNome() {
        return nome;
    }
    String getTelefone() {
        return telefone;
    }
    String getEndereco() {
        return endereco;
    }
}
