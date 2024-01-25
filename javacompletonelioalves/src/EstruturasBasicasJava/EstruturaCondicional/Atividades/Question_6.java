package EstruturasBasicasJava.EstruturaCondicional.Atividades;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double primeiroIntervalo = 25;
        double segundoIntervalo = 25.50;
        double terceiroIntervalor = 50.75;
        double quartoIntervalor = 75.100;

        System.out.println("Digite o valor do intervalo: ");
        double valorIntervalo = scan.nextDouble();

        if (valorIntervalo <= primeiroIntervalo) {
            System.out.println("Intervalo (0,25)");
        } else if (valorIntervalo <= segundoIntervalo) {
            System.out.println("Intervalo (25,50)");
        } else if (valorIntervalo <= terceiroIntervalor) {
            System.out.println("Intervalo (50,75)");
        } else if (valorIntervalo > quartoIntervalor) {
            System.out.println("Intervalo (75,100)");
        }


    }
}

// Refazer depois essa questão....s