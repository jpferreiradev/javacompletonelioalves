package exercicios_Curso.secao10;

import java.util.Scanner;

public class numerosPares {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números vai digitar? ");
        int n = scan.nextInt();

        int[] pares = new int[n];

        for(int i = 0; i < pares.length; i++){
            System.out.print("Digite um número: ");
            pares[i] = scan.nextInt();
        }
        /*
        System.out.println("Números: ");
        for(int i = 0; i < pares.length; i++){
            System.out.printf(" " + pares[i]);

        }
        */
        System.out.println("Números pares: ");
        for(int i = 0; i < pares.length; i++){
            if(pares[i] % 2 == 0){
                System.out.printf(" " + pares[i]);
            }
        }

        System.out.println();
        System.out.println();
        int v = 0;

        for(int i = 0; i < pares.length; i++){
            if(pares[i] % 2 == 0){
                v++; // Aqui pega a quantidade de números pares;
            }
        }
        System.out.println("Quantidades pares: " + v);
    }
}
