package ejerciciostema3;
import java.util.Scanner;
public class distancia {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2;
        System.out.println("Escribe un valor para x1: ");
        x1 = sc.nextDouble();
        System.out.println("Escribe un valor para x2: ");
        x2 = sc.nextDouble();
        System.out.println("Escribe un valor para y1: ");
        y1 = sc.nextDouble();
        System.out.println("Escribe un valor para y2: ");
        y2 = sc.nextDouble();
        System.out.println("La distancia euclidea es: " +distancia(x1, x2, y1, y2));
    }
    static double distancia(double x1, double y1, double x2, double y2){
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(distancia);
        return distancia;
    }
    
    
    
}
