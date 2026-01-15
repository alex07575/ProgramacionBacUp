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
public class tiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int anyo;
            System.out.println("Escribe un dia :");
            dia = sc.nextInt();
            System.out.println("Escribe un mes :");
            mes = sc.nextInt();
            System.out.println("Escribe un anyo :");
            anyo = sc.nextInt();
                   
            if (anyo == 0){
                System.out.println("Fecha incorrecta");
            } else {
                switch (mes) {
                    case 2 -> {
                        if ((anyo % 4 == 0) && (anyo %100 != 0)||(anyo % 400 == 0)) { //el año es bisiesto
                            if (dia >=1 && dia <=29)
                            System.out.println("Fecha correcta");
                        } else if (dia >= 1 && dia <= 28) {
                            System.out.println("Fecha correcta");
                        } else {
                            System.out.println("Fecha incorrecta");
                        }
                    }
                    case 1, 3, 5, 7, 8, 10, 12 -> {
                        if (dia >= 1 && dia <= 31)
                            System.out.println("Fecha correcta");
                        else if (dia <1 && dia >31 )
                            System.out.println("Fecha incorrecta");
                    }
                    case 4, 6, 9, 11 -> {
                        if (dia >=1 && dia <=30)
                            System.out.println("Fecha correcta");
                        else if (dia <1 && dia >30 )
                            System.out.println("Fecha incorrecta");
                    }
                }                        
            }
    }
}
