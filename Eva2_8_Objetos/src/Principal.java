﻿/*
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
        Test tObj = new Test();
        Test tcopia = tObj;
        tObj.iVal= 100;
        System.out.println(tObj.iVal);
        System.out.println(tObj);
        System.out.println(tcopia);
        tObj = new Test();
        System.out.println("señor slim, usted tiene "+ tObj.iVal);
         System.out.println(tObj);
        tObj = null;
        System.out.println(tObj);
        System.out.println("pereme sr slim, tiene "+ tcopia.iVal);
        
    }
    
    
}
class Test
{
int iVal;

}
