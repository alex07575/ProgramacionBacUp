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
public class multfor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int n = 0;n <= 10; n++){
                if (n % 2 != 0){
                    continue;
                }
                System.out.println(i+" * "+n+" = "+i*n);
            }
        }
    }
}
