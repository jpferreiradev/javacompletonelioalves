package courseOld.OrientacaoObjetos.MembrosEstaticos;


import courseOld.OrientacaoObjetos.MembrosEstaticos.util.Calculator;

import java.util.Scanner;

public class ExemploTree {
    public static void main(String[] args) {

        // Exemplo três, criada a class Calculator para instanciamento dos metodos
        Scanner scan = new Scanner(System.in);



        System.out.print("Enter radius:");
        double radius = scan.nextDouble();

        double c = Calculator.circumference(radius); // Método estatico, coloca a classe e chama os metodos
        double v = Calculator.volume(radius);


        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI); // Exemplo de constante estatica
    }

}