package Vetores.Atividades;

import java.util.Scanner;

public class maior_posicao {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scan.nextInt();

        double[] numeros = new double[n];

        for(int i = 0; i < numeros.length;i++){
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextDouble();
        }

        System.out.println();
        System.out.println("Lista de números digitados");

        for(int i = 0; i < numeros.length;i++){
            System.out.print(" " + numeros[i]);
        }

        System.out.println();
        System.out.println("Maior valor = ");
        for(int i = 0; i < numeros.length;i++){
            if(n < numeros[i]){
                System.out.println(n);
            }
        }
    }

}
