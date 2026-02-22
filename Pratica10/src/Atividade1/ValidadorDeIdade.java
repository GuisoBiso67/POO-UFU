package Atividade1;

public class ValidadorDeIdade {
    public static void verificarMaioridade(int idade) throws IdadeInvalidaException{
        if(idade < 18){
            throw new IdadeInvalidaException("Idade minima para cadastro eh 18 anos.");
        }
    }
}
