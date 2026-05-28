package OrientacaoObjetos.Sessao_10.Matrizes;

import java.util.Scanner;

public class Exemplo_Vetor_Matriz {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número de linhas: ");
        int linhas = scan.nextInt();
        System.out.print("Informe o número de colunas: ");
        int colunas = scan.nextInt();


        int numeros[][] = new int[linhas][colunas];

        System.out.println("NUMEROS ZERADOS");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf(" " + numeros[i][j]);
            }
        }
        System.out.println();
        System.out.println("Informe os numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = scan.nextInt();
            }
        }

        System.out.println();
        System.out.println("POSSIÇÕES DOS  NÚMEROS SÃO ESSES: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf(" " + i);
                System.out.printf(" " + j);
            }
        }
        System.out.println();
        System.out.println("NÚMEROS SÃO ESSES: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf(" " + numeros[i][j]);

            }
        }



    }

}
