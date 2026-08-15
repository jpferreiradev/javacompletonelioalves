package exercicios_Curso.secao10;

import java.util.Locale;
import java.util.Scanner;

public class somaVetor {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números vai digitar? ");
        int n = scan.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextDouble();

        }

        double soma = 0.0;

        for (int i = 0; i < numeros.length; i++) {

            soma += numeros[i];
        }

        double media = soma / numeros.length;

        System.out.printf("VALORES = ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf(" " + numeros[i]);
        }

        System.out.println();
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);
    }
}
