package courseOld.EstruturasBasicasJava.EstruturaSequencial;

import java.util.Scanner;

public class quebraDeLinhaPendente {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int numero;
        String s1,s2,s3;

        numero = scan.nextInt();
        scan.nextLine();
        s1 = scan.nextLine();
        s2 = scan.nextLine();
        s3 = scan.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(numero);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
