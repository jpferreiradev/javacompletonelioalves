

package courseOld.TrabalhandoComArquivos.OutroExemplo;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DiretorioEArquivo {
    public static void main(String[] args) {


        Path diretorio = Paths.get("C:\\temp"); // Caminho do diretorio
        Path arquivo = Paths.get("C:\\temp\\in.txt"); // Caminho do arquivo



        // Verifica se o diretorio existe
        if(Files.isDirectory(diretorio)){
            System.out.println("Diretorio existe...");
        } else{
            System.out.println("Diretorio não existe...");
        }

        if(Files.exists(arquivo)){
            System.out.println("Arquivo existe...");
        } else{
            System.out.println("Arquivo não existe...");
        }
    }
}
