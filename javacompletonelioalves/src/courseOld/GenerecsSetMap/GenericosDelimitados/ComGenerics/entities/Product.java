package courseOld.GenerecsSetMap.GenericosDelimitados.ComGenerics.entities;

public class Product implements Comparable<Product> {

    // Atributos
    private String nome;
    private Double preco;

    // Construtores
    public Product(){

    }
    public Product(String nome,Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Get e Set
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // Método toString
    @Override
    public String toString() {
        return nome + "," + String.format("%.2f",preco);
        //return nome + "," + String.format("%2.f",preco);  // O erro que você estava tendo UnknownFormatConversionException era por causa do %2.f, que o certo é %.2f
    }

    @Override
    public int compareTo(Product o) {
        return preco.compareTo(o.getPreco());
    }
}
