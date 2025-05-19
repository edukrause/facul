package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<Double> idades = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        int quantidade = 0;

        while (true) {
            System.out.print("Informe o nome do participanete: ");
            String nome = scanStr.nextLine();
            System.out.println("OBS: adicionado 0 ou menor o programa se insera");
            System.out.print("Informe a idade do participante: ");
            Double idade = scan.nextDouble();

            if (idade <= 0) {
                break;
            } else {
                nomes.add(nome);
                idades.add(idade);
            }
            quantidade++;
        }

        double menorIdade = idades.get(0);
        double maiorIdade = idades.get(0);
        String maisNovo = nomes.get(0);
        String maisVelho = nomes.get(0);

        for (int i = 1; i < idades.size(); i++) {
            if (idades.get(i) < menorIdade) {
                menorIdade = idades.get(i);
                maisNovo = nomes.get(i);
            }
            if (idades.get(i) > maiorIdade) {
                maiorIdade = idades.get(i);
                maisVelho = nomes.get(i);
            }
        }

        int media = 0;
        for (Double d : idades){
            media += d;
        }
        int mediaIdade =  media/ quantidade;

        System.out.println("Foram cadastrados "+quantidade+" participantes");
        System.out.println("A idade media é de "+mediaIdade+" anos");
        System.out.println("O participante mais novo e: " + maisNovo + " com " + menorIdade + " anos");
        System.out.println("O participante mais velho e: " + maisVelho + " com " + maiorIdade + " anos");
    }
}