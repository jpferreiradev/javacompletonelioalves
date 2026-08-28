package Secao_12.exemploStringBuilder.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Constante

    private Date data;
    private String titulo;
    private String conteudo;
    private Integer likes;

    // Composição de objetos
    //private Comment comentarios; // Aqui vai ser um tipo List]
    private ArrayList<Comment> comentarios = new ArrayList<>();

    public Post() {

    }

    public Post(Date data, String titulo, String conteudo, Integer likes) {
        this.data = data;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    public ArrayList<Comment> getComentarios() {
        return comentarios;
    }

    public void adicionarComentario(Comment comentario) {
        comentarios.add(comentario);

    }

    public void removerComentario(Comment comentario) {
        comentarios.remove(comentario);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(titulo + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(data) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentários: \n");
        for (Comment s : comentarios) {
            sb.append(s.getTexto() + "\n");
        }
        return sb.toString(); // Convert o StringBuilder para String;
    }

}
