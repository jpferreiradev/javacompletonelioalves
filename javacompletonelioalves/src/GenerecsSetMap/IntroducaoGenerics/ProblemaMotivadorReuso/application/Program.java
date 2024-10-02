package GenerecsSetMap.IntroducaoGenerics.ProblemaMotivadorReuso.application;

import GenerecsSetMap.IntroducaoGenerics.ProblemaMotivadorReuso.services.PrintService;
import GenerecsSetMap.IntroducaoGenerics.ProblemaMotivadorReuso.services.PrintServiceString;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        PrintService ps = new PrintService();
        PrintServiceString pss = new PrintServiceString();

        System.out.print("Quantos valores você vai digitar: ");
        int n = scan.nextInt();

        for(int i = 0; i < n;i++){
            //int valor = scan.nextInt(); // Para adicionar valores inteiros
            String valor = scan.next(); // Para adicionar valores String
            pss.addValue(valor);
        }


        pss.first();
        pss.print();
        System.out.println("Primeiro: " + pss.first());
    }
}
