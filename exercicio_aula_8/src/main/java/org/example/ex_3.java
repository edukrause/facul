package org.example;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r;

        System.out.println("informe o valor de A");
        double a = scan.nextDouble();
        System.out.println("informe o valor de B");
        double b = scan.nextDouble();

        if (b != 0){
            r = a / b;
        }else {
            r = 0;
        }
        System.out.println(r);
    }
}
