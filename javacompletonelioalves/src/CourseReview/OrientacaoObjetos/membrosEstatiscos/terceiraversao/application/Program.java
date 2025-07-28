package CourseReview.OrientacaoObjetos.membrosEstatiscos.terceiraversao.application;

import CourseReview.OrientacaoObjetos.membrosEstatiscos.terceiraversao.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o radio: ");
        double raio = scan.nextDouble();

        double c = Calculator.circunferencia(raio);
        double v =  Calculator.volume(raio);

        System.out.printf("Circuferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculator.PI);




    }
}


