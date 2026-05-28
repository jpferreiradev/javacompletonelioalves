package OrientacaoObjetos.Sessao_10.Outros;

public class ExemploUnboxing {
    static void main() {

        // Exemplo UNBOXING

        int x = 20;
        //Integer obj = x; // Usando uma Wrapper class
        Object obj = x;

        System.out.println(obj);

        int y = (int) obj; // Foi feito um casting para o compilador não reclamar;


        System.out.println(y);
    }
}
