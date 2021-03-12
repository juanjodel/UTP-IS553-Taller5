/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;


public class NewMain {
    public static void main(String[] args) {
        Scanner escanear=new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        int numero=escanear.nextInt(); 
        boolean validar=true;
        Helper a=new Helper();
        try {
           a.ValidarNegativo(numero);
        } catch (ExcepcionDiamante e) {
            System.out.println(e.getMessage());
            validar=false;
        }
        if(validar)
            System.out.println("   *   \n"
                             + "  ***  \n"
                             + " ***** \n"
                             + "  ***  \n"
                             + "   *   \n");
    }
    
}
