package Secao_10;

import java.util.Scanner;

public class exemploLacoForEach {
    static void main() {

        Scanner scan = new Scanner(System.in);

        String[] nomes2 = {"Ferreria,Santos"};
        String[] nomes = new String[2];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scan.nextLine();
        }

        System.out.println("Exemplo For: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf(" " + nomes[i]);
        }

        System.out.println("\nExemplo For Each");

        for (String s : nomes) {
            System.out.printf(" " + s);
        }
    }
}
