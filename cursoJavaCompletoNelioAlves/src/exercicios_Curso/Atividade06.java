package exercicios_Curso;

import java.util.Scanner;

public class Atividade06 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Não negativo");
        }
    }
}
