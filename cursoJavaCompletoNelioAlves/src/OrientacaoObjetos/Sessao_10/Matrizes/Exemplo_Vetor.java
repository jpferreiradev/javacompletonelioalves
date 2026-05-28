package OrientacaoObjetos.Sessao_10.Matrizes;

import java.util.Scanner;

public class Exemplo_Vetor {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int [] numeros = new int[10];

        System.out.println("NUMEROS ZERADOS: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.printf(" " + numeros[i]);
        }
        System.out.println();
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Informe o " + (i+1) + " número: ");
            numeros[i] = scan.nextInt();
        }
        System.out.println();
        System.out.println("NÚMEROS ESCOLHIDOS");
        for(int i = 0; i < numeros.length; i++){
            System.out.printf(" " + numeros[i]);
        }
    }
}

/*
  System.out.print("Informe o número de linhas: ");
        int linhas = scan.nextInt();
        System.out.print("Informe o número de colunas: ");
        int colunas = scan.nextInt();

        int numeros[][] = new int[linhas][colunas];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
               numeros[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(" " + numeros[2][1]);

            }
        }
 */