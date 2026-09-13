package Secao_15.exemploClassFile;

import java.io.File;
import java.util.Scanner;

public class exemploInfomacaoArquivos {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o caminho de um arquivo:");
        String caminhoArquivo = scan.nextLine();

        File file = new File(caminhoArquivo);

        System.out.println("GetNome: Nome do arquivo: -> " + file.getName()); // Nome do arquivo
        System.out.println("GetParent: Só o caminho do arquivo sem nome:  -> " + file.getParent());// Só o caminho arquivo sem o nome do arquivo
        System.out.println("GetPath:  Caminho todo do arquivo: -> " + file.getPath()); // O caminho todo do arquivo

    }
}
