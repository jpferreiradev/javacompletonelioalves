package Secao_16.ExercicioDeFixacao.model.services;

public class PaypalService implements OnlinePagamentoService {

    @Override
    public double taxaDePagamento(double valor) {
        return valor * 0.2;
    }

    @Override
    public double juros(double valor, int meses) {

        return valor * 0.1 * meses;
    }
}
