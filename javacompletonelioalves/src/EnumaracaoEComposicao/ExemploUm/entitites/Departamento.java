package EnumaracaoEComposicao.ExemploUm.entitites;

public class Departamento {

    private String nome;

    Departamento(){

    }
    Departamento(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

}
