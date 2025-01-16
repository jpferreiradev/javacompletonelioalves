package CourseReview.JavaBasico.ExemploFuncoes;

import java.util.Scanner;

public class SemFuncao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a > b && a > c){
            System.out.println("Maior: " + a);
        } else if (b > c ) {
            System.out.println("Maior: " + b);
        } else{
            System.out.println("Maior: " + c);
        }

    }
}
