package CourseReview.QuestoesDoCurso.SecaoSeis.For;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        System.out.print("DIGITE O TAMANHO >>>> ");
        num = scan.nextInt();
        for (int c = 0; c < num; c++) { // linha por linha
            for (int c1 = 0; c1 < num; c1++) {
                System.out.print("==");
            }
            System.out.println("");
        }
    }
}

