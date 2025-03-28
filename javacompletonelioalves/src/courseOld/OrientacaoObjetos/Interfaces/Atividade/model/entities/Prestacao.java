package courseOld.OrientacaoObjetos.Interfaces.Atividade.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prestacao {


    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dataVencimento;
    private Double quantia;

    public Prestacao(){}
    public Prestacao(LocalDate dataVencimento, Double quantia) {
        this.dataVencimento = dataVencimento;
        this.quantia = quantia;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }

    @Override
    public String toString() {
        return dataVencimento.format(fmt) + " - " + String.format("%.2f", quantia);
    }
}

