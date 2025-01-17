package courseOld.OrientacaoObjetos.Interfaces.Atividade.model.services;

public class ServicoPaypal implements ServicoPagamentoOnline {

    @Override
    public double juros(double quantia, int quantidadeMes) {
        return  quantia * 0.01 * quantidadeMes;
    }

    @Override
    public double taxaDePagamento(double quantia) {
        return quantia * 0.02;
    }
}
