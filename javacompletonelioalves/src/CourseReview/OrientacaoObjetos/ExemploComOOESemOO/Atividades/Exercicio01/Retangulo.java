package CourseReview.OrientacaoObjetos.ExemploComOOESemOO.Atividades.Exercicio01;

public class Retangulo {

    public double largura;
    public double altura;


    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;

    }

    public double area() {
        return altura * largura;
    }

    public double perimetro() {
        return (altura + largura) * 2;
    }

    public double diagonal() {
        double a = Math.pow(largura, 2) + Math.pow(altura, 2);
        double valorDiagonal = Math.sqrt(a);
        return valorDiagonal;



    }
}
