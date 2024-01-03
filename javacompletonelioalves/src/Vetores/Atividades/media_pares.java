package Vetores.Atividades;

import java.util.Scanner;

public class media_pares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int vetor = scan.nextInt();

        int[] numeros = new int[vetor];

        for(int i = 0; i < numeros.length;i++){
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextInt();
        }
        int cont = 0;
        for(int i = 0; i< numeros.length;i++){
            cont = cont + numeros[i];
        }

        /*
        for(int i = 0; i < numeros.length;i++){
            if(numeros[i] % 2 == 0){
                int media = cont / vetor;
                System.out.println("Media dos pares = " + media);
            } else{
                System.out.println("Nenhum número par");
            }
        }
        */
        System.out.println();
        if(numeros.length % 2 == 0){
            int media = cont / vetor;
            System.out.println("Media dos pares = " + media);
        } else{
            System.out.println("Nenhum número par");
        }
        //int media = cont / vetor;
        //System.out.println("Media dos pares = " + media);
    }
}
