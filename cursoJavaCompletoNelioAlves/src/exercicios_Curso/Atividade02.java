package exercicios_Curso;

import java.util.Locale;
import java.util.Scanner;

public class Atividade02 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        double valorCirculo,conversaoValorArea;

        valorCirculo = scan.nextDouble();
        conversaoValorArea = Math.PI * (valorCirculo * valorCirculo);
        System.out.printf("A = %.4f",conversaoValorArea);


    }
}
