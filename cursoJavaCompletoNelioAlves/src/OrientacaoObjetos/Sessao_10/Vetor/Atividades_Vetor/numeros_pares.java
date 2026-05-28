package OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.print("Informe os números que você vai digitar: ");
        int valor = scan.nextInt();

        int[] numeros = new int[valor];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número: ");
            numeros[i] = scan.nextInt();
        }

        System.out.println("NÚMEROS: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf(" " + numeros[i]);

        }

        System.out.println();
        System.out.println("NÚMEROS PARES: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf(" " + numeros[i]);
            }

        }


        int quantidade = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                quantidade++;
            }

        }
        System.out.println();
        System.out.println("QUANTIDADE DE NÚMEROS PARES: " + quantidade);
    }

}

