package courseOld.GenerecsSetMap.IntroducaoGenerics.SolucaoComGenerecs.application;


import courseOld.GenerecsSetMap.IntroducaoGenerics.SolucaoComGenerecs.services.PrintServiceGenerics;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Você precisa colocar no final o <> para indicar que você está instanciando um generics
        //PrintServiceGenerics<Integer> ps = new PrintServiceGenerics<>();
        //PrintServiceGenerics<Integer> ps = new PrintServiceGenerics<Integer>();
        PrintServiceGenerics<String> ps = new PrintServiceGenerics<>(); // Mudando para String

        System.out.print("Quantos valores você vai digitar: ");
        int n = scan.nextInt();

        //ps.addValue("Maria"); //Ele não vai deixar você adicionar uma String, e sim só inteiros

        for (int i = 0; i < n; i++) {
            //Integer valor = scan.nextInt();
            String valor = scan.next();
            ps.addValue(valor);
        }


        ps.print();
        //Integer x = ps.first(); Funcionou para inteiro
        //Integer x = ps.first();
        String x = ps.first();
        System.out.println("Primeiro: " + x);

    }
}
