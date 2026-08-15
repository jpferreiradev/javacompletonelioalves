package Secao_08.exemploMembrosEstaticos.primeiraVersao.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static final double PI = 3.14159; // Membro estático, constante

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor do raio: ");
        double raio = scan.nextDouble();

        double c = circunferencia(raio);

        double v = volume(raio);

        System.out.printf("Circurferencia: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor de PI: %.2f%n ",PI);



        scan.close();
    }
    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }
    public static double volume(double radio) {
        return 4.0 * PI * radio * radio * radio / 3.0;
    }
}
