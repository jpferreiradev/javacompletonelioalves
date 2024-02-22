package OrientacaoObjetos.SegundaParte.Atividades.entities;

public class FuncionarioTerceiro extends Funcionario {

    public FuncionarioTerceiro(){

    }

    public FuncionarioTerceiro(String nome, Integer hora, Double valorPorHora) {
        super(nome, hora, valorPorHora);
    }

    public Double pagamentoAdicional(){
        return 0.0;
    }
}
