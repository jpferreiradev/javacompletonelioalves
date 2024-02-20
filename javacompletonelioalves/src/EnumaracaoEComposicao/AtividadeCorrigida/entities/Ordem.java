package EnumaracaoEComposicao.AtividadeCorrigida.entities;

import EnumaracaoEComposicao.Atividade.entities.OrdemPedido;
import EnumaracaoEComposicao.AtividadeCorrigida.entities.entitiesEnum.OrdemStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private OrdemStatus status;

    private Cliente cliente; // Primeira associação tem um com a classe Cliente;
    private List<ItemPedido> itens = new ArrayList<ItemPedido>(); // Segunda assosiação com ItemPedido, foi criado uma lista

    public Ordem() {

    }

    public Ordem(Date momento, OrdemStatus status, Cliente cliente) {
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

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void adicionarItem(ItemPedido itemPedido){
        itens.add(itemPedido);
    }
    public void removerItem(ItemPedido itemPedido){
        itens.remove(itemPedido);
    }
    public double totalValor(){
        double soma = 0.0;
        for( ItemPedido it : itens){
            //soma = soma + it.subTotal();
            soma += it.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Momento da ordem:");
       sb.append(sdf.format(momento) + "\n");
       sb.append("Status do pedido:");
       sb.append(status + "\n");
       sb.append("Cliente: ");
       sb.append(cliente + "\n");
       sb.append("Itens de ordem: ");
       for(ItemPedido item : itens){
           sb.append(item + "\n");
       }
       sb.append("Preço total: $");
       sb.append(String.format("%.2f", totalValor()));
       return sb.toString();
    }
}

/*
 public List<ItemPedido> getItens() {
        return itens;
    }
 */
