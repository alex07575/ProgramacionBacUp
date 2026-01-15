/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciostema3;
import java.util.Scanner;

/**
 *
 * @author alililie659
 */
public class media10num {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        int suma = 0;
        double media;
        for (int i = 1; i <= 10;i++) {
            System.out.println("Escribe un numero: ");
            n = sc.nextInt ();
            suma += n;
        }
        media = suma / 10.0;
        System.out.println("La media es: " +media);
    }
}
