import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = PesquisaBinaria.gerar(2000000, 999);
        numeros = PesquisaBinaria.ordenar(numeros);

        Scanner scan = new Scanner(System.in);
        System.out.println("qual numero tu quer?");
        int num = scan.nextInt();
        boolean encontrou = PesquisaBinaria.pesquisar(numeros, num);
        System.out.println(numeros.toString());
        System.out.println(encontrou);
    }
}
