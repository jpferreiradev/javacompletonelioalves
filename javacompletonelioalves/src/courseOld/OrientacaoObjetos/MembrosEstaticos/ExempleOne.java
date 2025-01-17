package courseOld.OrientacaoObjetos.MembrosEstaticos;

import java.util.Scanner;

public class ExempleOne {
    // Exemplo de métodos na propria classe do programa

    public static double PI = 3.14159; // exemplo de membro estático e CONSTANTE
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = scan.nextDouble();

        double c = circumference(radius);
        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

    }

    public static double circumference(double radius){ // exemplo de metodo estático
        return 2.0 * PI * radius;
    }
    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}
