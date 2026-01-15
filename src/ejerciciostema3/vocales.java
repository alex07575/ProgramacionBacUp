package ejerciciostema3;

public class vocales {

    public static void main(String[] args) {
        System.out.println("La i es una vocal: " + esVocal('i'));
        System.out.println("La j es una vocal: " + esVocal('j'));
        System.out.println("La F es una vocal: " + esVocal('F'));
    }

    public static boolean esVocal(char c) {
        boolean resultado;
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
             resultado = true;
        } else {
             resultado = false;
        }
         return resultado;
    }
}
