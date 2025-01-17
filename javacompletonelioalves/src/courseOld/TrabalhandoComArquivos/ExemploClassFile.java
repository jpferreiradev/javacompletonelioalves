package courseOld.TrabalhandoComArquivos;

import java.io.File;
import java.util.Scanner;

public class ExemploClassFile {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um pasta: ");
        String strPatch = scan.nextLine();

        File path = new File(strPatch);

        // Mostra as pastas desse diretorio
        File[] pastas = path.listFiles(File::isDirectory);
        System.out.println("Pastas:");
        for(File pasta : pastas){
            System.out.println(pasta);
        }

        // Mostra os arquivos desse diretorio
        File[] arquivos = path.listFiles(File::isFile);
        System.out.println("Arquivos:");
        for(File arquivo : arquivos){
            System.out.println(arquivo);
        }

        // Criação de uma subpasta a partir da past temp

        boolean sucesso = new File(path + "\\subdir").mkdir(); // A partir daqui, vai criar uma subpasta chamada subdir, a partir da pasta "path";
        System.out.println("Diretorio criado com sucesso: " + sucesso);
    }
}
