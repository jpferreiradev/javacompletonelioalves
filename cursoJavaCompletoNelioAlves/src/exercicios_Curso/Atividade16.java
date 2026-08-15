package exercicios_Curso;

import java.util.Locale;
import java.util.Scanner;

public class Atividade16 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int nota = scan.nextInt();

        double media = 0;
        for (int i = 0; i < nota; i++) {
            double notaA = scan.nextDouble();
            double notaB = scan.nextDouble();
            double notaC = scan.nextDouble();

            media = (notaA * 2.0 + notaB * 3.0 + notaC * 5.0) / 10;

            System.out.println(media);
        }


    }

}