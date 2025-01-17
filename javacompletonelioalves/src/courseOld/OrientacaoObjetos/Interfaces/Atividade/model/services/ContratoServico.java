package courseOld.OrientacaoObjetos.Interfaces.Atividade.model.services;

import courseOld.OrientacaoObjetos.Interfaces.Atividade.model.entities.Contrato;
import courseOld.OrientacaoObjetos.Interfaces.Atividade.model.entities.Prestacao;

import java.time.LocalDate;

public class ContratoServico {


    // Utilizou uma interface
    private ServicoPagamentoOnline servicoPagamentoOnline;

    // Construtor com a interface
    public ContratoServico(ServicoPagamentoOnline servicoPagamentoOnline) {
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }


    public void processoContrato(Contrato contrato, Integer mes) {

        double parcelaBasica = contrato.getValor() / mes; // Valor da parcela

        for (int i = 1; i <= mes; i++) {
            LocalDate vencimentoParcela = contrato.getData().plusMonths(i); // Data

            double juro = servicoPagamentoOnline.juros(parcelaBasica,i);
            double taxa = servicoPagamentoOnline.taxaDePagamento(parcelaBasica + juro);
            double cotaCheia = parcelaBasica + juro + taxa; // Valor de cada cota

            contrato.getPrestacoes().add(new Prestacao(vencimentoParcela,cotaCheia));

        }
    }
}

/*
Exemplo geração dos contratos na mão
 public void processoContrato(Contrato contrato, Integer mes ){
        contrato.getPrestacoes().add(new Prestacao(LocalDate.of(2024,4,29),206.04));
        contrato.getPrestacoes().add(new Prestacao(LocalDate.of(2024,5,29),208.08));
    }

 */