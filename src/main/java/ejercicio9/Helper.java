/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;


public class Helper {
    public Helper() {}
    public void ValidarNegativo (Integer a) throws ExcepcionDiamante{
        if(a<0){
                throw new ExcepcionDiamante("El numero es invalido");
        }
    }
}
