package JavaBasico.EstruturaSequencial.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class QuintaQuestao {
    static void main() {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        int codigo1,numero1,codigo2,numero2;
        double preco1,preco2,totalPagar,precoUnidade,quantidadeTotal1,quantidadeTotal2;

        codigo1 = scan.nextInt();
        numero1 = scan.nextInt();
        preco1 = scan.nextDouble();
        codigo2 = scan.nextInt();
        numero2 = scan.nextInt();
        preco2 = scan.nextDouble();

        quantidadeTotal1 = preco1 * numero1;
        quantidadeTotal2 = preco2 * numero2;
        totalPagar = quantidadeTotal1 + quantidadeTotal2;


        System.out.printf("VALOR A PAGAR R$ %.2f",totalPagar);



    }
}
