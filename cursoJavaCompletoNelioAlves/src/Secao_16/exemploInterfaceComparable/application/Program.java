package Secao_16.exemploInterfaceComparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {

    static void main() {
        List<String> list = new ArrayList<>();
        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String nome = br.readLine(); // Ler a linha do arquivo
            while (nome != null) { // Enquanto for diferente de nulo, você vai adicionar a lista
                list.add(nome);
                nome = br.readLine(); // Ler a proxima linha, aqui vai ler o arquivo inteiro e guardando cada um dos nomes em um elemento da linha da lista
            }
            Collections.sort(list); // Uma forma de você ordenazar um coleção
            for (String s : list) { // Pecorrer a lista usando forEach
                System.out.println(s); // Imprimir a lista
            }

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
