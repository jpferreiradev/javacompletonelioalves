package exercicios_Curso.secao10;

import java.util.Scanner;

public class negativos {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scan.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextInt();


        }
        System.out.println("Numeros negativos: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }

        scan.close();
    }
}
