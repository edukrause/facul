package org.example;

import java.util.*;

public class ex_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.print("Informe a quantidade de nomes que deseja cadastrar: ");
        int quantidade = scan.nextInt();

        List<String> lista = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("informe o nome: ");
            String nome = scan2.nextLine();
            lista.add(nome);
        }
        System.out.println("Qual o nome que deseja verificar?");
        String desejado = scan2.nextLine();

        for (String v : lista) {
            if (v.equalsIgnoreCase(desejado)) {
                System.out.println("Seu nome esta na lista");

            }
        }
        Collections.sort(lista);
        System.out.println(lista);
    }
}
ps
