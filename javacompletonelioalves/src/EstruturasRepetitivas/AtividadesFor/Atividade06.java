package EstruturasRepetitivas.AtividadesFor;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int divisao;

        System.out.println("Digite um valor inteiro: ");
        int n = scan.nextInt();

        //divisao = n / n;
        //System.out.println(divisao);


        for (int i = 0; i < n; i++) {
            divisao = n / n;
            System.out.println(divisao);
        }

    }
}
