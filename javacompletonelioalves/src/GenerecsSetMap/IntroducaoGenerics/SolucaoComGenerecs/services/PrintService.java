package GenerecsSetMap.IntroducaoGenerics.SolucaoComGenerecs.services;

import java.util.ArrayList;
import java.util.List;

// Classe está parametrizada com um certo tipo T
public class PrintService<T>  {

  private List<T> list = new ArrayList<>(); // A lista também precisa ser do tipo T

  public void addValue(T valor){ // Adicionar o valor do tipo T
      list.add(valor);
  }

  public T frist(){ // Retornar o elemento do tipo T
      if(list.isEmpty()){
        throw new IllegalStateException("Lista está vazia");
      }
    return list.get(0);
  }

  public void print(){
      System.out.print("[");
      if(!list.isEmpty()){
          System.out.print(list.get(0));
      }
      for(int i = 1;i < list.size();i++){
          System.out.print("," + list.get(i));
      }
      System.out.println("]");
  }

}