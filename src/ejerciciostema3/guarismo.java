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
public class guarismo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int n = sc.nextInt();
        while (n > 0) {
        System.out.println(n % 10);
        n /= 10;
        }
    }
}
