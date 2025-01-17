package courseOld.OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.Atividade.entities;

public class Juridica extends Contribuinte {

    private Integer numeroFuncionarios;

    public Juridica() {
        super();
    }

    public Juridica(String nome, double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double taxa() {

        if(numeroFuncionarios > 10){
            return getRendaAnual() * 1.4;
        } else{
            return getRendaAnual() * 1.6;
        }
    }
}
