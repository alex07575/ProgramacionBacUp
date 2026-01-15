package ejerciciostema4;
import java.util.Arrays;
public class rellenaparesarrays {
    public static void main(String[] arg){
        System.out.println();
        rellenaPares(5,11); 
    }
    static int [] rellenaPares(int longitud, int fin){
        int pares[] = new int[longitud];
        int i = 0;
        
        while (i < pares.length){
            int num = (int)(Math.random()*fin + 1);
            System.out.println("Generado: " +num);
            if (num % 2 == 0){
                System.out.println("Generado par: " +num);
                pares[i] = num;
                i++;
            }
        }
         System.out.println("Array antes de ordenar: " +Arrays.toString(pares));
         Arrays.sort(pares);
         System.out.println("Array ordenado: " +Arrays.toString(pares));
         return (pares);
    }
}
