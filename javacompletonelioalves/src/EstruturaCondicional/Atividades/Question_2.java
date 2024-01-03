package EstruturaCondicional.Atividades;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int numero;
        int parOuImpar;

        System.out.println("Informe um número: ");
        numero = scan.nextInt();
        parOuImpar = numero % 2;

        if(parOuImpar == 0){
            System.out.println("É par");
        } else{
            System.out.println("É impar");
        }


        System.out.println(parOuImpar);


        /*
        if(parOuImpar != 0) {
            System.out.println("Número impar");
        } else {
            System.out.println("Número par");
        }
        */
    }

}
