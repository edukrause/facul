package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> valores = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            System.out.println("informe um valor");
            String bah = scan.nextLine();
            valores.add(bah);
        }
        valores.remove(1);
        for (String v:valores) {
            System.out.println(v);
        }
    }
}