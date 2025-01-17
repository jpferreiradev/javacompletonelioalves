package courseOld.EstruturasBasicasJava.EstruturaCondicional.Atividades;


import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double cachorroQuente = 4.00;
        double x_salada = 4.50;
        double x_bacon = 5.00;
        double torradaSimples = 2.00;
        double refrigerante = 1.50;
        double valorTotal;


        System.out.println("Informe o código do item e a quantidade: ");
        int valorCodigo = scan.nextInt();
        int valorQuantidade = scan.nextInt();

        if (valorCodigo == 1) {
            valorTotal = valorQuantidade * cachorroQuente;
            System.out.println("Total: R$" + valorTotal);

        } else if (valorCodigo == 2) {
            valorTotal = valorQuantidade * x_salada;
            System.out.println("Total: R$" + valorTotal);

        } else if (valorCodigo == 3) {
            valorTotal = valorQuantidade * x_bacon;
            System.out.println("Total: R$" + valorTotal);
        } else if (valorCodigo == 4) {
            valorTotal = valorQuantidade * torradaSimples;
            System.out.println("Total: R$" + valorTotal);
        } else if (valorCodigo == 5) {
            valorTotal = valorQuantidade * refrigerante;
            System.out.println("Total: R$" + valorTotal);
        }


    }
}
