package EstruturasRepetitivas.AtividadesWhile;

import java.util.Scanner;

public class AtividadeTres {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Informe de um 1 a 3 o tipo de combustivel: ");
        int valorInformado = scan.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        while (valorInformado != 4) {

            if (valorInformado == 1) {

                alcool = alcool + 1;

            } else if (valorInformado == 2) {
                gasolina = gasolina + 1;


            } else if (valorInformado == 3) {
                diesel = diesel + 1;

            }


            valorInformado = scan.nextInt();
        }
        System.out.println("Muito obrigado");

        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel:" + diesel);
    }
}


/*
        int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}

			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);



 */