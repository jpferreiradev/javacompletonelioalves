package CourseReview.QuestoesDoCurso.SecaoDez;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scan.nextInt();

        if(numero % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
    }
}
