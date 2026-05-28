package OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor.Atividade10.application;

import OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor.Atividade10.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas?");
        int valor = scan.nextInt();

        Pessoa[] pessoas = new Pessoa[valor];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Altura da " + (i + 1) + " a pessoa:");
            double altura = scan.nextDouble();
            System.out.print("Genero da " + (i + 1) + " a pessoa:");
            char genero = scan.next().charAt(0);

            pessoas[i] = new Pessoa(altura, genero);
        }

        double maiorAltura = 0.0;
        double menorAltura = 0.0;
        double mediaMulhures = 0.0;
        int numeroHomens = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getAltura() > 0){

            }


        }

    }
}
