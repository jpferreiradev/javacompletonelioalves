package CourseReview.QuestoesDoCurso.SecaoSeis.For;

import java.util.Locale;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos alunos tem na turma: ");
        int quantidade = scan.nextInt();

        double cont = 0;
        double media = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe a " + (i+1) + " nota:");
            double nota = scan.nextDouble();
            cont = cont + nota;
            media = cont / quantidade;

        }
        System.out.printf("Valor das notas somadas: %.2f%n", cont);
        System.out.printf("Média das notas: %.1f%n", media);
    }
}

