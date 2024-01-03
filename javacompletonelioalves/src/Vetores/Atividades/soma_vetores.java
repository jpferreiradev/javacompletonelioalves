package Vetores.Atividades;

import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quantos vetores vai ter cada vetor:  ");
        int n = scan.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];


        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }


        System.out.println("Digite os valores de vetor B");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scan.nextInt();
        }
        for(int i =0; i < n;i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < n;i++){
            System.out.println(vetorC[i]);
        }

    }

}

