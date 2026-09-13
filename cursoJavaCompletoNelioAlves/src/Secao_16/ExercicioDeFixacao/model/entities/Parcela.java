package Secao_16.ExercicioDeFixacao.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {

    private static DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate data;
    private Double parcela;

    public Parcela(){

    }

    public Parcela(LocalDate data, Double parcela) {
        this.data = data;
        this.parcela = parcela;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getParcela() {
        return parcela;
    }

    public void setParcela(Double parcela) {
        this.parcela = parcela;
    }

    @Override
    public String toString() {
        return data.format(dft) + " - " + String.format("%.2f",parcela);
    }
}
