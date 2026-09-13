package Secao_14.exemploEstruturaTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exemplo_01 {
    static void main() {

// Mostrando a posição do elemento do vetor;

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


    }


}

