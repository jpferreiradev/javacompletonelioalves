package EnumaracaoEComposicao.Atividade.entities;

import EnumaracaoEComposicao.Atividade.entitites.enums.OrdemEStatus;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private OrdemEStatus status;


    private Cliente cliente;
    private List<OrdemPedido> pedidos = new ArrayList<>(); // Assosiação de Ordem com OrdemPedido ( Composição)

    public Ordem() {

    }

    public Ordem(Date momento, OrdemEStatus status) {
        this.momento = momento;
        this.status = status;
        // Faltou a classe Cliente
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrdemEStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemEStatus status) {
        this.status = status;
    }

    public List<OrdemPedido> getPedidos() {
        return pedidos;
    }

    public void adicionarPedido(OrdemPedido ordemPedido) {
        pedidos.add(ordemPedido);
    }

    public void removerPedido(OrdemPedido ordemPedido) {
        pedidos.remove(ordemPedido);

    }

    public double total(OrdemPedido ordemPedido) { // Deveria ter utilizado um for para interar todos os pedidos
        double valorTotal;
        return ordemPedido.subTotal();
    }

    @Override
    public String toString() { // Deveria ter utilizado a classe StringBuilder
       //StringBuilder sb = new StringBuilder();
       //sb.append(");
        return "s";
    }
}

