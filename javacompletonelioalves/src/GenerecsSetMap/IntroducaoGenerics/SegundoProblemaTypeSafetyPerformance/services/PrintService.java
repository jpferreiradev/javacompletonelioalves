package GenerecsSetMap.IntroducaoGenerics.SegundoProblemaTypeSafetyPerformance.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

  private List<Object> list = new ArrayList<>();

  public void addValue(Object valor){
      list.add(valor);
  }

  public Object frist(){
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