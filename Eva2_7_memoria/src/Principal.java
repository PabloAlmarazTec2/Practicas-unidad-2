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
        System.out.println("Inicianco main");
        A();
        System.out.println("terminando main");
    }
    public static void A()
    {
     System.out.println("Inicianco A");
        B();
        System.out.println("terminando A");
    }
    
    
    
    public static void B()
    {
        System.out.println("Inicianco B");
        C();
        System.out.println("terminando B");
    
    }
       public static void C()
    {
      System.out.println("Inicianco C");
     
        System.out.println("terminando C");
    
    
    }
}

