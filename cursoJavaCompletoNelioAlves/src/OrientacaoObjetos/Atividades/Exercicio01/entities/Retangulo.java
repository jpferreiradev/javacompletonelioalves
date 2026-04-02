package OrientacaoObjetos.Atividades.Exercicio01.entities;

public class Retangulo {

    public Double altura;
    public Double largura;

    public Retangulo() {

    }

    public Retangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double area() {
        return altura * largura;
    }

    public double perimetro() {
        return (altura * 2) + (largura * 2);
    }

    public double diagonal() {
        return (altura * altura + largura * largura) / 5;
    }

    @Override
    public String toString() {
        return  String.format("\nAREA = %.2f", area()) +
                String.format("\nPERIMETRO = %.2f", perimetro()) +
                String.format("\nDIAGONAL = %.2f", diagonal());
    }
}

/*

 */