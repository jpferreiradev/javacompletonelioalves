package JavaBasico.EstruturaSequencial;

public class FuncoesMatematicas {
    static void main() {

       double x,y,z,A,B,C;

       x = 3.0;
       y = 4.0;
       z = -5.0;
       A = Math.sqrt(x);
       B = Math.sqrt(y);
       C = Math.sqrt(25.0);

        System.out.println( "RAIZ QUADRADA");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        System.out.println();
        System.out.println("POTENCIAÇÃO - ELEVADO");

        A = Math.pow(x,y);
        B = Math.pow(x,2.0);
        C = Math.pow(5.0,2.0);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        System.out.println();
        System.out.println("VALOR ABSOLUTO");
        A = Math.abs(y);
        B = Math.abs(x);
        System.out.println(A);
        System.out.println(B);

        //double raizDeDelta = Math.pow(b,2.0) - 4 * a * C;
    }
}
