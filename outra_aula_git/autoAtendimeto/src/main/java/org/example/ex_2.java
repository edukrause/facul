package org.example;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        int prato, sobremesa, bebida, calorias;

        Scanner scan = new Scanner(System.in);

        System.out.println("pratos:\n1-vegetariano\n2-peixe\n3-frango\n4-carne");
        prato = scan.nextInt();

        System.out.println("Sobremesa:\n1-abacaxi\n2-sorvete\n3-mouse\n4-chocolate");
        sobremesa = scan.nextInt();

        System.out.println("Bebida:\n1-cha\n2-suco de laranja\n3-suco de melao\n4-refrizin");
        bebida = scan.nextInt();
    }
}
