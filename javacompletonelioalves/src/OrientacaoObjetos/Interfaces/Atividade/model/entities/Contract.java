package OrientacaoObjetos.Interfaces.Atividade.model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Contract {

    private Integer number;
    private LocalDate date;
    private Double totalValue;

    private Installment installments;

    public Contract(){

    }

    public Contract(Integer number, LocalDate date, Double totalValue, Installment installments) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        this.installments = installments;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Installment getInstallments() {
        return installments;
    }

    public void setInstallments(Installment installments) {
        this.installments = installments;
    }
}
