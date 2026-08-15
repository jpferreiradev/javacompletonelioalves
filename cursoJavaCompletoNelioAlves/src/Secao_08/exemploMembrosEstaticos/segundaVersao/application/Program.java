package Secao_08.exemploMembrosEstaticos.segundaVersao.application;

import Secao_08.exemploMembrosEstaticos.segundaVersao.util.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Program {

     // Membro estático, constante

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor do raio: ");
        double raio = scan.nextDouble();
        Calculadora calculadora = new Calculadora();

        double c = calculadora.circunferencia(raio);

        double v = calculadora.volume(raio);

        System.out.printf("Circurferencia: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor de PI: %.2f%n ",calculadora.PI);



        scan.close();
    }

}
