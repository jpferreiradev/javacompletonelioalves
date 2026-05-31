package OrientacaoObjetos.Sessao_10.Matrizes;

import java.util.Scanner;

public class AtividadeDaSessao {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número de linhas: ");
        int linhas = scan.nextInt();
        System.out.print("Informe o número de colunas: ");
        int colunas = scan.nextInt();
        System.out.print("Escolha um número: ");
        int numero = scan.nextInt();

        int numeros[][] = new int[linhas][colunas];


        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = scan.nextInt();
            }
        }
        // Até aqui você fez certo, em baixo mostra a matriz
        System.out.println();
        System.out.println("MATRIZ: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf(" " + numeros[i][j]);

            }

        }
        System.out.println();
        System.out.println("-------");

        // Aqui é pra pegar a comparação com o que o usuario vai digitar e ver qual numero que se repete;
        int numeroEscolhido = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numero == numeros[i][j]) {
                    numeroEscolhido = numeros[i][j];


                }
            }
        }
        System.out.println("NÚMERO IGUAL: " + numeroEscolhido);
        System.out.println();
        System.out.println("--------------------");
        // Aqui é pra pegar a posição do numeros repetidos


        System.out.println();

        //int posicao = 0;

        int posicaoi = 0;
        int posicaoj = 0;

    // Aqui é como foi feito, você precisa entender essa lógica;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numero == numeros[i][j]) {
                    posicaoi = i;
                    posicaoj = j;
                    //System.out.printf(" " + i);
                    //System.out.printf(" " + j);
                    System.out.println("Posição " + posicaoi + ", " + posicaoj);
                    if (j > 0) {
                        System.out.println("Esquerda: " + numeros[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + numeros[i - 1][j]);
                    }
                    if (j < numeros[i].length - 1) {
                        System.out.println("Direita: " + numeros[i][j + 1]);
                    }
                    if (i < numeros.length - 1) {
                        System.out.println("Baixo: " + numeros[i + 1][j]);
                    }
                }
            }

        }

        System.out.println("\n---------------");
        System.out.println();
        System.out.println();
        // Aqui é pra pegar e imprimir o lado esquerdo, direito cima e  baixo

        /* -> Esquece essas variaveis
        int baixo = 0;
        int cima = 0;
        int direita = 0;
        int esquerda = 0;


        for(int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (j > 0) {
                    System.out.println("Esquerda: " + numeros[i][j-1]);
                }
                if (i > 0) {
                    System.out.println("Cima: " + numeros[i-1][j]);
                }
                if (j < numeros[i].length-1) {
                    System.out.println("Direita: " + numeros[i][j+1]);
                }
                if (i < numeros.length-1) {
                    System.out.println("Baixo: " + numeros[i+1][j]);
                }
            }
        }

        */


    }

}

/*
  Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
 */



