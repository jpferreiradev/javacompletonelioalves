package GenerecsSetMap.IntroducaoGenerics.SolucaoComGenerecs.application;


import GenerecsSetMap.IntroducaoGenerics.SolucaoComGenerecs.services.PrintService;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>(); // No final é preciso utilizar o <> para indicar que você está usando um tipo generitc
        //PrintService<String> printService = new PrintService<String>();

        System.out.print("Quantos valores?");
        int n = scan.nextInt();

        //printService.addValue("JP"); -> Nesse caso aqui, não pode usar o tipo String, só Integer, mas caso queira usalo, precisa instanciar

        for (int i = 0; i < n; i++) {
            Integer valor = scan.nextInt();
            //String valor2 = scan.next(); -> Caos queria mudar pra String
            printService.addValue(valor);
        }

        printService.print();
        //String x = printService.frist();
        //printService.addValue(valor2); -> Caso queira usar String

        System.out.println("Primeiro: " + printService.frist());


    }
}

