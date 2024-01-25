
package EstruturasBasicasJava.EstruturaSequencial.atividades;

import java.lang.Math;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double valorRaio = scan.nextDouble();

        double valorArea = Math.PI * Math.pow(valorRaio, 2);

        //System.out.println(Math.pow(valorRaio,2));
        System.out.println(valorArea);
        System.out.printf("A = %.4f", valorArea);
        //System.out.printf("%s, which price is $ %.2f%n ", product2,price2);

    }
}
