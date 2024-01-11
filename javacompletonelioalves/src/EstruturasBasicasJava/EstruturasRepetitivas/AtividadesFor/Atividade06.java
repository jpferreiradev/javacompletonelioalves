package EstruturasBasicasJava.EstruturasRepetitivas.AtividadesFor;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int divisao;


        System.out.println("Digite um valor inteiro: ");
        int n = scan.nextInt();


        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }



    }

}


/*
        divisao = n / i;
        System.out.println(divisao);
 */
