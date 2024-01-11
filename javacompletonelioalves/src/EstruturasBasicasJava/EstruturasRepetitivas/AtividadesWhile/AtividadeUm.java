package EstruturasBasicasJava.EstruturasRepetitivas.AtividadesWhile;

import java.util.Scanner;

public class AtividadeUm {
    public static void main(String[]agrs){

        Scanner scan = new Scanner(System.in);

        int senha;

        System.out.println("Digite a senha:");
        senha = scan.nextInt();

        while(senha != 2002){
            System.out.println("Senha inválida");
            senha = scan.nextInt();
        }

        System.out.println("Acesso permitido");

    }
}
