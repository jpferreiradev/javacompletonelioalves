package CourseReview.QuestoesDoCurso.SecaoSeis.For;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int primeiroMaior = 0;
        int segundoMaior = 0;

        for (int i = 0; i < 3; i++) {
            int x = scan.nextInt();

            if (x > primeiroMaior) {
                primeiroMaior = x;

            }

            if(primeiroMaior == x){
                segundoMaior = primeiroMaior;
            }

        }

        System.out.println("Maior: " + primeiroMaior);
        System.out.println("Ainda maior: " + segundoMaior);
    }
}
