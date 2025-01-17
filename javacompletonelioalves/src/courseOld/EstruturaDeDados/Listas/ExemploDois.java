package courseOld.EstruturaDeDados.Listas;


import java.util.ArrayList;
import java.util.List;

public class ExemploDois {
    public static void main(String[] args) {

        // Lista de inteiros

        List<String> list = new ArrayList<>(); // Lista de Strings
        // Outra forma List<Integer> list = new ArrayList<String>();


        // Adicionar alguns elementos nela;
        list.add("JP");
        list.add("Thay");
        list.add("Paulo");
        list.add("Thaynara");
        // Inserir um elemento na posição 2 da list
        list.add(2, "Luke");


        // ver o tamanho da lista
        System.out.println(list.size());


        // Pra saber se a lista está ok, faça um for para pecorre toda a lista
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------------");

        // remover um elemento da lista, a partir da posição
        //list.remove(1);
        // remover um elemento da lista, a partir da comparação do valor dele com outro
        //list.remove("Thaynara");

        // remover aquele elemento que atendam a um predicado
        list.removeIf(x -> x.charAt(0) == 'T'); // Função lambda, chamada de predicado, ela vai ter retornar me verdadeiro ou falso
        for (String x : list) {
            System.out.println(x);
        }
        // Procurar a posição de um elemento
        System.out.println("-------------------");
        System.out.println("Index of Luke: " + list.indexOf("Luke"));

        // Achar um elemento que não existe na lista
        System.out.println("Index of Thay:" + list.indexOf("Thay")); // Quando ele não encontra o elemento, ele returna -1;
    }
}
