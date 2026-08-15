package exercicios_Curso;

import java.util.Scanner;

public class Atividade17 {
    static void main() {


        Scanner scan = new Scanner(System.in);

        int nota = scan.nextInt();

        for (int i = 0; i < nota; i++) {
            int valorA = scan.nextInt();
            int valorB = scan.nextInt();


            if (valorB == 0) {
                System.out.println("Divisão impossivel");
            } else {
                double divisao = (double) valorA / valorB; // Faça casting na variavel e não na impressão
                System.out.println(divisao);
            }


        }


    }
}