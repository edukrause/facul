package org.example;

public class Atividade_5 {
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;
        int proximo;

        System.out.println("Sequencia de Fibonacci ate o decimo quinto termo:");
        System.out.print(anterior + " " + atual + " ");

        for (int i = 3; i <= 15; i++) {
            proximo = atual + anterior;

            System.out.print(proximo + " ");

            anterior = atual;
            atual = proximo;
        }
    }
}
