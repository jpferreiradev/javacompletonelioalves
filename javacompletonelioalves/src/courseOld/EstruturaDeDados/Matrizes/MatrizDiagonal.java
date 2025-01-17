package courseOld.EstruturaDeDados.Matrizes;

import java.util.Scanner;

public class MatrizDiagonal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] mat = new int[n][n]; // Declaração de uma matriz bidimensional

        for(int i = 0; i < mat.length;i++){ // Pecorre as linhas
            for(int j = 0; j < mat[i].length;j++){ // Pecorre as colunas
                mat[i][j] = scan.nextInt();
            }
        }
        System.out.println("Main diagonal");
        for(int i = 0; i < mat.length;i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int cont = 0;
        for(int i = 0; i < mat.length;i++){
            for(int j = 0; j < mat[i].length;j++){
                if(mat[i][j] < 0){
                    //cont = cont + mat[i][j];
                    cont++;
                }
            }
        }
        System.out.println("Nagative numbers: " + cont);
    }
}
