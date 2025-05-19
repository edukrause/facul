package org.example;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe o valor de A");
        double a = scan.nextDouble();
        System.out.println("informe o valor de B");
        double b = scan.nextDouble();

        double x = a + b;

        if (x > 10){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}