package funcoes.arrays;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void search() {
        int[] lista = gerar(999999999);
        Scanner scan = new Scanner(System.in);
        System.out.println("Pesquisa por...");
        int num = scan.nextInt();
        boolean achou = pesquisar(lista, num);
        System.out.println("Achou?=" + achou);
    }

    public static int[] gerar(int tamanho) {
        int[] lista = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(50);
        }
        return lista;
    }

    public static boolean pesquisar(int[] vet, int numero) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == numero) {
                return true;
            }
        }
        return false;
    }
}
