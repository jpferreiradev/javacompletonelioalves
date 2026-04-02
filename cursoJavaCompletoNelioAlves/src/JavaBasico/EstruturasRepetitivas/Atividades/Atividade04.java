package JavaBasico.EstruturasRepetitivas.Atividades;

import java.util.Scanner;

public class Atividade04 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos valores vai ser: ");


        int valor = scan.nextInt();
        /*
        for (int i = 0; i < valor; i++) {
            int valor1 = scan.nextInt();
            int valor2 = scan.nextInt();

            int cal = valor / valor2;

            if (cal == 0) {
                System.out.println("Divisão impossivel");
            } else{
                System.out.println(cal);
            }

        */
        for (int i=0; i<valor; i++) {

            int x = scan.nextInt();
            int y = scan.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }

    }
}

