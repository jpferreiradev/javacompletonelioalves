package Vetores.Atividades;

import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scan.nextInt();

        int vetor[] = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextInt();

        }
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(" " + vetor[i]);
            }
        }

        System.out.println();


        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma = soma + 1;
            }

        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + soma);

    }

}
