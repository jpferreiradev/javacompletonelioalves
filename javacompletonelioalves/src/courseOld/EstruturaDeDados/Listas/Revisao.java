package courseOld.EstruturaDeDados.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Revisao {
    public static void main(String[] args) {

        // A lista não permite tipos primitivos

        List<String> list = new ArrayList<>();
        //List<String> list = new ArrayList<String>(); -> Essa forma é opcional

        //Adicionando elementos

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); // Inserir um novo elemento


        System.out.println(list.size()); // Tamanho da lista

        //list.remove("Anna"); // Remover um elemento da lista, essa é outra instancia de String//
        //list.remove(1); // Remover um elemento na posição

        for (String x : list) { // Testando para ver se a lista está ok
            System.out.println(x);
        }
        System.out.println("----------------------");
        //list.remove(1);

        // remover a partir de um predicado
        list.removeIf(x -> x.charAt(0) == 'M'); // x -> x.charAt(0) == 'M' --> Aqui é exemplo de um função Lambda chamada Predicado
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-----------------------"); // Encontra a posição de um elemento
        System.out.println("Index of Bob:" + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-----------------------"); // Filtrar a lista de modo que só fique os nomes com M

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // ESTUDAR MAIS
        for(String x : result){
            System.out.println(x);
        }

        System.out.println("-----------------------");  // Encontrar um elemento da lista que atenda um certo predicado

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // ESTUDAR MAIS
        System.out.println(name);
    }
}
