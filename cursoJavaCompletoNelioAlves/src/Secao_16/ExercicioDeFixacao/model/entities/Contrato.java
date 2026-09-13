package Secao_16.ExercicioDeFixacao.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contrato {



    private Integer numero;
    private LocalDate dataContrato;
    private Double valorTotal;

    //private Parcela parcela;// Errou aqui
    private List<Parcela> parcelas = new ArrayList<>(); // Associação (Composição)

    public Contrato() {

    }

    public Contrato(Integer numero, LocalDate dataContrato, Double valorTotal) {
        this.numero = numero;
        this.dataContrato = dataContrato;
        this.valorTotal = valorTotal;

    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }


}
