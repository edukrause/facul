package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = scan.nextLine();

        if (nome.isEmpty()) {
            System.out.println("Nulo não otario");
            System.exit(0);
        }
        System.out.println("Ola " + nome + "\nInforme a operacao que deseja \n1_Para consultar o saldo " +
                "\n2_Para impressao de extrato \n3_Para Sair");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println("Seu saldo é R$8,74");
        } else {
            if (opcao == 2) {
                System.out.println("Extrato\nR$4,79 \ndia 30/02/2030");
            } else if (opcao == 3) {
                System.out.println("Tchau");
                System.exit(0);
            } else {
                System.out.println("opcao invalida");
            }
        }
    }
}

