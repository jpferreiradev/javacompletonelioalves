package Secao_04;

import java.util.Scanner;

public class entradaDeDados_2 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        String s1, s2, s3;
        int x;

        x = scan.nextInt();
        scan.nextLine(); //como limpar o buffer de leitura;
        s1 = scan.nextLine();
        s2 = scan.nextLine();
        s3 = scan.nextLine();

        System.out.println("Dados digitados:\n ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(x);

        scan.close();


    }
}
