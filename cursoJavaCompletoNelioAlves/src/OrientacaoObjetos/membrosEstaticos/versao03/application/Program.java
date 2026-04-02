package OrientacaoObjetos.membrosEstaticos.versao03.application;

import OrientacaoObjetos.membrosEstaticos.versao03.util.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    static void main() {

        //Calculadora calculadora = new Calculadora();

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o raio: ");
        double raio = scan.nextDouble();

        double c = Calculadora.circunferencia(raio); // Método estatico
        double v = Calculadora.volume(raio);// Método estatico

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI valor: %.2f%n", Calculadora.PI); // Constante estatica


        scan.close();
    }


}
