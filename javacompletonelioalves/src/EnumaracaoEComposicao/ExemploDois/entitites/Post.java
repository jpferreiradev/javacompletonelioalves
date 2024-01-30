package EnumaracaoEComposicao.ExemploDois.entitites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comentario> comentarios = new ArrayList<>(); // Assosiação de Post com Comentarios ( Composição)

    public Post() {

    }

    public Post(Date momento, String titulo, String conteudo, Integer like) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = like;

    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void adicionarComentario(Comentario comentario){
        comentarios.add(comentario);
    }
    public void removerComentario(Comentario comentario){
        comentarios.remove(comentario);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes);
        sb.append(" Likes = ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentários: " + "\n");
        for (Comentario c : comentarios) {
            sb.append(c.getTexto() + "\n");
        }
        return sb.toString();

    }


}

/*
   // Feito na mão


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
        return titulo + "\n"+
                like + " Likes -" + momento + "\n"+
                conteudo;


    }



                titulo+ "\n"+
                like + "\n" +  "Likes" + momento + "\n"+
                + conteudo;
 */