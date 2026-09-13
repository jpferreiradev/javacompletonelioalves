package Secao_16.ExercicioDeFixacao.model.services;

public interface OnlinePagamentoService {

    double taxaDePagamento(double valor);
    double juros(double valor, int meses);
}
