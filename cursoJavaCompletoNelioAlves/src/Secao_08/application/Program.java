package Secao_08.application;

import Secao_08.entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        // Exemplo sem OO

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangulo x ,y;

        x = new Triangulo();
        y = new Triangulo();


        System.out.println("Entre com as medidas do triângulo A: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        System.out.println("Entre com as medidas do triângulo B: ");
        y.a = scan.nextDouble();
        y.b= scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.area(); // Ele criou uma variavel e ela recebe x + metodo( area)
        double areaY = y.area();


        System.out.printf("Triangulo X %.4f%n ",areaX);
        System.out.printf("Triangulo Y %.4f%n ",areaY);

        if(areaX > areaY){
            System.out.println("Area x é maior");
        } else{
            System.out.println("Area Y é maior");
        }


        scan.close();


    }
}
