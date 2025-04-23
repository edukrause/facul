import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int idade = 20;
//
//        boolean cnh = false;
//        boolean xp = true;
//
//        if (idade > 25 && xp){
//            System.out.println("Contratado!");
//        }

        at5();
    }

    public static void at1() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number: ");
        double num2 = sc.nextDouble();

        if (num1 < num2) {
            System.out.println(num2 + " É Maior que: " + num1);
        } else {
            System.out.println(num1 + " É Maior que: " + num2);
        }

        sc.close();
    }

    public static void at2() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number: ");
        double num2 = sc.nextDouble();

        double soma = num1 + num2;

        double r;

        if (soma >= 10) {
            r = soma + 5;
        } else {
            r = soma - 7;
        }

        System.out.println("Result: " + r);

        sc.close();
    }

    public static void at3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter number: ");
        double num2 = sc.nextDouble();
        double result;
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            result = 0;
        }
        System.out.println("O resultado é: " + result);
        sc.close();
    }

    public static void at4() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name city: ");
        String city = sc.nextLine();

        if (city.equalsIgnoreCase("PATO BRANCO")) {
            System.out.println("Bem vindo Pato Branquence");
        } else {
            System.out.println("Bem vindo: ");
        }

    }

    public static void at5() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you salary: ");
        double salary = sc.nextDouble();
        double tax = 0;

        if (salary > 0) {
            System.out.println("Salary is not Value");
        } else {

            if (salary < 6000.0) {
                System.out.println("Tax: " + 0);
            } else if (salary < 25000.0) {
                tax = salary * 0.06;
                System.out.println("Tax: " + tax);
            } else {
                tax = salary * 0.10;
                System.out.println("Tax: " + tax);
            }
        }

        sc.close();
    }

    public static void at6(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number month: ");
        int month = sc.nextInt();


        switch (month) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;

            default:
                System.out.println("Invalido");

        }

        sc.close();

    }


}