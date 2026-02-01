package JavaBasico.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosScanner {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String x;
        int a;
        double b;
        char j;

        /*
        x = scan.next();
        a = scan.nextInt();
        b = scan.nextDouble();
        j = scan.next().charAt(0);

        System.out.println(x); // Saída de dados
        System.out.println(a);
        System.out.println(b);
        System.out.println(j);
        */

        String s1, s2, s3;
        a = scan.nextInt();
        scan.nextLine(); // Faça um nextLine extra antes de fazer o nextLine do seu interrese, isso serve para limpar o buffer de leitura;
        s1 = scan.nextLine();
        s2 = scan.nextLine();
        s3 = scan.nextLine();

        System.out.println("DADOS DIGITADOS");
        System.out.println(a);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        scan.close();

    }
}
