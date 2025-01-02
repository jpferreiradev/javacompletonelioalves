package CourseReview.QuestoesDoCurso.SecaoSeis.While;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a senha certa: ");
        int senha = scan.nextInt();


        while (senha != 2002) {
            System.out.println("Senha invalida");
            senha = scan.nextInt();
            if(senha == 2002){
                System.out.println("Acesso permitido");
            }
        }

    }
}