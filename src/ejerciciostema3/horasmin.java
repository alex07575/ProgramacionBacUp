package ejerciciostema3;
import java.util.Scanner;
public class horasmin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hora1, min1, hora2, min2;
        System.out.println("Escribe un valor para hora1: ");
        hora1 = sc.nextInt();
        System.out.println("Escribe un valor para min1: ");
        min1 = sc.nextInt();
        System.out.println("Escribe un valor para hora2: ");
        hora2 = sc.nextInt();
        System.out.println("Escribe un valor para min2: ");
        min2 = sc.nextInt();
        System.out.println("Los minutos que hay de diferencia son: " +diferenciaMin(hora1, min1, hora2, min2));
    }
   static int diferenciaMin(int hora1, int min1, int hora2, int min2) {
       int diferenciaMin = Math.abs((hora2 * 60 + min2) - (hora1 * 60 + min1));
       System.out.println(diferenciaMin);
       return diferenciaMin;
   }
    
}
