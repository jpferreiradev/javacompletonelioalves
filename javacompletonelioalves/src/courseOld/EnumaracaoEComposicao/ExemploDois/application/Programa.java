package courseOld.EnumaracaoEComposicao.ExemploDois.application;

import courseOld.EnumaracaoEComposicao.ExemploDois.entitites.Comentario;
import courseOld.EnumaracaoEComposicao.ExemploDois.entitites.Post;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Have a nice trip");
        Comentario c2 = new Comentario("Wow that's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        p1.adicionarComentario(c1);
        p1.adicionarComentario(c2);


        System.out.println();

        Comentario c3 = new Comentario("Good night");
        Comentario c4 = new Comentario("May the Force be with you");
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
        p2.adicionarComentario(c3);
        p2.adicionarComentario(c4);

        System.out.println(p1);
        System.out.println(p2);
    }

}



/*
 Feito na mão a classe Program

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
 */