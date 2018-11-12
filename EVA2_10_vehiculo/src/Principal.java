
import veh.vehiculos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and 
/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* vehiculos vCarro = new vehiculos=("FORD ,"" F-150",2017, 8, "cilindros");
        vehiculos op = new vehiculos();*/
      
       vehiculos veh = new vehiculos();
    ac = veh.getVelIngresada();
        veh.imprimirMensaje();
        //verificamos si esta encendido
        if(!veh.isEstaEncendido())
        {
            veh.prender();
            
        }
        veh.acelerar();
        System.out.println("vas a fabulosos" + veh.getVelocidad()+ "km/hr");
                

    }
    
    
           
    
}
//llegar a una velocdiad indicada por el usuario 10 en 10 
// Detener el vehiculo----------> llevarlo a 0 km/hr