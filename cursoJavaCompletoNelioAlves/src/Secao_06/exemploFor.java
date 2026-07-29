package Secao_06;

import java.util.Scanner;

public class exemploFor {
    static void main() {

        Scanner scan = new Scanner(System.in);


        System.out.print("Informe a quantidade de números do vetor: ");
        int valor = scan.nextInt();

        int vetor[] = new int[valor];

        int cont = 0;
        for(int i = 0; i < vetor.length;i++){
            vetor[i]= scan.nextInt();
            cont = vetor[i] + cont;
        }
        System.out.println("Com o vetor o valor é: " + cont);


        System.out.print("Informe o valor de números inteiros: ");
        int n = scan.nextInt();

        int soma = 0;
        for(int i =0; i < n;i++){
            int y = scan.nextInt();
            soma = soma + y;

        }
        System.out.println("Sem vetor o valor é :" + soma);

    }
}
