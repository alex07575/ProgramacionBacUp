package ejerciciostema3;

import java.util.Scanner;

public class sobrecarga {

    static int maximo(int a, int b, int c) {
        int max;
        int aux = maximo(a, b);
        return (maximo(aux, c));
    }

    static int maximo(int a, int b) {
        int maximo;
        if (a > b) {
            maximo = a;
        } else {
            maximo = b;
        }
        return (maximo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = maximo(2, 9, 7);
        System.out.println("Introduce un numero: ");
        int a = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int b = sc.nextInt();
        System.out.println("El mayor numero es: " + max);
    }
}
