package JavaBasico.EstruturasRepetitivas.Atividades;

import java.util.Scanner;

public class Atividade06 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int valor = scan.nextInt();

        for (int i = 1; i < valor; i++) {

            System.out.println(valor / i);
        }
        System.out.println();
        for (int i = 1; i < valor; i++) {
            System.out.println(valor * i);
        }
    }
}

/*
 int divisor, dividendo, contaDivisao;

        divisor = scan.nextInt();
        dividendo = scan.nextInt();
        contaDivisao = divisor /dividendo;

        System.out.println(contaDivisao);
 */