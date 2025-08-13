package CourseReview.OrientacaoObjetos.ComOO.application;

import CourseReview.OrientacaoObjetos.ComOO.entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangulo x;
        Triangulo y;

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com os valores de X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Entre com os valores de Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.area();
        double areaY = y.area();


        System.out.printf("Triângulo área X: %.4f%n", areaX);
        System.out.printf("Triângulo área Y: %.4f%n", areaY);


        if (areaX > areaY) {
            System.out.println("Area do triângulo X é maior");
        } else {
            System.out.println("Area do triângulo Y é maior");
        }


    }
}
