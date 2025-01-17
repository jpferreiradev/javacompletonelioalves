package courseOld.TrabalhandoComArquivos;

import java.io.File;
import java.util.Scanner;

public class ExemploCaminhoArquivo {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o caminho de um arquivo: ");
        String strPath = scan.nextLine();

        File path = new File(strPath);


        // Acessar somente o nome do arquivo
        System.out.println("getName: " + path.getName() + " --- Somente o nome do arquivo"); // Pega somente o nome do arquivo e despreza o caminho/
        System.out.println("getParent: " + path.getParent() + "--- Só o caminho do arquivo  "); // Pegou somente o caminho que está o arquivo;
        System.out.println("getPath: " + path.getPath() + "--- Com o nome e caminho do arquivo");// O caminho do arquivo

    }
}
