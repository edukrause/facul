package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe o numero");
        int numero = scan.nextInt();

        int resultado = 1;
        for (int i = numero; i > 1 ; i--) {
            resultado *= i;
        }
        System.out.println(resultado);

        int cont = numero;
        resultado = 1;
        while (cont > 0){
            resultado = resultado * cont;
            cont--;
        }
        System.out.println(resultado);

        cont = numero;
        resultado = 1;
        do {
            resultado = resultado * cont;
            cont--;
        }while (cont != 0);
        System.out.println(resultado);

        cont = numero;
        resultado = 1;
        do {
         resultado = resultado * cont;
         cont--;

        }while (cont > 1);
        System.out.println(resultado);
    }
}