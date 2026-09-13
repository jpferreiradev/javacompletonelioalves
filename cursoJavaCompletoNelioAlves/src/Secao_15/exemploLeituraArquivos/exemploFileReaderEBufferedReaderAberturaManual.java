package Secao_15.exemploLeituraArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exemploFileReaderEBufferedReaderAberturaManual {
    static void main() {

        // Como é o processo para abrir e fechar manualmente as streams
        // Aqui é um exemplo mão

        String path = "c:\\temp\\in.txt"; // Caminho do arquivo
        // Declaração das streams
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); // ele é instanciado a partir do FileReader, ele é uma abstração maior

            String linha = br.readLine(); // Ler uma linha do arquivo, se arquivo estiver no final, o arquivo vai retornar null

            while (linha != null) {
                System.out.println(linha); // imprimir na tela a linha
                linha = br.readLine(); // Leia novamente outra linha

                // exemplo de esquema basico com o BuffredReader
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        } finally {
            try{
                if ( br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
