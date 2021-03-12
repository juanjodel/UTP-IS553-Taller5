/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;


public class NewMain {
    public static void main(String[] args) {
        Estudiante estudiante1=new Estudiante("Jarol", "Vidal Angulo", "Ing Sistemas","Carrera 13",319254064);
        InfoAdicional est1=new InfoAdicional(estudiante1,6,120,"jarol.vidal", 3);
        est1.mostrar();
    }
    
}
