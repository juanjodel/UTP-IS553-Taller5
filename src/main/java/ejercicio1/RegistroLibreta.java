/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class RegistroLibreta {
    public String nombre;
    public String direccion;
    public Integer numeroTelefono;
    public String Correo;
    
    
    public RegistroLibreta(){}

    public RegistroLibreta(String nombre, String direccion, Integer numeroTelefono, String Correo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.Correo = Correo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setNumeroTelefono(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public long getNumeroTelefono() {
        return numeroTelefono;
    }
    public String getCorreo() {
        return Correo;
    }
    public String getAll(){
        return nombre+" "+direccion+" "+numeroTelefono+" "+Correo;
    }
    
}
