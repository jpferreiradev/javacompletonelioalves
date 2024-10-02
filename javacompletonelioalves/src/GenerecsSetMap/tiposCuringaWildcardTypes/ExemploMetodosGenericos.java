package GenerecsSetMap.tiposCuringaWildcardTypes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploMetodosGenericos {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5, 2, 10); // Instancia uma lista de inteiros
        printList(myInts); // Chamando o método

        List<String> myStrings = Arrays.asList("JP","Thay","JoãoPaulo"); // Instanciando uma lista de String
        printList(myStrings); // Chamando o método
    }


    public static void printList(List<?> list){
           for(Object object : list){
               System.out.println(object);
           }
        }
    }

