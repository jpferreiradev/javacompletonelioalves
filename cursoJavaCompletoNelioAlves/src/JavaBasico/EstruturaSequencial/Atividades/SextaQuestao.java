package JavaBasico.EstruturaSequencial.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class SextaQuestao {
    static void main() {

        Locale.setDefault(Locale.US);


        Scanner scan = new Scanner(System.in);

        double baseA, baseB, alturaC, triangulo,circulo,trapezio,quadrado,retanculo;

        baseA = scan.nextDouble();
        baseB = scan.nextDouble();
        alturaC = scan.nextDouble();

        triangulo = ( baseA * alturaC) / 2;
        circulo = 3.14159 * (Math.pow(alturaC, 2));
        trapezio = (baseA + baseB) * alturaC / 2;
        quadrado = Math.pow(baseB, 2);
        retanculo = baseA * baseB;

        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(trapezio);
        System.out.println(quadrado);
        System.out.println(retanculo);



    }
}
