/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_this;

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class EVA2_10_this {
    int ivalor;
    public EVA2_10_this(){
   ivalor=10; }

    /**
     * @param args the command line arguments
     */
    String sMensaje = " nada de hola";
    public static void main(String[] args) {
        // TODO code application logic here
        EVA2_10_this pObj = new EVA2_10_this();
        pObj.imprimir();
        pObj.imprimir2(10000);
        String sMensaje = "hola";
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            
        }
    }
    public void imprimir()
    {
        System.out.println("valor ="+ivalor);
        System.out.println("valor del atributo "+ this.ivalor);
    
    
    }
     public void imprimir2(int ivalor)
    {
        System.out.println("valor ="+ivalor);
    
    
    }
}
