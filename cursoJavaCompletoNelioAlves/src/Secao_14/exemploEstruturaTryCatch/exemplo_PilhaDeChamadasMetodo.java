package Secao_14.exemploEstruturaTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exemplo_PilhaDeChamadasMetodo {
    static void main() {

        metodo1();
        System.out.println("Fim do programa!");


    }

    public static void metodo1() {
        System.out.println("*** MÉTODO 1 STAR *** ");
        metodo2();
        System.out.println("*** MÉTODO 1 STAR END *** ");
    }

    public static void metodo2() {
        System.out.println("*** MÉTODO 2 STAR *** ");
        Scanner scan = new Scanner(System.in);
        try {
            String[] vetor = scan.nextLine().split(" ");
            int posicao = scan.nextInt();
            System.out.println(vetor[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
            e.printStackTrace(); // Imprimir na tela o rastreamento da stack
            scan.next();
        } catch (InputMismatchException e) {
            System.out.println("Erro de input!");
        }
        scan.close();
        System.out.println("*** MÉTODO 2 STAR END*** ");
    }
}

