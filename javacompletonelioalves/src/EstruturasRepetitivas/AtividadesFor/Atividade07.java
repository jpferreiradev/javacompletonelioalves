package EstruturasRepetitivas.AtividadesFor;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        double valor = scan.nextInt();

        int linha = 1;

        for (linha = 1; linha <= valor; linha++)
            for (int j = 1; j <= valor; j++) {

                System.out.print(linha + " ");
                System.out.print(Math.pow(j, 2) + " ");
                System.out.print(Math.pow(j, 3) + " ");

            }

    }


}


/*



            }

        }
 */