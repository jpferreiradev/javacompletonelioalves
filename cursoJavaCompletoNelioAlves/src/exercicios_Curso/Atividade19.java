package exercicios_Curso;

import java.util.Scanner;

public class Atividade19 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

    }
}
