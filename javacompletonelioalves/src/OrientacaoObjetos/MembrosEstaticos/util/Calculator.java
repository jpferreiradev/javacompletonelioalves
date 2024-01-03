package OrientacaoObjetos.MembrosEstaticos.util;

public class Calculator {

    // Classe com uma CONSTANTE ESTÁTICA E DOIS metodos estaticos
    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}

/*
  // Classe normal, e os metodos não são estáticos
    public  final double PI = 3.14159;

    public  double circumference(double radius){
        return 2.0 * PI * radius;
    }
    public  double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
 */