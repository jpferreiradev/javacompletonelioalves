package EstruturaCondicional.Atividades;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valorPrimeiraHora;
        int valorSegundaHora;
        int calculoHoraMinuto;
        int valorDia = 24;


        System.out.println("Digite o valor da hora e do minuto: ");
        valorPrimeiraHora = scan.nextInt();
        valorSegundaHora = scan.nextInt();


        if(valorPrimeiraHora > valorSegundaHora){
            calculoHoraMinuto = valorDia - (valorPrimeiraHora - valorSegundaHora);
            System.out.println("O jogo durou " + calculoHoraMinuto + "horas");
        } else if (valorSegundaHora > valorPrimeiraHora){
            calculoHoraMinuto = valorPrimeiraHora - valorSegundaHora;
            System.out.println("O jogo durou " + calculoHoraMinuto + "horas");
        } else if (valorPrimeiraHora == 0 && valorSegundaHora == 0) {
            System.out.println("O jogo durou 24hs");
        }


    }
}
