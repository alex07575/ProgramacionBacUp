/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HORA;

/**
 *
 * @author alililie659
 */
public class Main {

    public static void main(String[] args) {
        Hora hora1 = new Hora(2, 3, 4);
        mostrarHora(hora1);
        hora1.setHora(4);
        hora1.setMinuto(58);
        hora1.setSegundo(46);
        mostrarHora(hora1);
    }

    static void mostrarHora(Hora h) {
        System.out.println("Hora: "+h.getHora());
        System.out.println("Minuto: "+h.getMinuto());
        System.out.println("Segundo: "+h.getSegundo());
    }
}
