/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recorrido;

import static Recorrido.Pedidos.fecha1;
import static Recorrido.Pedidos.fecha2;
import static Recorrido.Pedidos.fecha3;
import static Recorrido.Pedidos.motocicleta1;
import static Recorrido.Pedidos.motocicleta2;
import static Recorrido.Pedidos.motocicleta3;
import static Recorrido.Pedidos.pR1;
import static Recorrido.Pedidos.pR2;
import static Recorrido.Pedidos.pR3;
import static Recorrido.Pedidos.total1;
import static Recorrido.Pedidos.total2;
import static Recorrido.Pedidos.total3;
import static Recorrido.Pedidos.velocidad1;
import static Recorrido.Pedidos.velocidad2;
import static Recorrido.Pedidos.velocidad3;
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
    
    public static String veiR;
    public static int disR;
    public static double totalR;
    public static String creaR;
    public static String entregaR;
    public static String productosR;
    public static String finalProR;
    
    
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
    Historial isto=new Historial();
    
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
                        // retroceder el vehiculo aqui regresa
                        vehiculo.setLocation(vehiculoPosX - 10, vehiculo.getLocation().y);
                        
                    }else{
                        //valida=false;
                        if(ve.equals("1")){
                            fechaFinal1 = LocalDate.now().toString()+" - "+LocalTime.now().toString();
                            System.out.println("1");
                            
                            veiR=motocicleta1;
                            disR=velocidad1;
                            totalR=total1;
                            creaR=fecha1;
                            entregaR=fechaFinal1;
                            finalProR=pR1;
                            
                            isto.guardarInformacion();
                        }else if(ve.equals("2")){
                            
                            fechaFinal2 = LocalDate.now().toString()+" - "+LocalTime.now().toString();
                            System.out.println("2");
                            
                            veiR=motocicleta2;
                            disR=velocidad2;
                            totalR=total2;
                            creaR=fecha2;
                            entregaR=fechaFinal2;
                            finalProR=pR2;
                          
                            isto.guardarInformacion();
                        }else if(ve.equals("3")){
                            
                            fechaFinal3 = LocalDate.now().toString()+" - "+LocalTime.now().toString();
                            System.out.println("3");
                            
                            veiR=motocicleta3;
                            disR=velocidad3;
                            totalR=total3;
                            creaR=fecha3;
                            entregaR=fechaFinal3;
                            finalProR=pR3;
                            
                            isto.guardarInformacion();
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
