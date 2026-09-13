package Secao_16.exemploSemInterface.model.entities;

import java.time.LocalDateTime;

public class AluguelCarro {

    private LocalDateTime horaInicio;
    private LocalDateTime horaFim;
    // Composição, assosiação das outras classes
    private Veiculo veiculo;
    private Fatura fatura;



    public AluguelCarro(){

    }

    public AluguelCarro(LocalDateTime horaInicio, LocalDateTime horaFim, Veiculo veiculo) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.veiculo = veiculo;
        //this.fatura = fatura;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalDateTime horaFim) {
        this.horaFim = horaFim;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
}
