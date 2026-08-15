package exercicios_Curso.secao10;

import java.util.Scanner;

public class somaVetores {
    static void main() {

        Scanner scan = new Scanner(System.in);


        System.out.print("Quantos números vai digitar? ");
        int n = scan.nextInt();

        int[] numerosA = new int[n];
        int[] numerosB = new int[n];
        int[] numerosC = new int[n];


        int soma = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("Digite os valores de A: ");
            numerosA[i] = scan.nextInt();
        }

        for (int j = 0; j < n; j++) {
            System.out.print("Digite os valores de B: ");
            numerosB[j] = scan.nextInt();


        }

        System.out.println("VETOR RESULTANTE");


        for (int i = 0; i < numerosA.length; i++) {
            for(int j = 0; j < numerosB.length; j++) {}
            numerosC[i] = numerosA[i] + numerosB[i];
            soma = numerosC[i];
            System.out.println(soma);
        }

    }
}


