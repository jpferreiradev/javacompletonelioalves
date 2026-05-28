package OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor;

import java.util.Scanner;

public class negativos {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digita:");
        int valor = scan.nextInt();

        int[] numeros = new int[valor];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextInt();
        }

        System.out.println("NUMEROS INFORMADOS: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf(" " + numeros[i]);
        }

        System.out.println();
        System.out.print("NÚMEROS NEGATIVOS:");


        int negativo = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                negativo++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de números: " + negativo);


        System.out.println();
        System.out.println("NUMEROS NEGATIVOS:");
        // int numeroNeativo = 0; -> Não foi usada uma variavel, foi usada o proprio vetor;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.printf(" " + numeros[i]);
            }
        }



        /*
        int numerosNegativo = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < 0){
                numerosNegativo = numeros[i];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println(numerosNegativo);
        */


    }

}
