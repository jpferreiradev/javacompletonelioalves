package EnumaracaoEComposicao.entities;

import EnumaracaoEComposicao.etities.enums.OrdemEstatus;

import java.util.Date;

public class Pedido {

    private Integer id;
    private Date moment;
    private OrdemEstatus status; //Um atributo do Tipo OrdemEStatus que é um ENUM;

    public Pedido(){

    }
    public Pedido(Integer id, Date moment, OrdemEstatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public Date getMoment(){
        return this.moment;
    }
    public void setMoment(Date moment){
        this.moment = moment;
    }

    public OrdemEstatus getStatus(){
        return status;
    }
    public void setStatus(OrdemEstatus status){
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
