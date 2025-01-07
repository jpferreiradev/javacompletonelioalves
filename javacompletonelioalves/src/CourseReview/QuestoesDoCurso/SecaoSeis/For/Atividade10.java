package CourseReview.QuestoesDoCurso.SecaoSeis.For;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scan.nextInt();


        System.out.println("Numeros pares: ");
        for (int i = 1; i < numero; i++) {
            if (i % 2 == 0) {
                System.out.printf(" " + i);

            }

       }
        System.out.println();
        System.out.println("Numeros impares: ");
        for (int i = 1; i < numero; i++) {
            if (i % 2 != 0) {
                System.out.printf(" " + i);

            }

        }

    }
}

