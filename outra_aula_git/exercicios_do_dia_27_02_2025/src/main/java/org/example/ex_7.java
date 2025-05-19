package org.example;

import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe o valor da cotacao:");
        double cotacao = scan.nextDouble();

        System.out.println("informe quantos dolares o senhor possui:");
        double money = scan.nextDouble();

        double conversao = money * cotacao;

        System.out.println("o senhor tem:"+conversao);
    }
}
