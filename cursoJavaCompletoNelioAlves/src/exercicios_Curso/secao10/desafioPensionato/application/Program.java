package exercicios_Curso.secao10.desafioPensionato.application;

import exercicios_Curso.secao10.desafioPensionato.entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        Estudante[] estudantes = new Estudante[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = scan.nextInt();

        // Errou ao criar aqui o vetor dos estudando
        // aqui fez o certo
        // -> Parte de ler os dados
        for (int i = 0; i < n; i++) {
            System.out.println("Quarto#" + (i + 1) + ":");
            System.out.print("Nome: ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Quarto:");
            //quartos[i] = scan.nextInt(); -> Errou aqui
            int numerosDeQuartos = scan.nextInt();
            estudantes[numerosDeQuartos] = new Estudante(nome, email);

        }

        // -> Parte para pecorrer o vetor preenchidos e mostrando os quartos desocupados( null)
        System.out.println();
        System.out.println("Quartos acupados: ");
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                System.out.println(i+ " # " + estudantes[i].toString());

            }
        }

    }
}
