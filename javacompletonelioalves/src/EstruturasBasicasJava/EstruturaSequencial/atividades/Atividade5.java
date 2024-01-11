package EstruturasBasicasJava.EstruturaSequencial.atividades;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int codigoPrimeirPeca;
        int codigoSegundaPeca;
        double valorUnitarioPrimeiraPeca;
        double valorUnitarioSegundaPeca;
        int quantidadePrimeiraPeca;
        int quantidadeSegundaPeca;
        double conversaoQuantidadeValorPrimeiro;
        double conversaoQuantidadeValorSegundo;
        double totalApagar;

        System.out.println("Informe o código, quantidade e preço da primeira peça: ");
        codigoPrimeirPeca = scan.nextInt();
        quantidadePrimeiraPeca = scan.nextInt();
        valorUnitarioPrimeiraPeca = scan.nextDouble();
        conversaoQuantidadeValorPrimeiro = valorUnitarioPrimeiraPeca * quantidadePrimeiraPeca;

        System.out.println("Informe o código, quantidade e preço da segunda peça: ");
        codigoSegundaPeca = scan.nextInt();
        quantidadeSegundaPeca = scan.nextInt();
        valorUnitarioSegundaPeca = scan.nextDouble();
        conversaoQuantidadeValorSegundo = valorUnitarioSegundaPeca * quantidadeSegundaPeca;

        totalApagar = conversaoQuantidadeValorPrimeiro + conversaoQuantidadeValorSegundo;


        System.out.printf("VALOR A PAGAR: R$ %.2f%n",totalApagar);









    }
}
