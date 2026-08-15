package exercicios_Curso;

import java.util.Scanner;

public class Atividade14 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        for (int i = 0; i < numero; i++) {


            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
