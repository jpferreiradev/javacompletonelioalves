package GenerecsSetMap.GenericosDelimitados.ComGenerics.services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable <T>> T max(List<T> list){ // Aqui quee vai entrar o generics, esta dando porque só está parametrizando o método e não a classe
        if(list.isEmpty()){ //
            throw  new IllegalStateException("A lista não pode está vazia...");
        }

        T max = list.get(0);
        for(T item : list){
            if(item.compareTo(max) > 0){ // Está dando erro porque o método não está definido do tipo T
                max = item;
            }
        }
        return max;
    }


}

// <T extends  Comparable <T>> <--- Esse meu método

/*
  // Esse método está generico

 */