package org.example;

import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {
        String candidato_a;
        String candidato_b;
        String candidato_c;

        Scanner scan = new Scanner(System.in);

        System.out.println("informe a quantidade de votos nulos:");
        int nulos = scan.nextInt();

        System.out.println("informe a quantidade de votos brancos:");
        int brancos = scan.nextInt();

        System.out.println("informe a quantidade de votos para o candidato A:");
        int cand_a = scan.nextInt();

        System.out.println("informe a quantidade de votos para o candidato B:");
        int cand_b = scan.nextInt();

        System.out.println("informe a quantidade de votos para o canditado C:");
        int cand_c = scan.nextInt();

        int eleitores =  nulos + brancos + cand_a + cand_b + cand_c;

        int perc_nulos = (100 * nulos) / eleitores;
        int perc_brancos = (100 * brancos) / eleitores;
        int perc_cand_A = (100 * cand_a) / eleitores;
        int perc_cand_B = (100 * cand_b) / eleitores;
        int perc_cand_C = (100 * cand_c) / eleitores;

        System.out.println("nulos:"+perc_nulos+"%");
        System.out.println("brancos:"+perc_brancos+"%");
        System.out.println("candidato A:"+perc_cand_A+"%");
        System.out.println("candidato B:"+perc_cand_B+"%");
        System.out.println("candidato C:"+perc_cand_C+"%");

    }
}
