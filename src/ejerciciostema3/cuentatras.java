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
public class cuentatras {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        int cont = 0;
        System.out.println("Escribe un numero entero positivo: ");
        num = sc.nextInt();
        while (num >= cont) {
            System.out.println(num);
            num = num - 1;
        }
        if (num < 0) {
            System.out.println("Despegue");
        }
    }
}
