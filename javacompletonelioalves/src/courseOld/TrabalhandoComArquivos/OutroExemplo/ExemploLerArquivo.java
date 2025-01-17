package courseOld.TrabalhandoComArquivos.OutroExemplo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ExemploLerArquivo {
    public static void main(String[] args) {

        Path arquivo = Paths.get("C:\\temp\\in.txt");

        try{
            List<String> linhas = Files.readAllLines(arquivo);

            for(String linha : linhas){
                System.out.println(linha);
            }

            //linhas.forEach(linha ->System.out.println(linha)); // Utilizando forEach, com ele não precisa usar
        }
        catch (IOException e){
            //System.out.println(e.getMessage());
            System.out.println("Error!");
        }


    }
}
