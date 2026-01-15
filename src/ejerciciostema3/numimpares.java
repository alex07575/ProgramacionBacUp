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
public class numimpares {
    public static void main (String[] args) {
        //Scanner sc = new Scanner (System.in);
             double suma = 0;
             int impar = 0;
             for (int i = 1 ; i <= 10; i = i+1) {
                 impar = 2 * i - 1;
                 suma = suma + impar;
             }
             System.out.println("La suma es:" +suma);
    }
}
