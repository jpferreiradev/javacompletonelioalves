package courseOld.OrientacaoObjetos.SegundaParte.TratamentoExcecoes.AtividadeExemplo.SolucaoBoa.model.entities;

import courseOld.OrientacaoObjetos.SegundaParte.TratamentoExcecoes.AtividadeExemplo.SolucaoBoa.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva() {

    }

    public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Erro na reserva: A data de check-out deve ser posterior à data de check-in");
        }
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
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateData(Date checkIn, Date checkOut) {
        Date hoje = new Date();
        if (checkIn.before(hoje) || checkOut.before(hoje)) {
            throw new DomainException("Erro na reserva: Datas de reserva para a atualização deve ser datas futuras");
        }
        if (!checkOut.after(checkIn)) {
            throw  new DomainException("Erro na reserva: A data de check-out deve ser posterior à data de check-in");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto:" +
                numeroQuarto +
                ", check-in:" +
                sdf.format(checkIn) +
                ", check-out: " +
                sdf.format(checkOut) +
                "," + duracao() +
                " noites";


    }

}


// Minha versão
    /*
  private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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

    public long duracao(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
    }
    public void updateData(Date checkIn,Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Quarto:"+
                numeroQuarto+
                ", check-in:"+
                sdf.format(checkIn)+
                ", check-out: "+
                sdf.format(checkOut)+
                "," + duracao()+
                " noites";



        }
 */