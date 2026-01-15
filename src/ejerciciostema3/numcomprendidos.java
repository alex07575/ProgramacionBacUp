package ejerciciostema3;
import java.util.Scanner;
public class numcomprendidos {
    public static void muestra(int a, int b) {
        int mayor = a > b ? a : b;
        int menor = a < b ? a : b;
        for (int i = menor; i <= mayor; i++) { 
            System.out.println(i);
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int a = sc.nextInt();
        System.out.println("Escribe un numero: ");
        int b = sc.nextInt();
        muestra (a, b);
    }
    

}