package CourseReview.JavaBasico.FuncoesString;

public class Exemplo {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG";

        // Imprimir para letras minusculas
        String s01 = original.toLowerCase();
        System.out.println("Original: - " + original + "-");
        System.out.println("toLowerCase: - " + s01 + "-");
        System.out.println();
        // Imprimir para letras maisculas
        String s02 = original.toUpperCase();
        System.out.println("Original: - " + original + "-");
        System.out.println("toUpperCase: - " + s02 + "-");
        System.out.println();

        // Mantem a String original, mas elimina os espaços
        String s03 = original.trim();
        System.out.println("Original: - " + original + "-");
        System.out.println("Trim: - " + s03 + "-");

        //  Pegar a posição escolhida em diante e montar uma nova String
        String s04 = original.substring(2);
        System.out.println("Original: - " + original + " - ");
        System.out.println("Substring (2):  - " + s04 + " - ");
        System.out.println();
        // Aqui ele vai recortar a String a partir do 2 e abaixo do caractere 9
        String s05 = original.substring(2, 9);
        System.out.println("Original: - " + original + " - ");
        System.out.println("Substring (2,9):  - " + s05 + " - ");
        System.out.println();
        // Replace, serve para substituir uma String para outra
        String s06 = original.replace('a','x');
        System.out.println("Original: " + original + " - ");
        System.out.println("Replace('a','x'): " + s06 + " - ");
        System.out.println();

        // Usando o Replaece para uma Subtring
        String s07 = original.replace("abc","xy");
        System.out.println("Original: " + original + " - ");
        System.out.println("Replace ('abc','xy'): " + s07 + " -");
        System.out.println();

        // indexOf e lastIndexOf
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);

    }
}
