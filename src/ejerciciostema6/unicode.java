package ejerciciostema6;

import java.util.Scanner;

public class unicode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String frasearray[];
        System.out.println("Escribe un texto: ");
        frase = sc.nextLine();
        frasearray = frase.split("\\s+");
        System.out.println("Número total de palabras :" + frasearray.length);
        String palabraLarga = frasearray[0];
        String palabraCorta = frasearray[0];
        for (int i = 0; i < frasearray.length; i++) {
            if (frasearray[i].length() > palabraLarga.length()) {
                palabraLarga = frasearray[i];
            }
            if (frasearray[i].length() < palabraCorta.length()) {
                palabraCorta = frasearray[i];
            }
        }
        System.out.println("Palabra más larga: " + palabraLarga);
        System.out.println("Palabra más corta: " + palabraCorta);
    }
}
