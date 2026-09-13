package Secao_15.exemploClassFile;

import java.io.File;
import java.util.Scanner;

public class exemploManipulandoArquivos {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o caminho de uma pasta: ");
        String caminhoPasta = scan.nextLine();

        File path = new File(caminhoPasta); // Pode ser um arquivo ou pasta

        // Pegar todas as pastas a partir do caminho

        // LISTA DE PASTAS DO DIRETORIO
       File[] pastas = path.listFiles(File::isDirectory); //
        System.out.println("PASTAS:");
        for (File pasta : pastas) {
            System.out.println(pasta);
        }
        // AGORA A LISTA DE ARQUIVOS
        File[] arquivos = path.listFiles(File::isFile);
        System.out.println();
        System.out.println("Arquivos");
        for(File arquivo : arquivos){
            System.out.println(arquivo);
        }
        System.out.println();
        // Criar uma subpasta
        boolean sucesso = new File(path + "\\subPasta").mkdir(); // Criação de uma subpasta, a subPasta pode ser qualquer nome
        System.out.println("Diretorio criado com sucesso: " + sucesso);


        scan.close();

    }
}
