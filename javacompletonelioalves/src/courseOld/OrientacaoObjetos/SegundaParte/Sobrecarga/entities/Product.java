package courseOld.OrientacaoObjetos.SegundaParte.Sobrecarga.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;


    public Product(){ // Declarando um construtor padrão;

    }
    public Product(String name, double price,int quantity){ // Exemplo de construtor com parametros
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name,double price){ // Exemplo de SOBRECARGA DE MÉTODOS
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $"
                + String.format("%.2f",price)
                +", "
                +quantity
                +"units, Total: $"
                +String.format("%.2f", totalValueInStock());
    }
}
