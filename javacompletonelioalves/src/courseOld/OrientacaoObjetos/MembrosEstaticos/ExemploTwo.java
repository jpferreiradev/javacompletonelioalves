package courseOld.OrientacaoObjetos.MembrosEstaticos;

import courseOld.OrientacaoObjetos.MembrosEstaticos.util.Calculator;

import java.util.Scanner;

public class ExemploTwo {
    public static void main(String[] args) {

        // Exemplo dois, criada a class Calculator para instanciamento
        Scanner scan = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.print("Enter radius:");
        double radius = scan.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

    }
}

