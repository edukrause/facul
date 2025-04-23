package org.example;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] frase = new String[7];
        boolean temNumeros = true;

        for (int i = 0; i < frase.length; i++) {
            System.out.println("infome uma frase");
            frase[i] = scan.nextLine();

            char[] bah = frase[i].toCharArray();

            for (int j = 0; j < frase[i].length(); j++) {
                if (Character.isDigit(bah[j])){
                    System.exit(0);
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(frase[i]);
        }
    }
}