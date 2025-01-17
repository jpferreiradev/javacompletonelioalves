package CourseReview.OrientacaoObjetos.SemOO.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double xA,xB,xC,yA,yB,yC;
        System.out.println("Entre com os valores de X: ");
        xA = scan.nextDouble();
        xB = scan.nextDouble();
        xC = scan.nextDouble();
        System.out.println("Entre com os valores de Y: ");
        yA = scan.nextDouble();
        yB = scan.nextDouble();
        yC = scan.nextDouble();

        double p = (xA + xB+ xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB+ yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triângulo área X: %.4f%n", areaX);
        System.out.printf("Triângulo área Y: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Area do triângulo X é maior" );
        } else{
            System.out.println("Area do triângulo Y é maior");
        }


    }
}
