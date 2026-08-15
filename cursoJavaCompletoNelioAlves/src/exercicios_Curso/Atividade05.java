package exercicios_Curso;

import java.util.Locale;
import java.util.Scanner;

public class Atividade05 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int codigoPecaUm, codigoPecaDois, quantidadePecaUm, quantidadePecaDois;
        double valorUnitarioPecaUm, valorUnitarioPecaDois, conversorValorPecaUm, conversorValorPecaDois, valorTotalCompra;

        codigoPecaUm = scan.nextInt();
        quantidadePecaUm = scan.nextInt();
        valorUnitarioPecaUm = scan.nextDouble();
        codigoPecaDois = scan.nextInt();
        quantidadePecaDois = scan.nextInt();
        valorUnitarioPecaDois = scan.nextDouble();
        conversorValorPecaUm = quantidadePecaUm * valorUnitarioPecaUm;
        conversorValorPecaDois = quantidadePecaDois * valorUnitarioPecaDois;
        valorTotalCompra = conversorValorPecaUm + conversorValorPecaDois;

        System.out.printf("VALOR A PAGAR: R$ %.2f ", valorTotalCompra);


    }
}
