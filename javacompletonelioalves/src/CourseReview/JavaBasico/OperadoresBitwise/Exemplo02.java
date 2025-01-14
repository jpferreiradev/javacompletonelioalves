package CourseReview.JavaBasico.OperadoresBitwise;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mascara = 32;
        // Em binario
        int mascaraaBinario = 0b100000;
        int n = scan.nextInt();

        if((n & mascaraaBinario) != 0 ){
            System.out.println(" O 6 bit é verdadeiro!");
        } else{
            System.out.println("O 6 bit é falso!");
        }

    }
}
