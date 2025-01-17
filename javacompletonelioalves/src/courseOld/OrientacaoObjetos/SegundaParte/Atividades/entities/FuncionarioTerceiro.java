package courseOld.OrientacaoObjetos.SegundaParte.Atividades.entities;

public class FuncionarioTerceiro extends Funcionario {

    private Double valorAdicional;
    public FuncionarioTerceiro(){
        super();
    }

    public FuncionarioTerceiro(String nome, Integer hora, Double valorPorHora,Double valorAdicional) {
        super(nome, hora, valorPorHora);
        this.valorAdicional = valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public Double pagamento() {
        return super.pagamento() + valorAdicional * 110/100;
    }


}
