/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

public class InfoAdicional {
    public Estudiante estudiante=new Estudiante();
    public Integer semestre;
    public Integer creditosAprobados;
    public String correo;
    public Integer grupo;

    public InfoAdicional(Estudiante estudiante,Integer semestre, Integer creditosAprobados, String correo, Integer grupo) {
        this.estudiante =estudiante;
        this.semestre = semestre;
        this.creditosAprobados = creditosAprobados;
        this.correo = correo;
        this.grupo = grupo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public Integer getCreditosAprobados() {
        return creditosAprobados;
    }

    public String getCorreo() {
        return correo;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public void setCreditosAprobados(Integer creditosAprobados) {
        this.creditosAprobados = creditosAprobados;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }
    public void mostrar(){
        System.out.print(estudiante.getNombres()+" "+estudiante.getApellidos()+" "+estudiante.getCarrera()+" Direccion:"+estudiante.getDireccion()+" Telefono:"+estudiante.getTelefono());
        System.out.println(" Semestre:"+semestre+" Creditos Aprobados:"+creditosAprobados+" Grupo:" );
    }
}

