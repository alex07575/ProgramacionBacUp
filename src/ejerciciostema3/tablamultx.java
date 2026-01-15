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
public class tablamultx {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        do {
        System.out.println("Escribe un numero de (1 a 10): ");
        num = sc.nextInt();
        } while (!(1 <= num && num <= 10));
        System.out.println("\n\nTabla del " +num);
        for (int i = 1 ; i <= 10; i++ ) {
            System.out.println(num+ " x " + i + " = " + num * i);
        }
    }
}
