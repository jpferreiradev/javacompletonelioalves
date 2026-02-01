package JavaBasico.EstruturaSequencial;

public class ExemploCasting {
    static void main() {


        int a , b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a / b; // Aqui é um exemplo de CASTING
        System.out.println(resultado);

        double c;
        int d;
        c = 5.0;
        d = (int) a; // Nesse exemplo aqui, é preciso colocar o CASTING sabendo da perda de informação
        System.out.println(d);
    }
}
