package EstruturasRepetitivas;

import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de vezes: ");
        int x = scan.nextInt();

        int soma = 0;
        for (int i = 0; i < x; i++) {
            int y = scan.nextInt();
            soma = soma + y;

        }
        System.out.println(soma);
    }
}
