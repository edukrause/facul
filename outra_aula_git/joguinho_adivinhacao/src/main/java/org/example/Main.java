
package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scanSt = new Scanner(System.in);

        String jogar;
        int qntPontos = 0;

        while (true){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(0, 11);

        int qntTentativas = 1;

        System.out.println("Seu numero é entre 0 e 10...\n");

            do {
                System.out.print("Tente adivinhar o numero: ");
                int tentativa = scan.nextInt();

                if (tentativa == numeroAleatorio) {
                    System.out.println("Acertouuu");
                    break;
                } else {
                    System.out.println("errou");
                    System.out.println("deseja tentar novamente?\n(s/n)");
                    String dnv = scanSt.nextLine();
                    if (dnv.equalsIgnoreCase("s")) {
                        qntTentativas += 1;
                        if (tentativa > numeroAleatorio) {
                            System.out.println("seu numero é menor");
                        } else {
                            System.out.println("seu numero é maior");
                        }
                    } else {
                        System.out.println("Tchauu");
                        break;
                    }
                }
            } while (qntTentativas >= 1);
            if (qntTentativas == 1) {
                System.out.println("De primeira \n100 pontos");
                qntPontos += 100;
            }
            if (qntTentativas == 2) {
                System.out.println("90 pontos\nem "+qntTentativas+" tentativas");
                qntPontos += 90;
            }
            if (qntTentativas == 3) {
                System.out.println("80 pontos\\nem "+qntTentativas+" tentativas\"");
                qntPontos += 80;
            }
            if (qntTentativas >= 4) {
                System.out.println("50 pontos\\nem "+qntTentativas+" tentativas\"");
                qntPontos += 50;
            }
            System.out.println("Deseja jogar mais uma vez?(s/n)");
            jogar = scanSt.nextLine();
            if (!(jogar.equalsIgnoreCase("s"))){
                System.out.println("Pontos:"+qntPontos);
                break;
            }
        }
    }
}
