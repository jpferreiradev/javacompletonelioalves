package courseOld.TrabalhandoComArquivos;

import javax.annotation.processing.FilerException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferReader {
    public static void main(String[] args) {

        // Exemplo de implmentação básica, como você faz tudo manulmente;

        String path = "c:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); // O buffer é instanciado a partir do filereader

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
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
