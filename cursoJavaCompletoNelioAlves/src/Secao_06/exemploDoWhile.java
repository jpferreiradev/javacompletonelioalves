package Secao_06;

import java.util.Locale;
import java.util.Scanner;

public class exemploDoWhile {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        char resposta;
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double C = scan.nextDouble();
            double F = 9.0 * C / 5.0 + 32;
            System.out.printf("Equivalnte em Fahrenheit: %.1f%n", F);
            System.out.println("Deseja repetir ( s/ n)?");
            resposta = scan.next().charAt(0);
        } while (resposta != 'n');


        scan.close();
    }
}
