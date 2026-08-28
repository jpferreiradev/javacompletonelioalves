package Secao_12.exemploAtividade_2.entities;

import Secao_12.exemploAtividade_2.enums.OrdemEStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Ordem {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private OrdemEStatus status;

    private Cliente cliente;//Composição 2
    private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>(); // Composição 1

    public Ordem() {

    }

    public Ordem(Date momento, OrdemEStatus status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;


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

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItens(ItemPedido item) {
        itens.add(item);
    }

    public void removerItens(ItemPedido item) {
        itens.remove(item);
    }

    public double total() {
        double soma = 0.0;
        for (ItemPedido item : itens) {
            soma += item.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordem do momento: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Ordem do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Ordem de itens: \n");
        for (ItemPedido item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Preço total: ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
