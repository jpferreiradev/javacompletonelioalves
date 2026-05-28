package OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor?");
        int valor = scan.nextInt();

        double[] numeros = new double[valor];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número:");
            numeros[i] = scan.nextDouble();

        }

        System.out.println("");
        System.out.println("NÚMEROS: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf(" " + numeros[i]);
        }

        double totalNumeros = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            totalNumeros += numeros[i];
            media = totalNumeros / numeros.length;
        }
        System.out.println();

        System.out.printf("MEDIA DO VETOR = %.3f\n ", media);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");

        for (int i = 0; i < numeros.length; i++) {
            totalNumeros += numeros[i];
            if (media > numeros[i]) {
                System.out.println(numeros[i]);
            }
        }

    }
}
