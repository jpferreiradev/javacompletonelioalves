package Secao_16.ExercicioDeFixacao.model.services;

import Secao_16.ExercicioDeFixacao.model.entities.Contrato;
import Secao_16.ExercicioDeFixacao.model.entities.Parcela;

import java.time.LocalDate;

public class ContratoService {

    private OnlinePagamentoService onlinePagamentoService; // Dependencia da interface

    public ContratoService(OnlinePagamentoService onlinePagamentoService) {
        this.onlinePagamentoService = onlinePagamentoService;
    }

    public void processoDeContrato(Contrato contrato, int mes) {

        // gerar as parcelas
        double basicoQUato = contrato.getValorTotal() / mes;

        for (int i = 1; i <= mes; i++) {
            LocalDate vencimentoParecela = contrato.getDataContrato().plusMonths(i); // calculo da data
            double juros = onlinePagamentoService.juros(basicoQUato, i);
            double taxa = onlinePagamentoService.taxaDePagamento(basicoQUato + juros);
            double cotaCheia = basicoQUato + juros + taxa;

            contrato.getParcelas().add(new Parcela(vencimentoParecela, cotaCheia));
        }

    }
}
