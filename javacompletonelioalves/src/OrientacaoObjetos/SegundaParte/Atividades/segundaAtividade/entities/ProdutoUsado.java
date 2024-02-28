package OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ProdutoUsado extends Produto{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private LocalDate dataDeFabricacao;

    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, Double preco, LocalDate dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public LocalDate getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(LocalDate dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String etiquetaDePreco() {
        return super.getNome() + "(Usado) $" + getPreco() +
                "(Dados de fabricação : " + dataDeFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +")";

    }
}
