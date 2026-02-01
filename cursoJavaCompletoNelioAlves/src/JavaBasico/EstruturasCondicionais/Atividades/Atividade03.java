package JavaBasico.EstruturasCondicionais.Atividades;

import java.util.Scanner;

public class Atividade03 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int numero1, numero2;

        numero1 = scan.nextInt();
        numero2 = scan.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println("Número multiplo");
        } else if(numero2 % numero1 == 0){

            System.out.println("Número multiplo!");
        } else{
            System.out.println("Não são multiplos!");
        }
        /*
        else if (numero2 > numero1 && numero2 % numero1 == 0) {
            System.out.println("Número não multiplo");
        } else if (numero1 % numero2 == 0) {
            System.out.println("Número multiplo!");
        }

         */
    }
}
