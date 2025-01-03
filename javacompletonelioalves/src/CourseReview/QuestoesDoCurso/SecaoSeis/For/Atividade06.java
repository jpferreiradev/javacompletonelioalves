package CourseReview.QuestoesDoCurso.SecaoSeis.For;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        for(int i =1; i <= numero; i++){
            if(numero % i == 0){
                System.out.println(i);
            }
        }

    }
}
