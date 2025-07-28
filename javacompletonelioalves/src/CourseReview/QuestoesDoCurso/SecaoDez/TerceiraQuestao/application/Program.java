package CourseReview.QuestoesDoCurso.SecaoDez.TerceiraQuestao.application;

import CourseReview.QuestoesDoCurso.SecaoDez.TerceiraQuestao.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas?");
        int quantidadePessoas = scan.nextInt();



        for(int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Dados da " + (i + 1 + "a") + "pessoa:");
            System.out.print("Nome: ");
            String nome = scan.next();
            System.out.print("Idade: ");
            int idade = scan.nextInt();
            System.out.print("Altura:");
            double altura = scan.nextDouble();


        }
    }
}
