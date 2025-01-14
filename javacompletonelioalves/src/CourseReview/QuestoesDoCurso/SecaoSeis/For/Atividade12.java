package CourseReview.QuestoesDoCurso.SecaoSeis.For;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        int maior = 0;
        for (int i = 0; i < 10; i++) {
            int x = scan.nextInt();

            if (x > maior) {
                maior =  x;
            }

        }
        System.out.println("Maior: " + maior);
    }

}
