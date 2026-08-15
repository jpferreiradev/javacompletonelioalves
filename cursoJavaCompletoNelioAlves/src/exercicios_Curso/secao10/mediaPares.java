package exercicios_Curso.secao10;

import java.util.Scanner;

public class mediaPares {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = scan.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scan.nextInt();
        }
        System.out.println("Números pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf(" " + numeros[i]);
            }
        }
        int soma = 0;
        double media = 0;
        int valor = 0;

        System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                soma = soma + numeros[i];
                valor++; // Aqui você pega o valor

            }

        }

        if (valor == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = (double) soma / valor;

            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        }
        System.out.println("Quantidade de pares:" + valor);
        System.out.println("Soma dos pares: " + soma);
        System.out.println("MEDIA DOS PARES = " + media);
    }
}
