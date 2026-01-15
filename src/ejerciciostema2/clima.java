/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciostema2;
import java.util.Scanner;
/**
 *
 * @author alililie659
 */
public class clima {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int grados;
        System.out.println("Escribe la temperatura actual: ");
        grados = sc.nextInt();
    if (grados < 12){
            System.out.println("Hace mucho frio");
        } else if  (grados >= 12 && grados <22) {
            System.out.println("Hace frio");
        } else if  (grados >= 22 && grados <32) {
            System.out.println("Hace calor");
        } else if  (grados >= 32) {
            System.out.println("Hace mucho calor");
        } 
    }
}
