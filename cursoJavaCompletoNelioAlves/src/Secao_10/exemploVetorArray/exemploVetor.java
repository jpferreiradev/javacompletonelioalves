package Secao_10.exemploVetorArray;

import java.util.Scanner;

public class exemploVetor {
    static void main() {


        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Informe os números do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scan.nextInt();

        }
        System.out.println("Número do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
