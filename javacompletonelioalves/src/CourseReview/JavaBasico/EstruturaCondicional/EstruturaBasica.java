package CourseReview.JavaBasico.EstruturaCondicional;

import java.util.Scanner;

public class EstruturaBasica {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = scan.nextInt();


        // Sintaxe simples
        if(idade >= 18){
            System.out.println("Maior de idade");
        }

        // Sintaxe composta
        if(idade >= 18){
            System.out.println("Maior de idade!");
        } else{
            System.out.println("Menor de idade!");
        }

    }
}
