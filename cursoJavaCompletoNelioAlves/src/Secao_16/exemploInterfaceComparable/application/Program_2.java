package Secao_16.exemploInterfaceComparable.application;

import Secao_16.exemploInterfaceComparable.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program_2 {
    static void main() {

        List<Funcionario> list = new ArrayList<>();
        String path = "C:\\temp\\on.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String salarioCSV = br.readLine();
            while (salarioCSV != null) {
                String[] fields= salarioCSV.split(","); // Cria um vetor que a posicao [0] é nome e a posicao [1] é o salario
                list.add(new Funcionario(fields[0],Double.parseDouble(fields[1]))); // Instanciando o funcionario
                salarioCSV = br.readLine(); // Ler a proxima linha, aqui vai ler o arquivo inteiro e guardando cada um dos nomes em um elemento da linha da lista
            }
            Collections.sort(list); // Uma forma de você ordenazar um coleção
            for (Funcionario s : list) { // Pecorrer a lista usando forEach
                System.out.println(s.getNome() + "," + s.getSalario()); // Imprimir a lista funcionario com nome e salario
            }

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
