package org.example;

import java.util.Scanner;

public class ativ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe o primeiro numero");
        int numero = sc.nextInt();

        String numeroStr = String.valueOf(numero);

        int soma = 0;

        for (int i = 0; i < numeroStr.length(); i++) {
            soma += Character.getNumericValue(numeroStr.charAt(i));
        }
        System.out.println("A soma dos dígitos de " + numero + " é: " + soma);
    }
}
