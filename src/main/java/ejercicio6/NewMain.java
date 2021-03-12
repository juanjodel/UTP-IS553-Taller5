/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;


public class NewMain {
    public static void main(String[] args) {
        Double array[];
        array = new Double[100];
        ListaReales a=new ListaReales(array);
        a.insertar(23.9);
        a.insertar(32.3);
        a.insertar(324.1);
        a.insertar(4.5);
        a.insertar(9.0);

        System.out.println("Minimo:"+a.obtenerMinimo());
        System.out.println("Maximo:"+a.obtenerMaximo());
        System.out.println("Media:"+a.calcularMedia());
        System.out.println("Promedio:"+a.calcularPromedio());
        System.out.println("Suma:"+a.calcularSumar());
        
    }
    
}
