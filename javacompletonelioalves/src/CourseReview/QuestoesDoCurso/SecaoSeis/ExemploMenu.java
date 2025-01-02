package CourseReview.QuestoesDoCurso.SecaoSeis;

import java.util.Scanner;

public class ExemploMenu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int escolha = scan.nextInt();

        while(escolha != 2){
            escolha = scan.nextInt();
        }
    }
}
