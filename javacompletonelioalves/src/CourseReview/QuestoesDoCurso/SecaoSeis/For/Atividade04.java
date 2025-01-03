package CourseReview.QuestoesDoCurso.SecaoSeis.For;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de números: ");
        int quantidade = scan.nextInt();


        for (int i = 0; i < quantidade; i++) {
            int dividendo = scan.nextInt();
            int divisor = scan.nextInt();

            if(divisor == 0){
                System.out.println("Divisão impossivel");
            } else{
                double div = (double) dividendo / divisor;
                System.out.println(div);
            }



        }

    }
}
