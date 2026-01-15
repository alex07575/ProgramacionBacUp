package poo;
import java.util.Arrays;
public class lista {
    Integer[] tabla;
    
    public lista(){
        tabla = new Integer[0];
    }
    
    void InsertarPrincipio(Integer nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length -1);
        tabla[0] = nuevo;
    }
    
    void InsertarFinal(Integer nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length -1] = nuevo;
    }
}
