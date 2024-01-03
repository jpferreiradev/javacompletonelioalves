package Vetores.Atividades;

import java.util.Scanner;

public class mais_velho {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = scan.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa");
            System.out.print("Nome: ");
            nomes[i] = scan.next();
            System.out.print("Idade: ");
            idades[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (idades[i] > 0) {
                System.out.println(idades[i]);

            }
        }
    }


}

