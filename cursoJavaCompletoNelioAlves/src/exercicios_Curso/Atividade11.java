package exercicios_Curso;

import java.util.Scanner;

public class Atividade11 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int senha = scan.nextInt();

        do{
            System.out.println("Senha inválida");
            senha = scan.nextInt();
        } while(senha != 2002);
        System.out.println("Acesso permitido!!");
    }
}

