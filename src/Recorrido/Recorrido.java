/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recorrido;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JLabel;

/**
 *
 * @author DELL
 */
public class Recorrido extends Thread {
    public static String fechaFinal1;
    public static String fechaFinal2;
    public static String fechaFinal3;
    
    JLabel vehiculo;
    String ve;
    int distancia;
    boolean regreso;
    
    //VerRecorridos vr = new VerRecorridos();
    final int posDestino = VerRecorridos.DestinoLbl.getLocation().x;

    public Recorrido(JLabel vehiculo, int distancia) {
        this.vehiculo = vehiculo;
        ve=vehiculo.getText();
        this.distancia = distancia;
        this.regreso = false;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                // delay
                sleep(10 * distancia);
                
                // obtener la posicion del vehiculo en X
                int vehiculoPosX = vehiculo.getLocation().x;
                
                // si va de ida
                if(!regreso){
                    // si no ha llegado al destino
                    if(vehiculoPosX < posDestino - 100){
                        // avanzar el vehiculo
                        vehiculo.setLocation(vehiculoPosX + 10, vehiculo.getLocation().y);
                    }else{
                        regreso = true;
                    }
                }else{
                    // de regreso
                    // si no ha llegado al inicio
                    if(vehiculoPosX > 100){
                        // retroceder el vehiculo
                        vehiculo.setLocation(vehiculoPosX - 10, vehiculo.getLocation().y);
                        
                    }else{
                        if(ve.equals("1")){
                            fechaFinal1 = LocalDate.now().toString()+" - "+LocalTime.now().toString();
                        }else if(ve.equals("2")){
                            fechaFinal2 = LocalDate.now().toString()+" - "+LocalTime.now().toString();
                        }else if(ve.equals("3")){
                            fechaFinal3 = LocalDate.now().toString()+" - "+LocalTime.now().toString();
                        }
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    
    
}
