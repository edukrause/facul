package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o custo de produção do produto: R$");
        double valorVen = scan.nextDouble();

        double valorFinal = (valorVen * (230.0 + 22.0 + 7.0 + 1.65) / 100);

        System.out.println("\nO valor de venda desse produto deverá ser de: R$" + String.format("%.2f",valorFinal));
    }
}