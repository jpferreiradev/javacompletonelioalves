package Secao_16.exemploDefaultMethods.application;

import Secao_16.exemploDefaultMethods.services.BrazilianInterestService;
import Secao_16.exemploDefaultMethods.services.InterestService;
import Secao_16.exemploDefaultMethods.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantia:");
        double quantia = scan.nextDouble();
        System.out.print("Meses: ");
        int mes = scan.nextInt();

        //BrazilianInterestService br = new BrazilianInterestService(2.0);
        InterestService is = new BrazilianInterestService(2.0);
        double pagamento = is.pagamento(quantia, mes);

        System.out.println("Pagamento após " + mes + "meses");
        System.out.println(String.format("%.2f", pagamento));

        scan.close();
    }
}
