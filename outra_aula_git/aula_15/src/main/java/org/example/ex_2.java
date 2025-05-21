package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List <Integer> valores = new ArrayList<>();

        for (int i = 0; i == 0;) {
            System.out.println("informe o valor");
            int numero = scan.nextInt();
            if (numero == 0) {
                break;
            }else {
                valores.add(numero);
            }
        }
        int tamanho = valores.size();
        double soma = 0;
        for (int v: valores){
            soma += v;
        }
        double media = soma / tamanho;
        System.out.println(soma);
        System.out.println(media);
    }
}
