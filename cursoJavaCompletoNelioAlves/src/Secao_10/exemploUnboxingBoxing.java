package Secao_10;

public class exemploUnboxingBoxing {
    static void main() {

        int x = 20; // tipo valor ( tipo primitivo)

        Object obj = x; // tipo object

        System.out.println(x); // tipo Boxing

        int y = (int) obj;

        System.out.println(y); // tipo Unboxing
    }
}
