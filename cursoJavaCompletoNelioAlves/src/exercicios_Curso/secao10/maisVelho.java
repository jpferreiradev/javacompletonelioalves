package exercicios_Curso.secao10;

import java.util.Scanner;

public class maisVelho {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar ?");
        int n = scan.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome do pessoa " + (i + 1) + ":");
            System.out.print("Nome: ");
            nomes[i] = scan.next();
            System.out.print("Idade:");
            idades[i] = scan.nextInt();
        }


        int cont = 0;
        for (int i = 0; i < idades.length; i++) {
            cont = idades[i] + cont;
        }

        System.out.println("PESSOA MAIS VELHA: ");
        int maior = idades[0];
        int posicaoMaior = 0;

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > maior) {
                maior = idades[i]; // aqui recebe o maior valor
                posicaoMaior = i; // essa não conseguir entender direito
            }
        }
        System.out.println(nomes[posicaoMaior]); // Não sabia que poderia colocar um vetor com String, a posição dele
        System.out.println("Contador de idades: " + cont);
    }
}
