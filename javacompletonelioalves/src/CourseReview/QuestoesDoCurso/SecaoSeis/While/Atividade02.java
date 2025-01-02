package CourseReview.QuestoesDoCurso.SecaoSeis.While;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x, y;

        //System.out.println("Informe o valor de X: ");
        x = scan.nextInt();
        //System.out.println("Informe o valor de y: ");
        y = scan.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }
            x = scan.nextInt();
            y = scan.nextInt();

        }


        }
    }
