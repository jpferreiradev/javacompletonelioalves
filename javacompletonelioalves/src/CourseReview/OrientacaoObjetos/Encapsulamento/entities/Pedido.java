package CourseReview.OrientacaoObjetos.Encapsulamento.entities;

import java.util.Date;

public class Pedido {

    private Date data;
    private Produto produto;

    public Pedido(Date data, Produto produto) {
        this.data = data;
        this.produto = produto;
        //this.produto.nome = "Computador";
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
