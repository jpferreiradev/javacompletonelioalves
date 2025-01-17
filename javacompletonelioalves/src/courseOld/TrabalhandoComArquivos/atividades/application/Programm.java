package courseOld.TrabalhandoComArquivos.atividades.application;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Programm {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o diretorio do arquivo: ");
        String diretorioArquivo = scan.nextLine();

        File arquivo = new File(diretorioArquivo);
        //Path arquivoo = Paths.get(diretorioArquivo);

        String localArquivo = arquivo.getParent();
        System.out.println("Caminho do arquivo" + localArquivo);

        boolean arquivoCriadoSucesso = new File(localArquivo + "\\pastaCriada").mkdir();
        System.out.println("Pasta criada com sucesso" + arquivoCriadoSucesso);

    }
}
