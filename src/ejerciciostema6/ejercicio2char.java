package ejerciciostema6;

import java.util.Scanner;

public class ejercicio2char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        int contadorvocal = 0;
        int contadorcons = 0;
        System.out.println("Introduce una palabra :");
        palabra = sc.nextLine();
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra;
            letra = palabra.charAt(i);           
            if (letra == 'a' || letra == 'o' || letra == 'e' || letra == 'i' || letra == 'u') {
                contadorvocal++;
            } else {
                contadorcons++;
                System.out.println("La palabra contiene " +contadorvocal +" vocales y " +contadorcons +" consontantes");
            }
        }

    }
}
