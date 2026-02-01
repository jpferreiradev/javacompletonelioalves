package JavaBasico.EstruturasCondicionais;

import java.util.Scanner;

public class ExemploEstruturaCondicional {
    static void main() {


        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a hora:");
        int hora = scan.nextInt();

        if (hora <= 12) {
            System.out.println("Bom dia");
        } else if (hora <= 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }


    }
}
