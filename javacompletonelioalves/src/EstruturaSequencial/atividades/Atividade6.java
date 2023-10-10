package EstruturaSequencial.atividades;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double letraA;
        double letraB;
        double letraC;

        System.out.println("Informe o valor de A: ");
        letraA = scan.nextDouble();
        System.out.println("Informe o valor de B: ");
        letraB = scan.nextDouble();
        System.out.println("Informe o valor de C: ");
        letraC = scan.nextDouble();

        System.out.println(letraA * letraC / 2); // Letra A
        System.out.println(Math.PI * Math.pow(letraC, 2)); // Letra B
         System.out.println((letraA + letraB) * letraC / 2); // Letra C
        System.out.println(Math.pow(letraB,2.0)); // Letra D
        System.out.println(letraA * letraB); // Letra E


    }
}
