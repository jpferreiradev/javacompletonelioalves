package exercicios_Curso;

import java.util.Locale;
import java.util.Scanner;

public class Atividade03 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int a, b, c, d, diferenca;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        diferenca = (a * b) - (c * d);

        System.out.println("Diferenca = " + diferenca);


    }
}
