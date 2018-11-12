/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veh;

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */

public class vehiculos {
     private int año, velocidad,velIngresada,ac;
    
    private String color,modelo, matricula;
    private boolean estaEncendido;
    //agregar atributos de acceso privado
    //metodos get y set
    //agregar constructor default poner valores a su gusto 
    
private vehiculos(int año, String color, String modelo, String matricula,boolean estaEncendido) {
        this.año = año;
        this.color = color;
        this.modelo = modelo;
        this.matricula = matricula;
        estaEncendido = false;
        velocidad = 0;
        velIngresada=0;
        ac=0;
        
    }
public vehiculos()
{
año=2018;
modelo="march";
matricula="ENC2525";
color="azul";
estaEncendido = false;
        velocidad=0;
        ac=0;
        velIngresada=0;

}
    private int getAño() {
        return año;
    }

    private String getColor() {
        return color;
    }

    private String getModelo() {
        return modelo;
    }

    private String getMatricula() {
        return matricula;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    //imprimir los datos del vehiculo
    public void imprimirMensaje()
    {
        System.out.println("tu vehiculo es"+modelo);
        System.out.println("tu color es"+color);
        System.out.println("tu matricula es"+matricula);
        System.out.println("el año es"+año);
    }
    public void prender()
    {
    estaEncendido = true;
    
    }
    public void apagar()
    {
    estaEncendido = true;
    
    }
    public void acelerar()
    {
  if(estaEncendido)
    velocidad = velocidad+10;
    }
    public void frenar()
    {
    if(velocidad >=10)
        velocidad = velocidad -10;
    }
public void velocidad()
{

}    

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }
    public void velocidadDelUsuario()
    {
    velIngresada= velIngresada+10;
    
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }
    

    public int getVelIngresada() {
        return velIngresada;
    }

    public void setVelIngresada(int velIngresada) {
        this.velIngresada = velIngresada;
    }
    
    }


