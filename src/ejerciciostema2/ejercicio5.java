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
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aforo, precioentrada, entradasvendidas;
        System.out.println("Aforo del local: ");
        aforo = sc.nextInt();
        System.out.println("Precio de las entradas: ");
        precioentrada = sc.nextInt();
        System.out.println("Entradas vendidas: ");
        entradasvendidas = sc.nextInt();
        
        if (aforo * 0.2 >= entradasvendidas) {
                System.out.println("Se cancela");
        } else if (aforo * 0.5 >= entradasvendidas){
            precioentrada *= 0.5;
            System.out.println("El precio final es: " + precioentrada);
        }else {
            System.out.println("Se hace");
        }   
    }
}
