package org.example;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        String name = "Eduardo";

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, meu nome é "+name+"...");
        System.out.println("informe o sobrenome:");
        String sobrenome = scan.nextLine();

        System.out.println("meu nome completo é:"+name+" "+sobrenome);

    }
}
