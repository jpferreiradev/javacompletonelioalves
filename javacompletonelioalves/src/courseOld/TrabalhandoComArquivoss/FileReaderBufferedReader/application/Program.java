package courseOld.TrabalhandoComArquivoss.FileReaderBufferedReader.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        // Forma básica para leitura de um arquivo utilizando FileReader e BufferedReader

        String path = "d:\\in.txt"; // Caminho do arquivo

        // Novas classes
        FileReader fr = null; // O valor null é só para ter um valor atribuido a ela;
        BufferedReader br = null; // Esse aqui é instanciado a partir do FileReader, ele é mais rapido mais saiba porque!

        try {
            fr = new FileReader(path); // Estabelendo uma stream, uma sequencia de leitura a partir do arquivo
            br = new BufferedReader(fr); // Ele é instanciado a partir de um FileReader

            String line = br.readLine(); // Ler uma linha do meu arquivo

            while (line != null) { // Enquanto esse line for null, significa que ele leu com sucesso
                System.out.println(line); // Imprimir na tela
                line = br.readLine(); // Mandar ler novamente a linha
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage()); // Tratadando a exceção
        } finally {
            try {
                if (br != null) {
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

//br = new BufferedReader(new FileReader(path)); Poderia ser feito assim
