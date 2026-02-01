package JavaBasico.EstruturasCondicionais.Atividades;

import java.util.Scanner;

public class Atividade05 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int codigoItem,quantidadeItem;
        double valorItem;

        codigoItem = scan.nextInt();
        quantidadeItem = scan.nextInt();

        if(codigoItem == 1){
            valorItem = 5.00 *  quantidadeItem;
            System.out.println(valorItem);
        } else if (codigoItem == 2) {
            valorItem = 4.50 *  quantidadeItem;
            System.out.println(valorItem);
        } else if (codigoItem == 3) {
            valorItem = 5.00 *  quantidadeItem;
            System.out.println(valorItem);
        } else if (codigoItem == 4) {
            valorItem = 2.00 *  quantidadeItem;
            System.out.println(valorItem);
        } else {
            valorItem = 1.50 *  quantidadeItem;
            System.out.println(valorItem);
        }

    }
}
