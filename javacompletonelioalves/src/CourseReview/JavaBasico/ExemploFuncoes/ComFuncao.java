package CourseReview.JavaBasico.ExemploFuncoes;

import java.util.Scanner;

public class ComFuncao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int maior = max(a, b, c);

        showResult(maior);
    }

    public static int max(int a, int b, int c) {
        int maior;
        if (a > b && a > c) {
            maior = a;
        } else if (b > c) {
            maior = b;
        } else {
            maior = c;
        }
        return  maior;
    }
    public static void showResult(int valor) {
        System.out.println("Maior: " + valor);
    }
}




