package org.example;

import java.util.Scanner;

public class Atividade_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Programa Calculadora Avançada ====");

        while (true) {
            while (true) {
                System.out.println("\n=== Menu de opções ===");
                System.out.println("(1) Soma dos 100 primeiros números naturais");
                System.out.println("(2) Soma dos números pares de 1 a 500");
                System.out.println("(3) Números divisíveis por 4 menores que 200");
                System.out.println("(4) Potência de base 3, de expoente 0 até 14");
                System.out.println("(0) Sair");
                System.out.print("\nSua Escolha: ");
                int escolha = sc.nextInt();
                int i;
                int expoente;
                if (escolha == 1) {
                    i = 0;

                    for (expoente = 0; i <= 100; ++i) {
                        expoente += i;
                    }

                    System.out.println("A soma dos numeros Naturais de 0 a 100 é: " + expoente);
                } else if (escolha == 2) {
                    i = 0;
                    expoente = 0;

                    do {
                        if (i % 2 == 0) {
                            expoente += i;
                        }

                        ++i;
                    } while (i <= 500);

                    System.out.println("A soma dos números pares de 1 a 500 é: " + expoente);
                } else if (escolha != 3) {
                    if (escolha == 4) {
                        int base = 3;
                        System.out.println("Potências de base 3, de expoente 0 até 14:");

                        for (expoente = 0; expoente <= 14; ++expoente) {
                            double resultado = Math.pow((double) base, (double) expoente);
                            System.out.println("3 elevado a " + expoente + " = " + resultado);
                        }
                    } else {
                        if (escolha == 0) {
                            System.out.println("Encerando programa...");
                            return;
                        }

                        System.out.println("Opção invalida");
                    }
                } else {
                    System.out.println("Os números divisíveis por 4 menores que 200 são: ");
                    System.out.println("[ ");

                    for (i = 0; i < 200; ++i) {
                        if (i % 4 == 0) {
                            System.out.println("" + i + ", ");
                        }
                    }

                    System.out.print("]");
                }
            }
        }
    }
}
