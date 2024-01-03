package Vetores.Atividades;

import java.util.Scanner;

public class maior_posicao {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int n,posMaior;
        double maior;

        System.out.print("Quantos números você vai digitar? ");
        n = scan.nextInt();

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

       maior = numeros[0];
        posMaior = 0;


        System.out.println();

        for(int i = 0; i < numeros.length;i++){
            if(numeros[i] > maior){
                maior = numeros[i];
                posMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);

    }

}
