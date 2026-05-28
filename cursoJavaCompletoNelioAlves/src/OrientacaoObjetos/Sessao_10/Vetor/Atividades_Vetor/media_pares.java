package OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor:");
        int valor = scan.nextInt();

        int[] numeros = new int[valor];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextInt();

        }
        System.out.println("NUMEROS: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf(" " + numeros[i]);


        }
        System.out.println();
        System.out.println();
        //System.out.println("NUMEROS PARES: ");
        int soma = 0;
        double media;
        int v = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf(" %d", numeros[i]);
                soma = numeros[i] + soma;
                v++;
                media = soma / v;

                System.out.println("SOMA DOS NÚMEROS PARES = " + soma);
                System.out.println("MEDIA DOS PARES = " + media);
                //System.out.println("MEDIA DOS PARES = %.1f" + media);
            } else {
                System.out.println("NENHUM NÚMERO PAR!");
            }
        }
        /*
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                soma = numeros[i] + soma;
                v++;
            }

        }
        */

    }

}
