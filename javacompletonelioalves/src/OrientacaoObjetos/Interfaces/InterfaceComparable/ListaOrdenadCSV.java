package OrientacaoObjetos.Interfaces.InterfaceComparable;

import OrientacaoObjetos.Interfaces.InterfaceComparable.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenadCSV {
    public static void main(String[] args) {

        List<Funcionario> list = new ArrayList<>(); // Instanciando uma lista de Strings
        String path = "C:\\temp\\in.txt"; // Caminho do arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {



            String funcionarioCsv = br.readLine();
            while (funcionarioCsv != null) {
                String[] campos = funcionarioCsv.split(",");
                list.add(new Funcionario(campos[0],Double.parseDouble(campos[1])));
                funcionarioCsv = br.readLine();
            }

            // Ordenar os funcionarios por nome
            Collections.sort(list);
            for (Funcionario emp : list) {
                System.out.println(emp.getNome() + "," + emp.getSalario());
            }
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }


    }
}


