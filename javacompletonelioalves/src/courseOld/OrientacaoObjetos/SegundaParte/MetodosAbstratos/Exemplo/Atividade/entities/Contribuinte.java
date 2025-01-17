package courseOld.OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.Atividade.entities;

public abstract class Contribuinte {

   private String nome;
   private Double rendaAnual;

   Contribuinte(){

   }
   Contribuinte(String nome,double rendaAnual){
       this.nome = nome;
       this.rendaAnual = rendaAnual;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract double taxa();




}


