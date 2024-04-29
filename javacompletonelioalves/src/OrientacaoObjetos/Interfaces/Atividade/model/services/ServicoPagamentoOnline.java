package OrientacaoObjetos.Interfaces.Atividade.model.services;

public interface ServicoPagamentoOnline {

    double taxaDePagamento(double quantia);
    double juros(double quantia,int quantidadeMes);

}
