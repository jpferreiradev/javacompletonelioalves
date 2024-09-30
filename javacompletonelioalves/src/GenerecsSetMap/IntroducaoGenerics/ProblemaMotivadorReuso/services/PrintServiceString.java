package GenerecsSetMap.IntroducaoGenerics.ProblemaMotivadorReuso.services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceString {

  private List<String> list = new ArrayList<>(); // Lista de nomes,nesse caso a classe precisou ser criada  - Generics

  public void addValue(String valor){
      list.add(valor);
  }
  public String frist(){
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