package CourseReview.QuestoesDoCurso.SecaoSeis.For;

import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho: ");
        int num = scan.nextInt();

        for (byte c = 0; c < num; c++) { //linha superior
            System.out.print("#");
        }

        System.out.println("");

        for (byte b = 0; b < num - 2; b++) { //linhas do meio
            System.out.print("#");
            for (byte c1 = 0; c1 < num - 2; c1++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }


        for (byte c3 = 0; c3 < num; c3++) { //linha inferior
            System.out.print("#");
        }


        System.out.println("");

    }
}

