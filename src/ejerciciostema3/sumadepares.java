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
public class sumadepares {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Escribe un numero: ");
        num = sc.nextInt();
        
        while (num >= 0) {
            int cont = 1;
            int suma = 0;
            
            while (num >= cont){
                if (cont % 2 == 0){
                    suma = suma + cont;
                }
                cont = cont + 1;
            }
            System.out.println("La suma de los numeros pares es: " + suma);
            System.out.println("Escribe un numero: ");
            num = sc.nextInt();
        }
        System.out.println("Has terminado");
            
        
    }
}
