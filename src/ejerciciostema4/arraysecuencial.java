package ejerciciostema4;

public class arraysecuencial {

    public static void main(String[] args) {
        //faltan los prints y arrays
        int buscar;
    }

    static int buscar(int t[], int clave) {
        int i = 0;
        int posicion;
        while (i < t.length && t[i] != clave) {
            i++;
        }
        if (i < t.length) {
            posicion = i;
        } else {
            posicion = -1;
        }
        return posicion;
    }
}
