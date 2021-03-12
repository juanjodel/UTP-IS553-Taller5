/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
import java.util.List;


public final class MyMath implements Extremos<Double> {

    public MyMath() {}
    
    public Double max(List<Double> a) {
        double mayor = a.get(0);
        for(int i = 1; i<a.size(); i++){
            if(mayor<a.get(i)){
                mayor=a.get(i);
            }
        }
        return mayor;
    }

    @Override
    public Double mini(List<Double> a) {
        double menor = a.get(0);
        for(int i = 1; i<a.size(); i++){
            if(menor>a.get(i)){
                menor=a.get(i);
            }
        }
        return menor;
    }


    
}
