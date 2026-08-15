package exercicios_Curso;

import java.util.Scanner;

public class Atividade15 {
    static void main() {

        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt(); // tamanho do for

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt(); // outra variavel para pegar os numeros digitados
            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}
