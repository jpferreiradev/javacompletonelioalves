package CourseReview.JavaBasico.EstruturaRepetitiva;

import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scan.nextInt();

        while(numero != 0){
            System.out.println("Informe novamente esse número: ");
            numero = scan.nextInt();
        }
    }
}
