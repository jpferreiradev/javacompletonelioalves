package EnumaracaoEComposicao.ExemploDois.entitites;

import java.util.Date;

public class Post {

    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer like;

    //Comentario comentario = new Comentario();

    public Post() {

    }

    public Post(Date momento, String titulo, String conteudo, Integer like) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.like = like;

    }

    @Override
    public String toString() {
        return titulo+
                like + "Likes" + momento
                + conteudo;


    }
}
