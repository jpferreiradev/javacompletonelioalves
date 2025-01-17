package courseOld.GenerecsSetMap.IntroducaoGenerics.SegundoProblemaTypeSafetyPerformanceUtilizandoObject.application;


import courseOld.GenerecsSetMap.IntroducaoGenerics.SegundoProblemaTypeSafetyPerformanceUtilizandoObject.services.PrintService;

import java.util.Scanner;

public class ProgramTypeSafetyPerformance {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        PrintService ps = new PrintService();


        System.out.print("Quantos valores você vai digitar: ");
        int n = scan.nextInt();


        // Nesse caso aqui, vai ter o problema da segurança de tipos
        ps.addValue("Maria"); // Ele vai aceitar qualquer objeto do tipo Objecty, porque ele aceita String, Integer,



        for (int i = 0; i < n; i++) {
            Integer valor = scan.nextInt();
            ps.addValue(valor);
        }


        ps.print();
        Integer x = (Integer) ps.first(); // É preciso fazer um casting para fazer a conversão de Object para Integer
        System.out.println("Primeiro: " + x);
    }
}

// .ClassCastException exception que vai dar