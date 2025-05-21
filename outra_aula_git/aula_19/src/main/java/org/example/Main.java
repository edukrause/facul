package org.example;

public class Main {
    public static void main(String[] args) {
        double saldo = 100;

        while(saldo >= 0){
            saldo -=10;
            System.out.printf("%.2f\n",saldo);
        }
        saldo = 100;

        do {
            saldo -= 20;
            System.out.println(saldo);
        }while (!(saldo < 0));

        //
        saldo = 100;
        do {
            saldo -=20;
            System.out.println(saldo);
        }while (saldo > 0);
    }
}