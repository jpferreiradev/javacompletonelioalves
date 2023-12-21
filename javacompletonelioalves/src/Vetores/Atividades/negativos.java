package Vetores.Atividades;

import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scan.nextInt();

        int [] vet = new int[n];

        for(int i = 0; i < n;i++){
            System.out.print("Digite um número: ");
            vet[i] = scan.nextInt();
        }
        System.out.println("Numeros negativos: ");
        for(int i = 0; i< n; i++ ){
            if(vet[i] < 0){
                System.out.println(vet[i]);
            }
        }


    }

}

//int negativo = 0;  Não foi preciso criar um variavel como contador

/*
System.out.print("Quantos número você vai digitar: ");
        int n;
        n = scan.nextInt();
        int[] vetor = new int[n]; // Até que beleza

        for (int i = 0; i < vetor.length; i++) { // Na correção ele usou n, mas é uma boa pratica colocar usar a propriedade length
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextInt();
        }
        System.out.println("Números negativos: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }
 */