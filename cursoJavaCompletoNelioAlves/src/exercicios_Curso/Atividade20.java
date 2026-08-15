package exercicios_Curso;

import java.util.Scanner;

public class Atividade20 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = scan.nextInt();

        int valor = 0;
        int valorQuadrado = 0;
        int valorCubo = 0;


        for (int i = 0; i < num; i++) {
            valor = num;
            valorQuadrado = num * num;
            valorCubo = num * num * num;


        }
        System.out.printf(" " + valor);
        System.out.printf(" " + valorQuadrado);
        System.out.printf(" " + valorCubo);

    }
}
