package courseOld.EstruturasBasicasJava.EstruturaSequencial.atividades;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int diferenca;

        System.out.println("Digite o valor A");
        int valorA = scan.nextInt();
        System.out.println("Digite o valor B");
        int valorB = scan.nextInt();
        System.out.println("Digite o valor C");
        int valorC = scan.nextInt();
        System.out.println("Digite o valor D");
        int valorD = scan.nextInt();

        diferenca = (valorA * valorB - valorC * valorD);

        System.out.println("DIFERENCA = " + diferenca);


    }
}
