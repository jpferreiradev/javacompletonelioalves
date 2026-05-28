package OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor.Atividade03.application;

import OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor.Atividade03.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class alturas {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.print("Quantas pessoas serão digitadas?");
        int valor = scan.nextInt();

        Pessoa[] pessoas = new Pessoa[valor];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            scan.nextLine();
            System.out.print("Nome:");
            String nome = scan.nextLine();
            System.out.print("Idade:");
            int idade = scan.nextInt();
            System.out.print("Altura:");
            double altura = scan.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);

        }
        /*
        System.out.println("PESSOAS: ");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
        */
        double cont = 0.0;
        double media;
        for (int i = 0; i < pessoas.length; i++) {
            cont = cont + pessoas[i].getAltura(); //Aqui você soma todas as alturas;
        }

        int porcetagem = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (i < 16) {
                porcetagem = porcetagem + 1;


            }
        }

        media = cont / pessoas.length;
        double pocertagem = porcetagem * 100.0 / pessoas.length;
        System.out.println();
        System.out.println();
        System.out.println("Valor " + cont);
        System.out.printf("Altura média: %.2f ", media);
        System.out.println("Pessoas com menos de 16 anos" + porcetagem);


    }
}
