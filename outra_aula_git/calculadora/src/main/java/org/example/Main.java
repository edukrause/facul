package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe o primeiro valor");
        int x = scan.nextInt();

        System.out.println("informe o segundo valor");
        int y = scan.nextInt();

        System.out.println("informe a operação\n 1- para adição \n 2- para subtração \n 3- para multiplicação \n 4- Para divisão");
        int calc = scan.nextInt();

        if (calc == 1){
            int res = x + y;
            System.out.println("Resultado:"+res);
        }
        if (calc == 2){
            int soma = x - y;
            System.out.println("Resultado:"+soma);
        }
        if (calc == 3){
            int soma = x * y;
            System.out.println("Resultado:"+soma);
        }
        if (calc == 4){
            int soma = x / y;
            System.out.println("Resultado:"+soma);
        }else {
            System.out.println("valor invalido");
        }
    }
}