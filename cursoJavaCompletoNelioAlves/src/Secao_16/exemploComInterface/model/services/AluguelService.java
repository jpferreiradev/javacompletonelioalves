package Secao_16.exemploComInterface.model.services;

import Secao_16.exemploComInterface.model.entities.AluguelCarro;
import Secao_16.exemploComInterface.model.entities.Fatura;

import java.time.Duration;

public class AluguelService {

    private Double precoPorHora;
    private Double precoPorDia;

    private TaxService tax; // Composição de objeto

    public AluguelService(Double precoPorHora, Double precoPorDia, TaxService taxServico) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
       this.tax = taxServico;
    }

    // Processar a fatura
    public void processoAluguel(AluguelCarro aluguel){

        double minitos = Duration.between(aluguel.getHoraInicio(), aluguel.getHoraFim()).toMinutes();
        double horas = minitos / 60.0; // Encontrar a duração das horas em fração de horas

        double pagamentobasico;
        if(horas <= 12.0){
            pagamentobasico = precoPorHora * Math.ceil(horas);
        } else{
            pagamentobasico = precoPorDia * Math.ceil(horas / 24.0);
        }


        double taxax = tax.tax(pagamentobasico);

        aluguel.setFatura(new Fatura(pagamentobasico, taxax));
    }

}
