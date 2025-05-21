package org.example;

import java.util.Scanner;

public class ativ3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe o numero");
        int quantidade = scan.nextInt();

        quantidade = quantidade + 1;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("\n");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }
}
