package CourseReview.JavaBasico.EstruturaRepetitiva;

import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int idade;

        do {
            System.out.println("Informe a sua idade, caso seja menor de idade vai se repetir:  ");
            idade = scan.nextInt();

        } while (idade < 18);
    }
}
