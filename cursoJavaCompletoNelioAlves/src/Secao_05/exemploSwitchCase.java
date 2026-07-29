package Secao_05;

import java.util.Scanner;

public class exemploSwitchCase {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe de 1 a 7 o dia da semana: ");
        int dia = scan.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opção inválida, tente novamente");


        }
    }
}
