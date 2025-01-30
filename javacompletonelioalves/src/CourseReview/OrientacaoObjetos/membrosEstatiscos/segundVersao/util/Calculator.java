package CourseReview.OrientacaoObjetos.membrosEstatiscos.segundVersao.util;

public class Calculator {


    // Os membros dessa classe não estáticos

    public  final double PI = 3.14159;

    public  double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public  double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }

}
