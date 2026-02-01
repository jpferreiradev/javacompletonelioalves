package JavaBasico.EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExemploDoWhile {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // DO-WHILE
        double temperaturaCelsius, conversaoCelsiusFahrenheit;
        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            temperaturaCelsius = scan.nextDouble();
            conversaoCelsiusFahrenheit = (temperaturaCelsius * 1.8) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", conversaoCelsiusFahrenheit);
            System.out.print("Deseja repetir: (s/n): ");
            resp = scan.next().charAt(0);

        } while (resp != 'n');


    }

}

