package OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int valor = scan.nextInt();

        double[] numeros = new double[valor];


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextDouble();
        }

        System.out.println("NÚMEROS:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf(" " + numeros[i]);

        }

        double cont = 0.0;
        for (int i = 0; i < valor; i++) {
            cont = numeros[i] + cont;
        }
        System.out.println();
        System.out.println(" Numero somado: " + cont);

        System.out.println();

        double maior = numeros[0];
        double menor = numeros[0];
        int indice = 0;
        int indiceMenor = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                indice = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                indiceMenor = i;
            }
        }
        System.out.println("MAIOR NÚMERO " + maior);
        System.out.println("POSIÇÃO DO MAIOR NÚMERO" + indice);
        System.out.println("MENOR NÚMERO " + menor);
        System.out.println("POSIÇÃO DO MAIOR NÚMERO" + indiceMenor);



    }
}
