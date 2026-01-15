package ejerciciostema3;
import java.util.Scanner;
public class muestrapares {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Escribe un numero: ");
        n = sc.nextInt();
        muestraPares(n);
    }
    static void muestraPares(int n){
        int i = 0;
        System.out.println("Los primeros numeros pares son: ");
        while (i<=n){
            if (i%2==0) System.out.println(i);
            i++;
        }
    }
}
