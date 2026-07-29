package Secao_04;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        String x;
        int numero;
        double v;
        char j;

        x = scan.nextLine();
        numero = scan.nextInt();
        v = scan.nextDouble();
        j = scan.next().charAt(0);

        System.out.println("Você digitou :" + x);
        System.out.println(numero);
        System.out.println(v);
        System.out.println(j);


        scan.close();
    }
}
