package CourseReview.JavaBasico.EstruturaCondicional;

public class ExpressaoCondicionalTernaria {
    public static void main(String[] args) {


        double preco = 34.5;
        double desconto;


        if (preco < 20.0) {
            desconto = preco * 0.01;
        } else {
            desconto = preco * 0.05;
        }

        // Usando a expressão Condicional ternaria
        double precoo = 34.5;
        double descontoo = (precoo < 20.0) ? preco * 0.01 : precoo * 0.05;
        System.out.println(descontoo);
    }
}
