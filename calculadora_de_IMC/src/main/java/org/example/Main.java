package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("informe seu peso");
        double peso = scan.nextDouble();

        System.out.println("informe sua altura (metro)");
        double altura = scan.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC:"+imc);
    }
}