package EnumaracaoEComposicao.Atividade.entitites;

import java.util.Date;

public class HoraContrato {

    private Date data;
    private Double valorPorHora;
    private Integer hora;


    public HoraContrato(){

    }
    public HoraContrato(Date data, Double valorPorHora, int hora){
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.hora = hora;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Double totalHora(){ // Essa operação vai informar o valor de horas do contrato; // Conceito de DELEGAÇÃO
        return  valorPorHora * hora;
    }
}
