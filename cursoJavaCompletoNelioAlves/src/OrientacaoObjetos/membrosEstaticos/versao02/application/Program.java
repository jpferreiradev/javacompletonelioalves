package OrientacaoObjetos.membrosEstaticos.versao02.application;

import OrientacaoObjetos.membrosEstaticos.versao02.util.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    static void main() {

        Calculadora calculadora = new Calculadora();

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o raio: ");
        double raio = scan.nextDouble();

        double c = calculadora.circunferencia(raio);
        double v = calculadora.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI valor: %.2f%n", calculadora.PI);


        scan.close();
    }


}
