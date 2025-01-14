package CourseReview.QuestoesDoCurso.SecaoSeis.For;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho: ");
        int tamanho = scan.nextInt();

        for(int i =0; i < tamanho;i++){
            for(int n = 0; n < tamanho;n++){
                System.out.print("****");
            }
            System.out.println(" ");
        }

    }
}
