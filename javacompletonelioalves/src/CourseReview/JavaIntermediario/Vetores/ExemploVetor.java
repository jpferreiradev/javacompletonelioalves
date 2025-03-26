package CourseReview.JavaIntermediario.Vetores;

import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de nomes:");
        int quantidade = scan.nextInt();


        String[] nomes = new String[quantidade];

        for(int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o nome do " + (i + 1) + ":");
            nomes[i] = scan.next();

        }

        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }



    }
}
