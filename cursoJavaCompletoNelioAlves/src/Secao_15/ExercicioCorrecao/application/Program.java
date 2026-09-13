package Secao_15.ExercicioCorrecao.application;

import Secao_15.ExercicioCorrecao.entities.Produto;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.println("Informe o caminho do arquivo: ");
        String caminho = scan.nextLine();

        File file = new File(caminho); // Todo processo para trabalhar com os arquivos

        // Caminho do arquivo
        String fileOrigim = file.getParent();
        System.out.println(fileOrigim); // Tira o nome do arquivo, só mostra o caminho
        // Criar uma pasta, retonra um boolean
        boolean sucesso = new File(fileOrigim + "\\out").mkdir(); // Criar um diretoria/ pasta, precisa passar também o nome do arquivo;

        System.out.println("Pasta criada com sucesso: " + sucesso);

        String arquivoNovo = fileOrigim + "\\out\\summaryu.csv"; // Criar o arquivo de saida, o Summry, caminho origem + nomeArquivoNovo;

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) { // Ler o arquivo, leitura do arquivo

            String itemCSV = br.readLine();
            while (itemCSV != null) {
                //System.out.println(itemCSV);

                String[] campos = itemCSV.split(","); // Quebrando a linha por 3 valores
                // Obter o dados da linha,
                String nome = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                list.add(new Produto(nome, preco, quantidade)); // Adicionar os produtos da lista;

                itemCSV = br.readLine();
            }

            // Criar um novo arquivo csv, passando o objeto do tipo Produto, fazer a gravação dos arquivos
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoNovo))) { // Caminho de saida do arquivo

                for (Produto item : list) {
                    bw.write(item.getNome() + " , " + String.format("%.2f", item.total()));
                    bw.newLine(); // quebra de linha
                }
                System.out.println(arquivoNovo + " Criado com sucesso! ");
            } catch (IOException e) {
                System.out.println("Error de gravação do arquivo:" + e.getMessage());
            }


        } catch (IOException e) {
            System.out.println("Erro de leitura de arquivo: " + e.getMessage());
        }


        scan.close();
    }
}
