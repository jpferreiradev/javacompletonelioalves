package exercicios_Curso.secao10.atividadeAlturas.application;


import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {


    }

}

/*

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitados: ");
        int n = scan.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        Pessoa pessoa;
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome: ");
            String nome = scan.next();
            System.out.print("Idade: ");
            int idade = scan.nextInt();
            System.out.print("Altura: ");
            double altura = scan.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
        }
        System.out.println("Lista de pessoas: ");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].toString());
        }
        System.out.println();
        System.out.println("Pessoas com menos de 16 anos: ");
        int cont = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
                cont =  cont + 1;
            }
        }
        double somaAltura = 0.0;
        double media = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAltura() < 16)
                somaAltura = somaAltura + pessoas[i].getAltura();
        }

        media = somaAltura / pessoas.length;
        double mediaMenorIdade = cont * 100.0 / n;
        System.out.printf("Soma das alturas %.2f%n", somaAltura);
        System.out.printf("Altura média:  %.2f%n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",mediaMenorIdade);
 */