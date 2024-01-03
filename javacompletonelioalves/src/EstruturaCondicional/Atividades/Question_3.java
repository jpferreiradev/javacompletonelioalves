package EstruturaCondicional.Atividades;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int numeroA;
        int numeroB;
        int numeroMultiplo;

        System.out.println("Digite dois números inteiros: ");
        numeroA  = scan.nextInt();
        numeroB = scan.nextInt();

        numeroMultiplo = numeroA % numeroB;

        System.out.println(numeroMultiplo);

        if(numeroMultiplo == 0 || numeroMultiplo == numeroA){
            System.out.println("São multiplos ");
        } else {
            System.out.println("Não multiplos");
        }

    }
}
