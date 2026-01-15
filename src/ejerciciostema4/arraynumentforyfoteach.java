package ejerciciostema4;
import java.util.Arrays;
import java.util.Scanner;
public class arraynumentforyfoteach {
    public static void main(String[] args) {
        int[] tabla = new int[5];
        tabla = creaArray(5);
        System.out.println(Arrays.toString(tabla));
        //en vez de un for y for each he usado el array de arriba
    }
    static int[] creaArray(int n){
        int[] tabla = new int[n];
        int aux;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < tabla.length; i++){
            System.out.println("Introduce un numero: ");
            aux = sc.nextInt();
            tabla[i] = aux;
        }
        return tabla;
    }
}
