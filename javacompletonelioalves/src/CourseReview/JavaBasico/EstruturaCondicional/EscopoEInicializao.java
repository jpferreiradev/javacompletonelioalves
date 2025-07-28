package CourseReview.JavaBasico.EstruturaCondicional;

public class EscopoEInicializao {
    public static void main(String[] args) {

        double x; // Se a variavel não for iniciada, ela não pode ser usada
        double price = 400.00;

        double discount = 0; // Você precisa iniciar essa variavel
        if (price < 200.00) {
            discount = price * 0.1;
        }

        // Está dando esse erro porque está fora do ESCOPO aqui do método
        System.out.println(discount);
    }
}
