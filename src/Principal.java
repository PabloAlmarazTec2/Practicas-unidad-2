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
        Operaciones oObjt = new Operaciones();
        System.out.println("la suma de 5 + 7 = "+oObjt.suma(5, 7));
        System.out.println("la suma de juan y perez es: "+oObjt.suma("Juan ","Perez"));
        System.out.println("true y false es "+oObjt.suma(true, false));
    }
    
}
class Operaciones
{
public int suma(int iVal1, int iVal2)

{
return iVal1 + iVal2;


}
public String suma(String sVal1, String sVal2)
{
return sVal1 + sVal2; //concatenando

}
public boolean suma(boolean bVal1, boolean bVal2)
{
return bVal1 && bVal2;//AND
}        
}
