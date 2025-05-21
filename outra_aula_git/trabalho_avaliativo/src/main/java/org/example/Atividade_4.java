package org.example;

import java.io.PrintStream;
import java.util.Scanner;

public class Atividade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Programa Loja de Doces ====");
        int totalVendas = 0;
        int quantidadeDeDoces = 0;
        double montanteValor = 0.0;
        double avg = 0.0;
        double maiorVendaValor = 0.0;

        String escolha;
        do {
            ++totalVendas;
            System.out.println("Venda de numero " + totalVendas);
            System.out.print("Informe a quantidade vendida: ");
            int quantidadeVendas = sc.nextInt();
            System.out.print("Informe o valor da venda: ");
            double valorVendas = sc.nextDouble();
            quantidadeDeDoces += quantidadeVendas;
            montanteValor += valorVendas;
            if (valorVendas >= maiorVendaValor) {
                maiorVendaValor = valorVendas;
            }

            sc.nextLine();
            System.out.print("\nDeseja realizar mais uma venda (S/N): ");
            escolha = sc.nextLine();
        } while (!escolha.toUpperCase().startsWith("N"));

        avg = montanteValor / (double) totalVendas;
        System.out.println("Foram feitas um total de " + totalVendas + " vendas.");
        System.out.println("Foram vendidos " + quantidadeDeDoces + " doces.");
        PrintStream var10000 = System.out;
        Object[] var10002 = new Object[]{montanteValor};
        var10000.println("Valor total vendido foi de " + String.format("%.2f", var10002));
        var10000 = System.out;
        var10002 = new Object[]{avg};
        var10000.println("A media das vendas foram de " + String.format("%.2f", var10002));
        var10000 = System.out;
        var10002 = new Object[]{maiorVendaValor};
        var10000.println("A maior venda foi de " + String.format("%.2f", var10002));
    }
}
