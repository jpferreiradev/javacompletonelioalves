package EstruturasBasicasJava.EstruturasRepetitivas.AtividadesFor;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;

        }
        System.out.println(fatorial);
    }
}
