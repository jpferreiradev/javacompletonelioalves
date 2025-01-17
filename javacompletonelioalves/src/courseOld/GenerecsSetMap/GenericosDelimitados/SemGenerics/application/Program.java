package courseOld.GenerecsSetMap.GenericosDelimitados.SemGenerics.application;

import courseOld.GenerecsSetMap.GenericosDelimitados.SemGenerics.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        //  Lista de numeros inteiros
        List<Integer> list = new ArrayList<>();

        String path = "C:\\temp\\out.txt"; // Caminho de um arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {// Abrir o arquivo aqui

            String line = br.readLine(); // Ler todas as linhas do arquivo
            while (line != null) {
                list.add(Integer.parseInt(line)); // Inserir na lista os numeros
                line = br.readLine();
            }

            Integer x = CalculationService.max(list); // Variavel x passando a lista como argumento, o max retorna o maior elemento dessa lista
            System.out.println("Maximo:");
            System.out.println(x);

        } catch (IOException e) { // Fazendo a tratação do arquivo do erro;
            System.out.println("Error: " + e.getMessage());
        }
    }
}

