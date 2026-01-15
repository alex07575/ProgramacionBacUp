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
public class triangulo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe n: ");
        int n = sc.nextInt();
        for (int fila = 1; fila <= n; fila++) {
            for (int col = 1; col <= n - fila; col++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= fila; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
