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
public class contrasena { 
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int cont = 007;
        int tip;
        
            System.out.println("Introduce la contrasena correcta: ");
            tip = sc.nextInt();
            if (tip != cont){
                System.out.println("No es correcta , prueba otra vez. ");
            } else {
                System.out.println("Has accedido");
            }   
    }
}
