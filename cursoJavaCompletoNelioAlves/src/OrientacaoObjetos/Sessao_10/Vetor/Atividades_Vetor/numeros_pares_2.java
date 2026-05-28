package OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor;

import java.util.Scanner;

public class numeros_pares_2 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int valor = scan.nextInt();

        int[] numeros = new int[valor];


        for (int i = 0; i < valor; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextInt();
        }
        System.out.println("ESSES SÃO OS NÚMEROS: ");
        for (int i = 0; i < valor; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < valor; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf(" " + numeros[i]);
            }
        }

        System.out.println();

        int cont = 0;
        for (int i = 0; i < valor; i++) {
            if (numeros[i] % 2 == 0) {
                cont++;


            }
        }
        System.out.println("QUANTIDADE DE PARES = " + cont);
    }
}
