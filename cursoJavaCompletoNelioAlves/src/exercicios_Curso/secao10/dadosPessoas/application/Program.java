package exercicios_Curso.secao10.dadosPessoas.application;

import exercicios_Curso.secao10.dadosPessoas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas?");
        int n = scan.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Altura da " + (i + 1) + "pessoa: ");
            double altura = scan.nextDouble();
            System.out.print("Genêro da " + (i + 1) + "pessoa: ");
            char genero = scan.next().charAt(0);
            pessoas[i] = new Pessoa(altura, genero);

        }

        System.out.println("Pessoas - Generos e alturas ");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].toString());
        }

        double somaAlturas = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            somaAlturas += pessoas[i].getAltura();
        }
        System.out.println("\nSoma de todas as alturas: " + somaAlturas);

        double menorAltura = pessoas[0].getAltura();
        double maiorAltura = pessoas[0].getAltura();

        for (int i = 0; i < pessoas.length; i++) {
            somaAlturas += pessoas[i].getAltura();
            if (pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            }
            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }
        }
        //System.out.println(menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);

        // Media das alturas da mulheres

        double somaAlturaM = 0.0;
        double mediaAlturaM = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            somaAlturas += pessoas[i].getAltura();
            if (pessoas[i].getSexo() == 'F' || pessoas[i].getSexo() == 'f') {
                somaAlturaM = somaAlturaM + pessoas[i].getAltura();
                mediaAlturaM = somaAlturaM / pessoas.length;
            }

        }
        System.out.printf("Soma das alturas das mulhres: %.2f%n", somaAlturaM);
        System.out.printf("Média das alturas das mulheres = %.2f", mediaAlturaM);

        int quantidedeHomens = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getSexo() == 'M' || pessoas[i].getSexo() == 'm') {
                quantidedeHomens++;
            }
        }
        System.out.println("\nQuantidade de homens: " + quantidedeHomens);
    }
}
