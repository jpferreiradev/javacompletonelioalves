package JavaBasico.EstruturasRepetitivas.Atividades;

import java.util.Scanner;

public class Atividade02 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores: ");
        int quantidade = scan.nextInt();

        int in = 0;
        int out = 0;
        int valores = 0;


        for (int i = 0; i < quantidade; i++) {
            int valor = scan.nextInt();

            if (valor >= 10 && valor <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

    }

}




/*
        for(int i = 0; i < quantidade; i++){
            if(valor > 10 && valor < 20){
                System.out.println(in++);

            }
 */
