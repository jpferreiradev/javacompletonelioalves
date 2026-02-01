package JavaBasico.EstruturaSequencial;

import java.util.Scanner;

public class ExemploOperadoresAritmetricos {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int valor,valor2;

        System.out.print("Informe o primeiro valor: ");
        valor = scan.nextInt();
        System.out.print("Informe o segundo valor: ");
        valor2 = scan.nextInt();

        System.out.println("Adição: " + (valor + valor2));
        System.out.println("Subtração: " + (valor - valor2));
        System.out.println("Multiplicação: " + (valor * valor2));
        System.out.println("Divisão: "+  (valor / valor2));

    }
}
