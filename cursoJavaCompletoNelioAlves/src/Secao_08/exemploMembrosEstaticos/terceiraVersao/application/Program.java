package Secao_08.exemploMembrosEstaticos.terceiraVersao.application;

import Secao_08.exemploMembrosEstaticos.terceiraVersao.util.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Program {

     // Membro estático, constante

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor do raio: ");
        double raio = scan.nextDouble();


        double c = Calculadora.circunferencia(raio);

        double v = Calculadora.volume(raio);

        System.out.printf("Circurferencia: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor de PI: %.2f%n ",Calculadora.PI);



        scan.close();
    }

}
