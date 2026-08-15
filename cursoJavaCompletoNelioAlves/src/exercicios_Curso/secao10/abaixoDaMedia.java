package exercicios_Curso.secao10;

import java.util.Locale;
import java.util.Scanner;

public class abaixoDaMedia {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor?");
        int n = scan.nextInt();

        double[] notas = new double[n]; // vetor de notas

        // Informar as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite um número:");
            notas[i] = scan.nextDouble();
        }
        System.out.println("NOTAS:"); // Mostra as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.printf(" " + notas[i]);
        }
        System.out.println();


        double soma = 0.0;
        for (int i = 0; i < notas.length; i++) { // soma todas as notas
            soma = soma + notas[i];

        }

        double media = soma / notas.length;
        System.out.println("MEDIA DO VETOR: " + media); // Mostra o media das notas

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");

        for (int i = 0; i < n; i++) {
            if (notas[i] < media) {
                System.out.printf("%.1f\n", notas[i]);
            }
        }


        scan.close();
    }
}
