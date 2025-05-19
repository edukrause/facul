package org.example;

import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("informe o valor de a:");
        double a = scan.nextDouble();
        System.out.println("informe o valor de b:");
        double b = scan.nextDouble();
        System.out.println("informe o valor de c:");
        double c = scan.nextDouble();

        double delta = (b * b) - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println(delta);
            System.out.println("valor de x1:" + x1 + "\nvalor de x2:" + x2);
        } else {
            System.out.println("valor final:"+delta);
        }
    }
}
