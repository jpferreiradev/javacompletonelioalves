package OrientacaoObjetos.Sessao_10.Outros;

public class ExemploForEach {
    static void main() {

        String[] vect = new String[] {"JP", "Thay","Paulo"};

        System.out.println("EXEMPLO FOR NORMAL");
        for(int i = 0; i < vect.length; i++){
            System.out.printf(" " + vect[i]);
        }
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("EXEMPLO FOR EACH");
        for(String s : vect){
            System.out.printf(" " + s);
        }
    }
}
