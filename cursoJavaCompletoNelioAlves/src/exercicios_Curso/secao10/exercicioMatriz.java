package exercicios_Curso.secao10;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exercicioMatriz {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int linhas = scan.nextInt();
        int colunas = scan.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scan.nextInt();


            }
        }
        // Até aqui fez certo!

        System.out.println("Números:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf(matriz[i][j] + " ");
            }
        }

        System.out.println();
        System.out.print("Informe a posição para comparar: ");
        int n = scan.nextInt();


        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == n) { // Pegar a matriz e comparar com[8]
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]); // diminui uma posicao de j
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]); // diminui uma posicao de j
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                }
            }

        }
    }
}





