package OrientacaoObjetos.Sessao_10.Matrizes;

import java.util.Scanner;

public class ExemploQuestao {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas linhas e colunas vai ter essa matriz: ");
        int n = scan.nextInt();

        // criar uma matriz n por n
        // numeros[i] -> Linha
        // numeros[i].length -> coluna

        int numeros[][] = new int[n][n];  // -> n[linha] [colunas]

        for (int i = 0; i < numeros.length; i++) { //Aqui pecorre a matriz inteira
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matriz diagonal:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i][i] + " ");
        }

        System.out.println();

        int negativo = 0; // variavel para quantidade de números negativo
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length ; j++) {
                if (numeros[i][j] < 0) {
                    negativo++;
                }
            }

        }
        System.out.println("Números negativos: " + negativo);


        scan.close();

    }
}
