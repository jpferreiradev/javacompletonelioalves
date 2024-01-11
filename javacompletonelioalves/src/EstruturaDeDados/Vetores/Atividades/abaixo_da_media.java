package EstruturaDeDados.Vetores.Atividades;

import java.util.Scanner;

public class abaixo_da_media {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = scan.nextInt();

        double vetor[] = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < vetor.length;i++){
         soma = soma + vetor[i];
        }
        double media = soma / n;
        System.out.println("MEDIA DO VETOR = " + media );

        System.out.println("Elementos abaixo da média: ");
        for(int i =0; i < vetor.length;i++){
            if(vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }
    }
}
