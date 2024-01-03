package OrientacaoObjetos.application;

import OrientacaoObjetos.entitiesComOO.Triangle;

import java.util.Scanner;

public class ExemploClasseSemOo {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle(); // Instancia o objeto
        y = new Triangle();

        System.out.println("Entre com as medidas de X ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        System.out.println("Entre com as medidas de Y");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();


        double areaX = x.area(); // Chamando o método
        double areaY = y.area();

        System.out.println(areaX);
        System.out.println(areaY);

        if (areaX > areaY) {
            System.out.println("A area X é maior");
        } else {
            System.out.println("A area Y é maior");
        }
    }
}
