package org.example;

public class ex_1 {
    public static void main(String[] args) {
        // A
        double operacao1 = (15.0 / 2.0) - ((15.0 * Math.sqrt(3.0)) / 2.0);

        // B
        double operacao2 =  (Math.pow((1.0 / 2.0) , 2.0)) * (1.0/3.0) + (1.0/4.0) / (1.0/3.0);

        //C
        double operacao3 = Math.sqrt(Math.pow(5.0,2.0) + (Math.pow(Math.cbrt(9.0),2.0)));

        //D
        double operacao4 = ((2.0 * Math.sqrt(5.0)) + Math.sqrt(40.0) + (2.0 * Math.sqrt(8.0)+8.0)) / -3;

        System.out.println("O resultado da primeira operação é: "+operacao1);
        System.out.println("O resultado da segunda operação é: "+operacao2);
        System.out.println("O resultado da terceira operação é: "+operacao3);
        System.out.println("O resultado da quarta operação é: "+operacao4);
    }
}
