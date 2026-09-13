package Secao_15.exemploLeituraArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exemploTryWithResources {
    static void main() {

        // Forma de ler os arquivos;
        // Mostra o conteudo do t

        //String path = "c:\\temp\\test.csv"; // Caminho do arquivo
        String path2 = "c:\\temp\\in.txt";
        // test.csv -> in.txt

        try (BufferedReader br = new BufferedReader(new FileReader(path2))) {
            String linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();


            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
