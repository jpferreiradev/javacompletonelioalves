package GenerecsSetMap.IntroducaoGenerics.ProblemaMotivadorReuso.application;


import GenerecsSetMap.IntroducaoGenerics.ProblemaMotivadorReuso.services.PrintServiceString;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        PrintServiceString printService = new PrintServiceString();

        System.out.print("Quantos valores?");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String valores = scan.next(); // ler os valores
            printService.addValue(valores); // adicionado os valores a classe PrintService ps
        }

        printService.print(); // Imprimir os valores na tela
        System.out.println("Primeiro: " + printService.frist()); // Imprimir o primeiro valor


    }
}

/*
   Scanner scan = new Scanner(System.in);
        PrintService printService = new PrintService();

        System.out.println("Quantos valores?");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int valores = scan.nextInt(); // ler os valores
            printService.addValue(valores); // adicionado os valores a classe PrintService ps
        }

        printService.print(); // Imprimir os valores na tela
        System.out.println("Primeiro: " + printService.frist()); // Imprimir o primeiro valor
 */