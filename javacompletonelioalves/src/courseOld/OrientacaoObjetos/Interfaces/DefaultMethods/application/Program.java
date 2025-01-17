package courseOld.OrientacaoObjetos.Interfaces.DefaultMethods.application;

import courseOld.OrientacaoObjetos.Interfaces.DefaultMethods.model.services.InterestService;
import courseOld.OrientacaoObjetos.Interfaces.DefaultMethods.model.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scan.nextDouble();
        System.out.print("Mouths: ");
        int mouths = scan.nextInt();

        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount,mouths);


        System.out.println("Payment after " + mouths + " mounths:");
        System.out.println(String.format("%.2f",payment));


    }
}