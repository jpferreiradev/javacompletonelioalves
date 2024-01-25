package EstruturaDeDados.Vetores;

import java.util.Scanner;

public class ExempleOne {
    public static void main(String[] args) {

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

    }
}
