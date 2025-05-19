package org.example;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase");
        String valor = scan.nextLine();

        char[] bah = valor.toCharArray();
        boolean temNumeros = true;

        if (bah.length <= 0) {
            temNumeros = false;
        }else {
            for (int i = 0; i < valor.length(); i++) {
                if (Character.isDigit(bah[i])){
                    temNumeros = true;
                }else {
                    temNumeros = false;
                    break;
                }
            }
        }
        System.out.println("resultado so numeros "+temNumeros);
    }
}
