package TrabalhandoComArquivos.atividades.application;

import TrabalhandoComArquivos.atividades.entities.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Feita uma lista da classe "Produto"
        List<Produto> list = new ArrayList<>();

        // Usuario informa o caminho do arquivo de entrada
        System.out.println("Entre com o caminho do arquivo de entrada: ");
        String diretorioDoArquivo = scan.nextLine();

        // Cria o arquivo, com a classe File
        File arquivoFonte = new File(diretorioDoArquivo);

        // Imprime o  caminho do arquivo, desprezando o nome do arquivo
        String pastaOrigem = arquivoFonte.getParent();
        System.out.println("Caminho do arquivo: " + pastaOrigem);

        // Criação de uma pasta no Java
        boolean sucesso = new File(pastaOrigem + "\\out").mkdir();

        //System.out.println("Pasta criada com sucesso: " + sucesso);

        // A partir daqui é pra estudar, ainda não consigo entender

        // Criação do arquivo "summry.csv"

        String arquivoDestino = pastaOrigem + "\\out\summary.csv";
        System.out.println();

        try (BufferedReader br = new BufferedReader(new FileReader(diretorioDoArquivo))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] campos = itemCsv.split(",");
                String name = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                list.add(new Produto(name,preco,quantidade));

                itemCsv = br.readLine();
            }
            // Aqui ele faz a gravação dos arquivos
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDestino))){
                for(Produto item: list){
                    bw.write(item.getNome() + "," + String.format("%.2f",item.total()));
                    bw.newLine();
                }
                System.out.println(arquivoDestino + " foi criado" );
            } catch (IOException e){
                System.out.println("Error na leitura do arquivo" + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error na leitura do arquivo: " + e.getMessage());
        }
    }
}



/*
   Scanner scan = new Scanner(System.in);

        // Feita uma lista da classe "Produto"
        List<Produto> list= new ArrayList<>();

        // Usuario informa o caminho do arquivo de entrada
        System.out.println("Entre com o caminho do arquivo de entrada: ");
        String diretorioDoArquivo = scan.nextLine();

        // Cria o arquivo, com a classe File
        File arquivoFonte = new File(diretorioDoArquivo);

        // Imprime o  caminho do arquivo, desprezando o nome do arquivo
        String pastaOrigem = arquivoFonte.getParent();
        System.out.println("Caminho do arquivo: " + pastaOrigem);

        // Criação de uma pasta no Java
        boolean sucesso = new File(pastaOrigem + "\\out").mkdir();

        //System.out.println("Pasta criada com sucesso: " + sucesso);

        // A partir daqui é pra estudar, ainda não consigo entender

        // Criação do arquivo "summry.csv"

        String arquivoDestino = pastaOrigem + "\\out\summary.csv";
        System.out.println();

        try(BufferedReader br = new BufferedReader(new FileReader(diretorioDoArquivo))) {

            String itemCsv = br.readLine();
            while(itemCsv != null){
                System.out.println(itemCsv);
                itemCsv = br.readLine();
            }
        } catch (IOException e){
            System.out.println("Error na leitura do arquivo: " + e.getMessage());
        }
    }

 */