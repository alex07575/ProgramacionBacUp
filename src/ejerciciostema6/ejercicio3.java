package ejerciciostema6;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        char letra2;
        char letra;
        int contador = 0;
        System.out.println("Escribe: ");
        palabra = sc.nextLine();
        letra2 = sc.next().charAt(0);
        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.charAt(i);
            if(letra == letra2){
                contador++;
            }
        }
        System.out.println("Cadena: " + palabra + " / " + " Carácter: " + letra2);
        System.out.println("El carácter " + letra2 + " aparece " + contador + " veces");
    }
}
