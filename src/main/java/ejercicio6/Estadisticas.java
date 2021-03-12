/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

public interface Estadisticas <T>{
    T obtenerMinimo();
    T obtenerMaximo();
    T calcularMedia();
    T calcularPromedio();
    T calcularSumar();
}
