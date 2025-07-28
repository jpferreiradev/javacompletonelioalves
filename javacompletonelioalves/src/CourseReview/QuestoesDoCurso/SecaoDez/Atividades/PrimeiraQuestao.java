package CourseReview.QuestoesDoCurso.SecaoDez.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiraQuestao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int quantidade = scan.nextInt();

        int[] numeros = new int[quantidade];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }


    }
}
