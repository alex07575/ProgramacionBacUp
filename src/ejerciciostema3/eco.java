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
public class eco {
        public static void main (String[] args) {
            Scanner sc = new Scanner (System.in);
            int veces;
            System.out.println("Escribe un numero: ");
            veces = sc.nextInt();
            for (int i = 1; i <= veces; i++) {
                System.out.println("Eco");
            }
        }
}
