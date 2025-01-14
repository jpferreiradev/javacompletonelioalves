package CourseReview.JavaBasico.OperadoresBitwise;

public class OperadorSplit {
    public static void main(String[] args) {

        String s = "potato apple lemon ";
        String[] vect = s.split(" ");

        String world01 =  vect[0];
        String world02 =  vect[1];
        String world03 =  vect[2];
        System.out.println();
        // Imprimindo normalmente
        System.out.println(world01);
        System.out.println(world02);
        System.out.println(world03);
        System.out.println();
        // Usando forEach
        for(String e : vect){
            System.out.println(e);
        }
        System.out.println();
        // Usando for
        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

    }
}
