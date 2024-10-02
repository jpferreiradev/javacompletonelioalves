package GenerecsSetMap.GenericosDelimitados.SemGenerics.services;

import java.util.List;

public class CalculationService {


    // Aqui é uma operação estática
    public static Integer max(List<Integer> list){ // Operação que recebe uma lista de inteiros, você acha o maior em uma lista de inteiros
        if(list.isEmpty()){ // Programação defensiva, utilizando exceções
            throw  new IllegalStateException("A lista não pode está vazia...");
        }

        Integer max = list.get(0); // Encontrar o maior elemento da lista, 0 é o primeiro elemento da lista;

        // Logica simples de achar o maior em uma lista
        for(Integer item : list){
            if(item.compareTo(max) > 0){ // Se cada item dessa lista, é maior do que o max
                max = item;
            }
        }
        return max;
    }
}