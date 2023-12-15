package Vetores;

import java.util.Scanner;

public class ExempleOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double [] vetor = new double[n];

        for(int i = 0;i < n; i++){
           vetor[i] = scan.nextDouble();
        }
        double sum = 0.0;
        for( int i = 0; i< n;i++){
            sum += vetor[i];
        }
        double avg = sum / n;
        System.out.printf("Average height: %.2f%n", avg);

    }
}

/*
// Exemplo de vetor primitivo
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) { // vetor para pegar as notas
            vect[i] = scan.nextDouble();

        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) { // vetor para somar as notas
            sum += vect[i];
        }
        double avg = sum / vect.length; // divisao dos numeros

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
 */