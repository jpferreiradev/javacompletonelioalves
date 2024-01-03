package EstruturasRepetitivas.AtividadesFor;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor = scan.nextInt();

        for(int i = 0; i < valor;i++){

            double  numerador = scan.nextInt();
            double denominador = scan.nextInt();

            double divisao = numerador / denominador;

            if(denominador == 0){
                System.out.println("Divisão impossivel");
            } else{
                System.out.println(divisao);
            }


        }
    }
}
