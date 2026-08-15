package Secao_08.exemploMembrosEstaticos.segundaVersao.util;

public  class Calculadora {

    public  final double PI = 3.14159;
    public  double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }
    public  double volume(double radio) {
        return 4.0 * PI * radio * radio * radio / 3.0;
    }
}
