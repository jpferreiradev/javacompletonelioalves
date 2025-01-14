package CourseReview.JavaBasico.EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExemploDoWhileDois {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // Exemplo While

        System.out.println("Digite a temperatura em Celsius: ");
        double c = scan.nextDouble();
        double F = 9.0 * c / 5.0 + 32.0;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n ", F);
        System.out.println("Deseja repetir s/n");
        char resposta = scan.next().charAt(0);

        // Exemplo com while
        while (resposta != 'n') {
            System.out.println("Digite a temperatura em Celsius: ");
            c = scan.nextDouble();
            F = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n ", F);
            System.out.println("Deseja repetir s/n");
            resposta = scan.next().charAt(0);
        }
        // Exemplo do While, a variavel resposta vai funcionar, mas colocando ela fora da estrutura de repetição
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            c = scan.nextDouble();
            F = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n ", F);
            System.out.println("Deseja repetir s/n");
            resposta = scan.next().charAt(0);
        } while (resposta != 'n');

    }
}
