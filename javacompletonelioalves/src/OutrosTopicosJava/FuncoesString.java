package OutrosTopicosJava;

public class FuncoesString {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG";


        String s01 = original.toLowerCase(); // Palavra minuscula
        String s02 = original.toUpperCase(); // Palavra maiuscula
        String s03 = original.trim(); // Ele vai manter a mesma string original, mas vai eliminar os espaços
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");

        int i = original.indexOf("bc"); // Primeira posição
        int j = original.lastIndexOf("bc"); //

        System.out.println("Original - " + original + "-");
        System.out.println("tolowerCasde" + s01);
        System.out.println("toUpperCase" + s02);
        System.out.println("Trim" + s03);
        System.out.println("Substring(2) - " + s04 + "-");
        System.out.println("Substring(2,9) - " + s05 + "-");
        System.out.println("Replace(a,x)- " + s06 + "-");
        System.out.println("Replace(abc,xy)- " + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
    }
}
