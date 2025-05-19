package principal;

import funcoes.arrays.Arrays;
import funcoes.matematicas.Adicao;
import funcoes.matematicas.Divisao;
import funcoes.matematicas.Multiplicacao;
import funcoes.matematicas.Subtracao;

import java.util.Scanner;

public class Menu {
    public static void exibirMenu() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            imprimirMenu();
            int mn = scan.nextInt();

            if (mn == 1) {
                Adicao.somar();
            } else if (mn == 2) {
                Subtracao.diminuir();
            } else if (mn == 3) {
                Multiplicacao.multiplicar();
            } else if (mn == 4) {
                Divisao.divir();
            } else if (mn == 5) {
                Arrays.search();
            }else {
                System.exit(0);
            }
        }
    }
    public static void imprimirMenu() {
        System.out.println("""
                1 - Somar
                2 - Diminuir
                3 - Multiplicar
                4 - Dividir
                5 - Array
                9 - Sair do sistema
                """);
    }
}
