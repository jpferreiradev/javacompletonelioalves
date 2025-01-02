package CourseReview.JavaBasico.EstruturaCondicional;

import java.util.Scanner;

public class OperadoresAtribuicaoCumulativa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Informe o valor de A: ");
        int a = scan.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = scan.nextInt();

        int soma = a += b;
        int subtacao = a -= b;
        int multi = a *= b;
        int divisao = a %= b;

        System.out.println(soma);
        System.out.println(subtacao);
        System.out.println(multi);
        System.out.println(divisao);

    }
}
