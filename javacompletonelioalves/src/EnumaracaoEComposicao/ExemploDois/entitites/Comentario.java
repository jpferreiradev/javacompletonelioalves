package EnumaracaoEComposicao.ExemploDois.entitites;

public class Comentario {

    private String texto;

    public Comentario(){

    }
    public Comentario(String texto){
        this.texto = texto;
    }

    public String getTexto(){
        return this.texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }


}


/*
 // Feito na mão:
      private String texto;

    public Comentario(){

    }
    public Comentario(String texto){
        this.texto = texto;
    }

    public String getTexto(){
        return this.texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }



 @Override
    public String toString() {
        return "Comentario{" +
                "texto='" + texto + '\'' +
                '}';
    }
 */