package org.example;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("informe um valor: ");
        double a = scan.nextDouble();
        System.out.print("informe outro valor: ");
        double b = scan.nextDouble();

        if (a < b){
            System.out.println("VERDADEIRO, o segundo valor é maior que o primeiro");
        }else {
            System.out.println("Falso, primeiro valor maior que o segundo");
        }
    }
}