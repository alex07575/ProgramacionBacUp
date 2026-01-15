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
public class salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Escribe tu sueldo: ");
        num = sc.nextInt();
        if (num < 1000){
            System.out.println("Es un salario muy malo");
        } else if  (num >= 1000 && num <1500) {
            System.out.println("Es un salario malo");
        } else if  (num >= 1500 && num <3000) {
            System.out.println("Es un salario bueno");
        } else if  (num >= 3000) {
            System.out.println("Es un salario muy bueno");
        }         
    }
}

   