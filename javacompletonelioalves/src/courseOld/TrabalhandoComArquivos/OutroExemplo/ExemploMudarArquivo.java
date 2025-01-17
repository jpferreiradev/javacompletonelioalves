package courseOld.TrabalhandoComArquivos.OutroExemplo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploMudarArquivo {
    public static void main(String[] args) {

        Path arquivo = Paths.get("C:\\temp\\in.txt");
        Path arquivoDois = Paths.get("C:\\temp\\out.txt");


        try {
            byte[] bytesLogoNova = Files.readAllBytes(arquivo);
            Files.write(arquivoDois, bytesLogoNova);

        } catch (IOException e) {
            System.out.println("Error....");
        }


    }
}
