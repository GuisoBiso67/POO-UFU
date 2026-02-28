package Atividade1;

import java.util.Scanner;

import static Atividade1.ValidadorDeIdade.verificarMaioridade;

public class ProgramaCadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Seu nome: ");
        String nome = input.nextLine();
        System.out.print("Sua idade: ");
        int idade = Integer.parseInt(input.nextLine());
        try{
            ValidadorDeIdade.verificarMaioridade(idade);
            System.out.println(nome + ", seu cadastro foi realizado com sucesso!");
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
