/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class persona {
private String nombre;
private String apellido;
private String direccion;
private int edad;
private int estadoCivil;

/*
soltero
casado
viudo
divorciado*/
public persona()
{
nombre = "XXXXXXXXXXXXXX";
apellido = "YYYYYYYYYYYYYYYY";
edad = 1;
estadoCivil = EstadoCivil.VIUDO;
    direccion = "ZZZZZZZZZZZZZZZZZZZZZZ";
    
    
}
private String direecion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireecion() {
        return direecion;
    }

    public void setDireecion(String direecion) {
        this.direecion = direecion;
    }
}
