package EstruturasRepetitivas.AtividadesFor;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        double valor = scan.nextInt();

        for(int i = 0; i <= valor; i++){
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }


    }


}


/*

 int linha = 1;

        for (linha = 1; linha <= valor; linha++)
            for (int j = 1; j <= valor; j++) {

                System.out.printf(linha + " ");
                System.out.printf(Math.pow(j, 2) + " ");
                System.out.printf(Math.pow(j, 3) + " ");

            }

 */