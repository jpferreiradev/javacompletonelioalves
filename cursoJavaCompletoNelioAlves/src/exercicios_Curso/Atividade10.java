package exercicios_Curso;

import java.util.Locale;
import java.util.Scanner;

public class Atividade10 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int codigo,quantidadeItem;
        double preco,conversaoValor;

        codigo = scan.nextInt();
        quantidadeItem = scan.nextInt();

        if(codigo == 1){
            preco = 4.00;
            conversaoValor = preco * quantidadeItem;
            System.out.printf("Total: R$ %.2f ",conversaoValor);
        } else if (codigo == 2) {
            preco = 4.50;
            conversaoValor = preco * quantidadeItem;
            System.out.printf("Total: R$ %.2f ",conversaoValor);
        } else if (codigo == 3) {
            preco = 5.00;
            conversaoValor = preco * quantidadeItem;
            System.out.printf("Total: R$ %.2f ",conversaoValor);
        } else if (codigo == 4) {
            preco = 2.00;
            conversaoValor = preco * quantidadeItem;
            System.out.printf("Total: R$ %.2f ",conversaoValor);
        } else if (codigo == 5) {
            preco = 1.50;
            conversaoValor = preco * quantidadeItem;
            System.out.printf("Total: R$ %.2f ",conversaoValor);
        }



    }
}
