package JavaBasico.EstruturasCondicionais;

public class EscopoEinicializacao {
    static void main() {

        double preco = 400.00;
        double desconto;
        if( preco < 200.00){
           desconto = preco * 0.1;
        } else{
            desconto = 0;
        }

        System.out.println(desconto);
    }
}
