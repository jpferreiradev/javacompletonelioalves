package Secao_14.exemploAtividade.exemploAtividadeMuitoRuim.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Colocou como estatico, para que não seja instanciado um novo SDF para cada objeto ( Reserva)  novo instanciado

    public Reserva() {

    }

    public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao() {
        long diff = checkOut.getTime() - checkIn.getTime(); // get.time quantidade de milesegundos daquela data
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // conversão de milisegundos para Dias
        // como calcular a duração em dias de duas datas;
    }

    public void updateDatas(Date checkIn, Date checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto:" +
                numeroQuarto +
                ", Check-in:" +
                sdf.format(checkIn) +
                ", Check-out:" +
                sdf.format(checkOut) +
                "," +
                duracao() +
                " noites";

    }

}
