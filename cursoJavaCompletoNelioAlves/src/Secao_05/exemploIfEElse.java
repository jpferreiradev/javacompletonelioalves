package Secao_05;

import java.util.Scanner;

public class exemploIfEElse {
    static void main() {

        Scanner scan = new Scanner(System.in);
        int hora;

        System.out.print("Quantos horas: ");
        hora = scan.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia ");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }


        scan.close();
    }

}
