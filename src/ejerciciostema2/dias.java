/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciostema2;
import java.util.Scanner;
/**
 *
 * @author alililie659
 */
public class dias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int num;
           System.out.println("Introduce un numero del 1 - 7: ");
           num = sc.nextInt();
                switch (num) {
                    case 1 -> System.out.println("lunes");
                    case 2 -> System.out.println("martes");
                    case 3 -> System.out.println("miercoles");
                    case 4 -> System.out.println("jueves");
                    case 5 -> System.out.println("viernes");
                    case 6 -> System.out.println("sabado");
                    case 7 -> System.out.println("domingo");
                default -> System.out.println("No es valido");
                }     
    }   
}
