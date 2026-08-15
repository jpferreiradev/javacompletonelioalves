package exercicios_Curso;

import java.util.Scanner;

public class Atividade13 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int alcool = 0,gasolina = 0,diesil = 0,codigo;

        System.out.print("Informe o código: ");
        codigo = scan.nextInt();

        while(codigo != 4){
            if(codigo == 1){
                alcool = alcool + 1;
            } else if (codigo == 2) {
                gasolina = gasolina + 1;
            }  else if (codigo == 3) {
                diesil = diesil + 1;
            }
            codigo = scan.nextInt();
        }
        System.out.println("Muito obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesil: " + diesil);

    }
}
