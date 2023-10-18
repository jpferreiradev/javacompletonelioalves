package EstruturaCondicional.Atividades;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        double x;
        double y;


        System.out.println("Informe o valor de x e de y");
        x = scan.nextDouble();
        y = scan.nextDouble();

        if(x == 0.0 && y == 0.0){
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo x");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }


    }
}
