package CourseReview.QuestoesDoCurso.SecaoSeis.For;

import java.util.Locale;
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas: ");
        int quantidade = scan.nextInt();


        for (int i = 0; i < quantidade; i++) {

            double notaA = scan.nextDouble();
            double notaB = scan.nextDouble();
            double notaC = scan.nextDouble();

            double media = (notaA * 2 + notaB * 3 + notaC * 5) / 10;
            System.out.printf("%.1f", media);

        }


    }
}
