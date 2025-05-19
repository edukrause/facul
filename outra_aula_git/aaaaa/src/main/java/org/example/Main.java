package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> comodos = new ArrayList<>();
        ArrayList<Double> temperaturas = new ArrayList<>();

        // Vamos supor que você quer cadastrar 5 cômodos
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o nome do cômodo: ");
            comodos.add(sc.nextLine());

            System.out.print("Digite a temperatura desse cômodo: ");
            temperaturas.add(sc.nextDouble());
            sc.nextLine(); // Limpar o buffer
        }

        // Agora vamos procurar o mais frio e o mais quente
        double tempMaisFria = temperaturas.get(0);
        double tempMaisQuente = temperaturas.get(0);
        String comodoMaisFrio = comodos.get(0);
        String comodoMaisQuente = comodos.get(0);

        for (int i = 1; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) < tempMaisFria) {
                tempMaisFria = temperaturas.get(i);
                comodoMaisFrio = comodos.get(i);
            }

            if (temperaturas.get(i) > tempMaisQuente) {
                tempMaisQuente = temperaturas.get(i);
                comodoMaisQuente = comodos.get(i);
            }
        }

        System.out.println("O cômodo mais frio é: " + comodoMaisFrio + " com " + tempMaisFria + "°C");
        System.out.println("O cômodo mais quente é: " + comodoMaisQuente + " com " + tempMaisQuente + "°C");
    }
}
