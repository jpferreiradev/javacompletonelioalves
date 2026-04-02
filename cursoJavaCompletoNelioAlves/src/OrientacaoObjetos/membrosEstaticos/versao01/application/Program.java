package OrientacaoObjetos.membrosEstaticos.versao01.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static final double PI = 3.14159; // Exemplo de constante no Java e estatica;

    static void main() {


        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o raio: ");
        double raio = scan.nextDouble();

        double c = circunferencia(raio);
        double v = volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI valor: %.2f%n", PI);


        scan.close();
    }

    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }


}
