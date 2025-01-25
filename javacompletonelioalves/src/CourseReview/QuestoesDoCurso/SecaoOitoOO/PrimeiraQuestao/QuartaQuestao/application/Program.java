package CourseReview.QuestoesDoCurso.SecaoOitoOO.PrimeiraQuestao.QuartaQuestao.application;

import CourseReview.QuestoesDoCurso.SecaoOitoOO.PrimeiraQuestao.QuartaQuestao.entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        Estudante estudante = new Estudante();

        estudante.nome = scan.nextLine();
        estudante.primeiroSemestre = scan.nextDouble();
        estudante.segundoSemestre = scan.nextDouble();
        estudante.tercerioSemestre = scan.nextDouble();

        estudante.somaSemestre();





    }
}
