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
        // Aqui é pra pegar a posição e imprimir o lado esquerdo, direito e baixo


        System.out.println();

        int posicao = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numero == numeros[i][j]) {
                    


                }
            }
        }


    }
}
