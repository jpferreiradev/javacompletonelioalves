package EstruturaDeDados.Vetores.Atividades;

import java.util.Scanner;

public class mais_velho {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maiorIdade, posicaoMaior;

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = scan.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa");
            System.out.print("Nome: ");
            nomes[i] = scan.next();
            System.out.print("Idade: ");
            idades[i] = scan.nextInt();
        }

        maiorIdade = idades[0];
        posicaoMaior = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicaoMaior = i;

            }
        }
        System.out.println("Pessoa mais velha = " + nomes[posicaoMaior]);
    }


}

