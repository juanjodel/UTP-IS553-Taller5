 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.Arrays;

public class ListaReales  implements Estadisticas<Double> {
    public Double lista[];

    public ListaReales(Double[] lista) {
        this.lista = lista;
    }
    public void insertar(Double a){
       boolean encontrado=false;
       for(int i=0 ;i < lista.length && !encontrado ;i++){
            if(lista[i]==null){
                lista[i]=a;
                encontrado=true;
            }
        }
       if(encontrado){
           System.out.println("Se agrego el dato");
       }else{
           System.out.println("No se agrego el dato");
       }
    }

    public Double obtenerMinimo() {
        Double min=10000000.00;
        boolean encontrado=false;
        for (int i = 0; i < lista.length && !encontrado ; i++) {
           if(lista[i]==null){
                encontrado=true;
           }else{
                if(lista[i]<min){
                    min=lista[i];
                }
           }
        }
   
        return min;
    }

    @Override
    public Double obtenerMaximo() {
        Double max=0.00;
        boolean encontrado=false;
        for (int i = 0; i < lista.length && !encontrado ; i++) {
           if(lista[i]==null){
                encontrado=true;
           }else{
                if(lista[i]>max){
                    max=lista[i];
                }
           }
        }
   
        return max;
    }

    public Double calcularMedia() {
        Double suma =0.00;
        double a=0;
        boolean encontrado=false;
        for (int i = 0; i < lista.length && !encontrado ; i++) {
           if(lista[i]==null){
                encontrado=true;
           }else{
                suma=lista[i]+suma;
                a++;
            }
        }
   
        return suma/a;
    }

    public Double calcularPromedio() {
        Double suma =0.00;
        double a=0;
        boolean encontrado=false;
        for (int i = 0; i < lista.length && !encontrado ; i++) {
           if(lista[i]==null){
                encontrado=true;
           }else{
                suma=lista[i]+suma;
                a++;
            }
        }
   
        return suma/a;
    }

    public Double calcularSumar() {
        Double suma =0.00;
        boolean encontrado=false;
        for (int i = 0; i < lista.length && !encontrado ; i++) {
           if(lista[i]==null){
                encontrado=true;
           }else{
                suma=lista[i]+suma;
            }
        }
   
        return suma;
    }
    
    
}
