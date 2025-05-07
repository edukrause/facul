package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        List<String> comodo = new ArrayList<>();
        List<Double> temperaturaCe = new ArrayList<>();
        List<Double> temperaturaFa = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        int quantidade = 0;

        while (true) {
            System.out.print("Insira o nome do comodo: ");
            String nomeComo = scanStr.nextLine();
            System.out.print("Informe a temperatura desse comodo em graus Celsius: ");
            double gruasCel = scan.nextInt();
            double tempFah = (gruasCel * 9 / 5) + 32;
            System.out.println("Sao " + tempFah + " fahrenheit");

            comodo.add(nomeComo);
            temperaturaCe.add(gruasCel);
            temperaturaFa.add(tempFah);

            System.out.println("\nDeseja adicionar mais algum comodo?\ninforme s para sim ou n para nao");
            String denovo = scanStr.nextLine();
            quantidade++;

            if (denovo.equalsIgnoreCase("n")) {
                break;
            }
        }

        double tempMaisFria = temperaturaCe.get(0);
        double tempMaisQuente = temperaturaCe.get(0);
        String comodoMaisFrio = comodo.get(0);
        String comodoMaisQuente = comodo.get(0);

        for (int i = 1; i < temperaturaCe.size(); i++) {
            if (temperaturaCe.get(i) < tempMaisFria) {
                tempMaisFria = temperaturaCe.get(i);
                comodoMaisFrio = comodo.get(i);
            }
            if (temperaturaCe.get(i) > tempMaisQuente) {
                tempMaisQuente = temperaturaCe.get(i);
                comodoMaisQuente = comodo.get(i);
            }
        }

        double tempMaisFriaFah = temperaturaFa.get(0);
        double tempMaisQuenteFah = temperaturaFa.get(0);
        String comodoMaisFrioFah = comodo.get(0);
        String comodoMaisQuenteFah = comodo.get(0);

        for (int i = 1; i < temperaturaFa.size(); i++) {
            if (temperaturaFa.get(i) < tempMaisFriaFah) {
                tempMaisFriaFah = temperaturaFa.get(i);
                comodoMaisFrioFah = comodo.get(i);
            }
            if (temperaturaFa.get(i) > tempMaisQuenteFah) {
                tempMaisQuenteFah = temperaturaFa.get(i);
                comodoMaisQuenteFah = comodo.get(i);
            }
        }

        double mediaCel = 0;
        for (Double d : temperaturaCe) {
            mediaCel += d;
        }
        mediaCel = mediaCel / quantidade;

        double mediaFah = 0;
        for (Double d : temperaturaFa) {
            mediaFah += d;
        }
        mediaFah = mediaFah / quantidade;

        System.out.println("Foram adicionados " + quantidade + " comodos");
        System.out.println("A media em gruaus Celsius e: " + mediaCel + " °C");
        System.out.println("A media em Fahrenheit e: " + mediaFah + " °F");
        System.out.println("O comodo mais frio e: " + comodoMaisFrio + " com " + tempMaisFria + " °C ou " + tempMaisFriaFah + " °F");
        System.out.println("O comodo mais quente e: " + comodoMaisQuente + " com " + tempMaisQuente + " °C ou " + tempMaisQuenteFah + " °F");
    }
}
