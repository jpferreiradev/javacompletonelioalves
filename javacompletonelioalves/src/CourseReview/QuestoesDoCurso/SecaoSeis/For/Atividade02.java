package CourseReview.QuestoesDoCurso.SecaoSeis.For;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();


        int in = 0;
        int out = 0;

        for (int i = 0; i < numero; i++) {

            int x = scan.nextInt();

            if (x >= 10 && x <= 20) {
                in = in + 1;

            }else {
                out = out + 1;
            }


        }
        System.out.println("In: " + in);
        System.out.println("Out: " + out);
    }
}
