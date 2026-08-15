package Secao_10;

import java.util.Scanner;

public class exemploMatrizes  {
    static void main() {

        Scanner scan = new Scanner(System.in);


        int numeros[][] = new int[2][2];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                numeros[i][j] = scan.nextInt();

            }
        }

        System.out.println("Numéros");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(numeros[i][j] + " ");
            }
        }
    }
}


// Lembre-se que é linha e coluna;