package GenerecsSetMap.IntroducaoGenerics.SegundoProblemaTypeSafetyPerformance.application;


import GenerecsSetMap.IntroducaoGenerics.SegundoProblemaTypeSafetyPerformance.services.PrintService;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        PrintService printService = new PrintService();

        System.out.print("Quantos valores?");
        int n = scan.nextInt();

        printService.addValue("Maria"); // Aqui é legal, porque ele aceita qualquer tipo Objetc, que é uma String

        for (int i = 0; i < n; i++) {
            Integer valor = scan.nextInt();
            printService.addValue(valor);
        }

        printService.print();
        Integer x = (Integer) printService.frist();

        System.out.println("Primeiro: " + x);


    }
}

