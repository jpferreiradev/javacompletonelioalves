package EstruturasBasicasJava.EstruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicionalSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        int x  = scan. nextInt();
        String dia;

        switch (x){
            case 1:
                dia = ("Domingo");
                break;
            case 2:
                dia = ("Segunda");
                break;
            case 3:
                dia = ("Terça");
                break;
            case 4:
                dia = ("Quarta");
                break;
            case 5:
                dia = ("Quinta");
                break;
            case 6:
                dia = ("Sexta");
                break;
            case 7:
                dia = ("Sabado");
                break;
            default:
                dia = "Dia inválido";
                break;

        }
        System.out.println("Dia da semana: " + dia);
    }

}


