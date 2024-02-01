package EnumaracaoEComposicao.Atividade.entities;

import EnumaracaoEComposicao.Atividade.entitites.enums.OrdemEStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {

    private Date momento;
    private List<OrdemPedido> pedidos = new ArrayList<>();

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

    public List<OrdemPedido> getPedidos() {
        return pedidos;
    }

    public void adicionarStatus(OrdemPedido ordemPedido ){
        pedidos.add(ordemPedido);
    }
    public void deletarStatus(OrdemPedido ordemPedido){
        pedidos.remove(ordemPedido);
    }
    public double total(){
        for( OrdemPedido c : pedidos){
            double total;
            total = c.subTotal();

        }
    return total();
    }
}
