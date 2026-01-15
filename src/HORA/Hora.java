/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HORA;

/**
 *
 * @author alililie659
 */
public class Hora {
    int hora;
    int minuto;
    int segundo;
    
    Hora(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    int getHora(){
        return hora;
    }
    void setHora(int hora){
        if(hora < 0 || hora > 23){
            this.hora = 0;
        } else {
            this.hora = hora;
        }
    }
    
    int getMinuto(){
        return minuto;
    }
    void setMinuto(int minuto){
        if(minuto < 0 || minuto > 59){
            this.minuto = 0;
        } else {
            this.minuto = minuto;
        }
    }
    
    int getSegundo(){
        return segundo;
    }
    void setSegundo(int segundo){
        if(segundo < 0 || segundo > 59){
            this.segundo = 0;
        } else {
            this.segundo = segundo;
        }
    }
}
