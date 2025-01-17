package courseOld.EstruturasBasicasJava.EstruturasRepetitivas;

public class ExemploForEach {
    public static void main(String[] args) {


        String[] vect = new String[] {"Maria" , "Bob","Alex"}; // Exemplo 1
        String[] vectv = new String[] {"JP", "Thay"}; // Exemplo 2
        int[] idades = new int[] {31,32};
        String[] teste = new String[] {"Bora"};



        for(int i = 0; i < vect.length;i++){
            System.out.println(vect[i]);
        }
        // Laço for Each
        System.out.println("-------- Exemplo For Each-------");

        for( String obj : vect){
            System.out.println(obj);
        }
    }
}
