package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("__--SORTEADOR DE NÚMERO--__");
        System.out.println("\n[o valor max não pode ser menor que o valor min]");
        System.out.println("informe o valor mínimo: ");
        int min = scan.nextInt();
        System.out.println("informe o valor máximo: ");
        int max = scan.nextInt();

        max = max + 1;

        Random random = new Random();
        int number = random.nextInt(min, max);

        System.out.println("Seu número aleatório é: "+number);
    }
}