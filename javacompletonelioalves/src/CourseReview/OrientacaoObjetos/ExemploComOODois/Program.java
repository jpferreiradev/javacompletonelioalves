package CourseReview.OrientacaoObjetos.ExemploComOODois;

import CourseReview.OrientacaoObjetos.ExemploComOODois.application.Jogador;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Jogador jogador = new Jogador();
        Jogador jogador2 = new Jogador();

        jogador.setNome("Neymar");
        jogador2.setNome("Ganso");

        System.out.println(jogador.toString());



    }
}
