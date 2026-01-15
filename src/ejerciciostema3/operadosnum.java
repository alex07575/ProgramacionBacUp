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
public class operadosnum {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int operaciones;
        int num1, num2, resta, multi, suma;
        
        System.out.println("Escribe un numero del 1-4: ");
        operaciones = sc.nextInt();
        
        while (operaciones >0 && operaciones <5) {
        System.out.println("Indica primer operando: ");
        num1 = sc.nextInt();
        System.out.println("Indica segundo operando: ");
        num2 = sc.nextInt();
        
            switch (operaciones) {
                case 1 -> {
                    suma = num1 + num2;
                        System.out.println("El resultado es: " +suma);
                }

                case 2 -> {
                    resta = num1 - num2;
                        System.out.println("El resultado es: " + resta);
                }

                case 3 -> {
                    multi = num1 * num2;
                        System.out.println("El resultado es: " +multi);
                }

                case 4 -> {
                    System.out.println("Ha salido del programa. ");
                }

                default -> {
                    System.out.println("No se puede.Int?ntalo de nuevo. ");
            }

                }
        }
        
    }
}
