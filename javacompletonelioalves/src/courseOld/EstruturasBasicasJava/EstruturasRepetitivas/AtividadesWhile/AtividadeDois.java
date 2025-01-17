package courseOld.EstruturasBasicasJava.EstruturasRepetitivas.AtividadesWhile;

import java.util.Scanner;

public class AtividadeDois {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor das coordenadas:");
        int coordenadaX = scan.nextInt();
        int coordenadaY = scan.nextInt();

        System.out.println("Valor coordenada X:" + coordenadaX + ", Valor coordenada Y:" + coordenadaY);

        while (coordenadaX != 0 && coordenadaY != 0) {
            if (coordenadaX > 0 && coordenadaY > 0) {
                System.out.println("Primeiro");
            } else if (coordenadaX < 0 && coordenadaY > 0) {
                System.out.println("Segundo");
            } else if (coordenadaX < 0 && coordenadaY < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");

            }
            coordenadaX = scan.nextInt();
            coordenadaY = scan.nextInt();

        }


    }


}