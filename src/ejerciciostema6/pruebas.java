package ejerciciostema6;

import java.util.Arrays;

public class pruebas {

    public static void main(String[] args) {
        int t[] = {7, 4, 2, 6, 1};
        int a[] = Arrays.copyOf(t, 6);
        for (int i = 0; i < t.length; i++) {
            Arrays.sort(t);
            Arrays.toString(t);
            System.out.println(a[i]);
        }
    }
}
