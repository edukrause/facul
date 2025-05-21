package org.example;

import java.io.PrintStream;
import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Programa do Cofre ====");
        double saldo = 0.0;
        int interacoes = 1;
        double maiorValor = 0.0;

        while (true) {
            System.out.println("Hoje é dia " + interacoes);
            PrintStream var10000 = System.out;
            Object[] var10002 = new Object[]{saldo};
            var10000.println("Seu saldo é: " + String.format("%.2f", var10002));
            System.out.print("Informe o deposito: ");
            double deposito = sc.nextDouble();
            if (deposito < 0.0) {
                --interacoes;
                deposito = maiorValor / (double) interacoes;
                var10000 = System.out;
                var10002 = new Object[]{saldo};
                var10000.println("Foram economizados: " + String.format("%.2f", var10002));
                System.out.println("Foram feitos: " + interacoes + " depositos.");
                var10000 = System.out;
                var10002 = new Object[]{deposito};
                var10000.println("Uma media de: " + String.format("%.2f", var10002) + " de valor de deposito por dia.");
                var10000 = System.out;
                var10002 = new Object[]{maiorValor};
                var10000.println("O maior valor de deposito foi: " + String.format("%.2f", var10002));
                return;
            }

            saldo += deposito;
            if (deposito >= maiorValor) {
                maiorValor = deposito;
            }

            ++interacoes;
        }
    }
}