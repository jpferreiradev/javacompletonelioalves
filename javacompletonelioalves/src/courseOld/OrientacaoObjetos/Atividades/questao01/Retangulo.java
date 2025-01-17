package courseOld.OrientacaoObjetos.Atividades.questao01;

public class Retangulo {


    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        double raiz = Math.pow(width, 2) + Math.pow(height, 2);

        return Math.sqrt(raiz);
    }

    @Override
    public String toString() {
        return "AREA = " + area() +
                "PERIMETER = " + perimeter() +
                "DIAGONAL = " + diagonal();

    }
}


/*
 public String toString() {
        return "AREA = \n"
                +area()
                +"PERIMETER = "
                +perimeter()
                +"DIAGONAL = \n"
                + diagonal();

    }
 */