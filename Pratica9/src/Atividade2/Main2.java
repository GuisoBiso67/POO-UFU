package Atividade2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Conta c1 = new Conta(5000);
        double deposito, saque;

        System.out.println("Valor para deposito: ");
        deposito = input.nextDouble();
        c1.depositar(deposito);

        System.out.println("Valor para saque: ");
        saque = input.nextDouble();
        c1.sacar(saque);

        System.out.println("Saldo restante: " + c1.getSaldo());
    }
}