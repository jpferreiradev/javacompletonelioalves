package CourseReview.JavaBasico.EstruturaSequencial;

import java.util.Scanner;

public class QuebraDeLinhaPendente {
    public static void main(String[] args) {

        // EXEMPLO FEITO PELO PROFESSOR
        Scanner scan = new Scanner(System.in);

        int x;
        String s1,s2,s3;

        x = scan.nextInt();
        scan.nextLine(); // Você precisar colocar um nextLine para consumir a quebra de linha pendente, limpar o buffer de leitura, AGORA VOCÊ ENTENDEU!
        s1 = scan.nextLine();
        s2 = scan.nextLine();
        s3 = scan.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
