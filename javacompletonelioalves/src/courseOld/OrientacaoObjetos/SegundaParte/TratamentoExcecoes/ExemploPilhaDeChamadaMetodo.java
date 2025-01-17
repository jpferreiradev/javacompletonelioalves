package courseOld.OrientacaoObjetos.SegundaParte.TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploPilhaDeChamadaMetodo {
    public static void main(String[] args) {


        metodo1();
        System.out.println("Fim do programa....");
    }

    public static void metodo1() {
        System.out.println("------METODO  1 START------");
        metodo2();
        System.out.println("------METODO  1 END------");
    }

    public static void metodo2() {
        System.out.println("METODO 2 START");
        Scanner scan = new Scanner(System.in);

        try {
            String[] vetor = scan.nextLine().split(" ");
            int posicao = scan.nextInt();
            System.out.println(vetor[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
            e.printStackTrace();
            scan.next();
        } catch (InputMismatchException e) {
            System.out.println("Erro na entrada");
        }
        System.out.println("METODO 2 END");
    }
}

