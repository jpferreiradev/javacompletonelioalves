package EstruturasBasicasJava.EstruturasRepetitivas.AtividadesFor;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        //Locale.setDefault(Locale.US);


        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }
    }

}

        /*
        double primeiroValor;
        double segundoValor;
        double terceiroValor;
        double mediaPonderada;


        System.out.println("Informe o valor de 3 notas:");
        primeiroValor = scan.nextDouble();
        segundoValor = scan.nextDouble();
        terceiroValor = scan.nextDouble();

        mediaPonderada = ((primeiroValor * 2) + (segundoValor * 3) + (terceiroValor * 5)) / (2 + 3 + 5);

        for(int i =0; i < 3;i++){

        }


        System.out.println(mediaPonderada);



        //System.out.println(primeiroValor);
        //System.out.println(segundoValor);
        //System.out.println(terceiroValor);
        /*

    }
}

/*

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i=0; i<n; i++) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}

		sc.close();
 */