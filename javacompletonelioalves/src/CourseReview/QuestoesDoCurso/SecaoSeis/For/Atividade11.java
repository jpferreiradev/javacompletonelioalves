package CourseReview.QuestoesDoCurso.SecaoSeis.For;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos alunos tem na sua sala: ");
        int quantidade = scan.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe a " + (i + 1) + "nota do aluno: ");


        }


    }
}

