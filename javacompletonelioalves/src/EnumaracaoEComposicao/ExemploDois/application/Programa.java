package EnumaracaoEComposicao.ExemploDois.application;

import EnumaracaoEComposicao.ExemploDois.entitites.Comentario;
import EnumaracaoEComposicao.ExemploDois.entitites.Post;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        Post postUM = new Post(new Date(),"Traveling New Zealand","I'm goind to visit this wonderful country",12);
        System.out.println(postUM);
        System.out.println("Comentários:");
        Comentario comentarioUm = new Comentario("Have a nice trip");
        Comentario comentarioDois = new Comentario("How that's awesome!");
        System.out.println(comentarioUm);
        System.out.println(comentarioDois);

        System.out.println();

        Post postDois = new Post(new Date(),"Good night guys","See you tomorrow",5);
        System.out.println(postDois);
        System.out.println("Comentários:");
        Comentario comentarioTres = new Comentario("Good night");
        Comentario comentarioQuatro = new Comentario("May the Force be with you");
        System.out.println(comentarioTres);
        System.out.println(comentarioQuatro);

    }
}