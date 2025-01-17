package courseOld.EstruturasBasicasJava.EstruturasRepetitivas.AtividadesFor;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int valor = scan.nextInt();

        for (int i = 1; i <= valor; i++) {
            if( i % 2 != 0)
            System.out.println(i);
        }
    }
}

/*
        Correção: Em vez do valor da divisão ser comparado com i, colocar 2 e comparar com o valor


 */