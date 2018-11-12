
import MisClases.Clientes;
import MisClases.Empleados;
import MisClases.EstadoCivil;
import MisClases.persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        persona pObj = new persona();
        /*pObj.setNombre("pablo");
        pObj.setApellido("almaraz");
        pObj.setEstadoCivil(EstadoCivil.VIUDO);*/
        
        System.out.println("PERSONA");
        System.out.println(
        pObj.getApellido()+""+
                pObj.getDireecion());
        
   Empleados eEmp = new Empleados();
  /* eEmp.setNombre("pedro");
   eEmp.setApellido("rodriguez");
   eEmp.setEstadoCivil(EstadoCivil.CASADO);
   eEmp.setSalario(1);*/
  
        System.out.println("Empleados");
        System.out.println(
        eEmp.getApellido()+""+
                eEmp.getDireecion());
   
   Clientes cClien = new Clientes();
   /* cClien.setNombre("juan");
   cClien.setApellido("ramirez");
   cClien.setEstadoCivil(EstadoCivil.DIVORCIADO);
   cClien.setRFC("18293BJKADHS819");
   */
   
        System.out.println("Clientes");
        System.out.println(
        cClien.getApellido()+""+
                cClien.getDireecion());
    }
    
}
