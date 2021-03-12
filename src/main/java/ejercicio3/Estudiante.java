/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;


public class Estudiante {
       public String nombres;
       public String apellidos;
       public String carrera;
       public String direccion;
       public Integer telefono;

    public Estudiante(String nombres, String apellidos, String carrera, String direccion, Integer telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public Estudiante(){
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getDireccion() {
        return direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    
    
}

