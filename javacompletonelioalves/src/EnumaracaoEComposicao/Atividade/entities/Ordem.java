package EnumaracaoEComposicao.Atividade.entities;

import EnumaracaoEComposicao.Atividade.entitites.enums.OrdemEStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {

    private Date momento;
    private List<OrdemEStatus> status = new ArrayList<>();

    public Ordem(){

    }

    public Ordem(Date momento){
        this.momento = momento;

    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public List<OrdemEStatus> getStatus() {
        return status;
    }

    public void adicionarStatus(OrdemEStatus ordemEStatus){
        status.add(ordemEStatus);
    }
    public void deletarStatus(OrdemEStatus ordemEStatus){
        status.remove(ordemEStatus);
    }
    public double total(){

    }
}
