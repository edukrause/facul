package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // apagar depois
        String nome = "Eduardo Krause";
        String email = "eduardo@gmail.com";
        // apagar depois

        LocalDate dataHoje = LocalDate.now();
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = dataHoje.format(formatoBrasileiro);

        Random random = new Random();
        double numeroAleatorio = random.nextDouble(100000000,1000000000);

        numeroAleatorio *= numeroAleatorio;

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Bem-vindo à compra de ingressos!\n" +
                "Escolha o ingresso que melhor atenda às suas necessidades e garanta seu lugar no nosso evento incrível! Confira as opções abaixo:\n" +
                "\n" +
                "Ingresso Meia Estudante: Válido para estudantes com documento de comprovação, garantindo acesso geral ao evento com desconto.\nValor: R$ 25,00.\n" +
                "Ingresso Padrão: Acesso geral ao evento, incluindo todas as atrações principais.\nValor: R$ 50,00.\n" +
                "Ingresso Premium: Experiência completa! Acesso VIP, estacionamento gratuito e sessão de fotos com as atrações.\nValor: R$ 150,00.");

        System.out.println("\nInforme o tipo de ingresso que você deseja comprar: 'premium', 'meia' ou 'padrao':");
        String ingresso = scan.nextLine();
        if (!ingresso.equalsIgnoreCase("meia") && !ingresso.equalsIgnoreCase("padrao") && !ingresso.equalsIgnoreCase("premium")){
            System.out.println("Ingresso Inválido");
            System.exit(0);
        }
        System.out.println("Informe a quantidade de ingresso que deseja comprar \nNo máximo 3 ingressos");
        int quantidade = scan.nextInt();

        if (quantidade >= 4 || 0 >= quantidade) {
            System.out.println("Quantidade Inválida");
            System.exit(0);
        }
        if (ingresso.equalsIgnoreCase("meia")) {
            System.out.println("Informe o código de uso da sua carteirinha");
            String codigo = scan2.nextLine();

            if (codigo.length() == 9) {
                double valor = 25 * quantidade;
                System.out.println(
                        "=====================================\n" +
                                "        Fatura (1ª Impressão)   \n" +
                                "=====================================\n" +
                                "Nome: " + nome + "\n" +
                                "IGRESSO MEIA ESTUDANTE\n" +
                                "Código de Uso: " + codigo + "\n" +
                                "Email: " + email + "\n" +
                                "Data: " + data + "\n" +
                                "Quantidade de ingressos: " + quantidade +
                                "\nValor: R$ " + String.format("%.2f", valor) + "\n" +
                                "=====================================\n" +
                                "||  |  || ||| ||  |   ||  ||  ||  \n" +
                                "||  |  || ||| ||  |   ||  ||  ||  \n" +
                                String.format("%.0f%n", numeroAleatorio) + // Aqui, estamos formatando o número para exibir como inteiro
                                "=====================================\n" +
                                "    Agradecemos pela preferência! \n" +
                                "=====================================");
            } else {
                System.out.println("Código Inválido");
            }
        }
        if (ingresso.equalsIgnoreCase("padrao")) {

            double valor = 50 * quantidade;
            System.out.println("=====================================\n" +
                    "        Fatura (1ª Impressão)   \n" +
                    "=====================================\n" +
                    "IGRESSO PADRÃO\n" +
                    "Nome: " + nome + "\n" +
                    "Email: " + email + "\n" +
                    "Data: " + data + "\n" +
                    "Quantidade de ingressos: " + quantidade +
                    "\nValor: R$ " + String.format("%.2f", valor) + "\n" +
                    "||  |  || ||| ||  |   ||  ||  ||  \n" +
                    "||  |  || ||| ||  |   ||  ||  ||  \n" +
                    String.format("%.0f%n", numeroAleatorio) +
                    "=====================================\n" +
                    "    Agradecemos pela preferência! \n" +
                    "=====================================");
        }
        if (ingresso.equalsIgnoreCase("premium")) {
            double valor = 150 * quantidade;
            System.out.println("=====================================\n" +
                    "        Fatura (1ª Impressão)   \n" +
                    "=====================================\n" +
                    "IGRESSO PREMIUM\n" +
                    "Nome: " + nome + "\n" +
                    "Email: " + email + "\n" +
                    "Data: " + data + "\n" +
                    "Quantidade de ingressos: " + quantidade +
                    "\nValor: R$ " + String.format("%.2f", valor) + "\n" +
                    "||  |  || ||| ||  |   ||  ||  ||  \n" +
                    "||  |  || ||| ||  |   ||  ||  ||  \n" +
                    String.format("%.0f%n", numeroAleatorio) +
                    "=====================================\n" +
                    "    Agradecemos pela preferência! \n" +
                    "=====================================");
        }
    }
}

