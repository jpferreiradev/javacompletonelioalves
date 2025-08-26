package CourseReview.OrientacaoObjetos.ExemploComOOESemOO.ExemploComOODois.application;

import CourseReview.OrientacaoObjetos.ExemploComOOESemOO.ExemploComOODois.entities.Jogador;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Jogador jogador = new Jogador();
        Jogador jogador2 = new Jogador();
        Jogador jogador3 = new Jogador();

        jogador.setNome("Neymar");
        jogador2.setNome("Ganso");
        jogador3.setNome("Pelé");

        System.out.println(jogador.toString());


    }
}
