package JavaBasico.EstruturasCondicionais;

public class ExemploCondicionalTernaria {
    static void main() {

        // Exemplo do curso

        double preco = 34.5;
        double desconto;
        /*
        if(preco < 20.0){
            desconto = preco * 0.1;
            System.out.println(desconto);
        } else {
            desconto = preco * 0.5;
            System.out.println(desconto);
        }
        */
        // Condicional ternaria
        desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
        System.out.println(desconto);

    }
}
