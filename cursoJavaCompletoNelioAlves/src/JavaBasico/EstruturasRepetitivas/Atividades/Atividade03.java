package JavaBasico.EstruturasRepetitivas.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade03 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Informe quantos valores vai ser: ");
        int valor = scan.nextInt();

        for (int i = 0; i < valor; i++) {
            double nota = scan.nextDouble();

        }
        */


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        sc.close();

    }
}
