package courseOld.OrientacaoObjetos.Interfaces.InterfaceComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada {
    public static void main(String[] args) {


        // Ver o capitulo de Arquivos

        List<String> list = new ArrayList<String>(); // Instanciando uma lista de Strings
        String path = "C:\\temp\\in.txt"; // Caminho do arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {


            // Vai ler o arquivo inteiro guardando cada um dos nomes na lista
            String name = br.readLine();
            while (name != null) {
                list.add(name);
                name = br.readLine();
            }

            // Aqui é uma forma de você ordenar umaa coleção
            Collections.sort(list);
            for (String s : list) { // Utilizando o forEach para pecorrer
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }


    }
}


