package JavaBasico.EstruturasRepetitivas.Atividades.ListaForWhile;

import java.util.Scanner;

public class Atividade02 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        String nome, senha;


        do {
            System.out.println("Informe o seu nome: ");
            nome = scan.nextLine();
            System.out.println("Informe o seu senha: ");
            senha = scan.nextLine();
            if (!nome.equalsIgnoreCase(senha)) {
                System.out.println("Senha criada com sucesso!");
            } else {
                System.out.println("Sua senha não pode ser igual ao seu nome, informe outra senha: ");
                senha = scan.nextLine();
                System.out.println("Senha alterada com sucesso!");
            }
        }
        while (senha.equals(nome));

    }


}

