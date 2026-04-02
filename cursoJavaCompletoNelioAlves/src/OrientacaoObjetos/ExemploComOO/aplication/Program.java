package OrientacaoObjetos.ExemploComOO.aplication;

import OrientacaoObjetos.ExemploComOO.entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();


        System.out.println("Entre com os lados do triângulo A: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        System.out.println("Entre com a medidas do triângulo Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangulo X area: %.4f%n ", areaX);
        System.out.printf("Triangulo Y area: %.4f%n ", areaY);

        if (areaX > areaY) {
            System.out.println("A maior area é X!");
        } else {
            System.out.println("A maior área é Y! ");
        }

        scan.close();
    }
}
