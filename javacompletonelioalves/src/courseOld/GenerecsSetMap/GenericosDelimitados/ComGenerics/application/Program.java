package courseOld.GenerecsSetMap.GenericosDelimitados.ComGenerics.application;

import courseOld.GenerecsSetMap.GenericosDelimitados.ComGenerics.entities.Product;
import courseOld.GenerecsSetMap.GenericosDelimitados.ComGenerics.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(","); // Exemplo de como separar a virgula
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Máximo:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


}

/*
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                String[] fields = line.split(","); // Recortar cada pedaço e guardar no vetor, separar as palavras
                list.add(new Product(fields[0],Double.parseDouble(fields[1]))); // Add todos os produtos da lista;
                line = br.readLine();


                -----


 */