package exercicios_Curso.secao10;

import java.util.Locale;
import java.util.Scanner;

public class maiorPosicao {
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

        double maior = numeros[0]; // colocou a posição do vetor
        int posmaior = 0; // fiz isso, mas ele colocou o i e não o numeros[i]

        for (int i = 1; i < n; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i]; // posicao do maior
                posmaior = i; // valor
            }
        }

        System.out.println(maior);
        System.out.println(posmaior);
        scan.close();
    }

}

