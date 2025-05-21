package funcoes.matematicas;

import java.util.Scanner;

public class Adicao {
    public static void somar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a");
        int a = scan.nextInt();
        System.out.println("Informe b");
        int b = scan.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b) + "\n");


    }
}
