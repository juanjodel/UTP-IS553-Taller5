/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;


public class NewMain {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Ingrese el hexadeximal que desea convertir a decimal las letras en mayuscula:");
        String hex =a.nextLine();
        Excepciones excepcion=new Excepciones();
        try{
            excepcion.ValidarHexadecimal(hex);
        }catch(HexadecimalDecimal e){
            System.out.println(e.getMessage());
        }
        System.out.println("El decimal es:"+hexadecimalADecimal(hex));
        
    }
    public static long hexadecimalADecimal(String hexadecimal){
        long decimal = 0;
        int potencia = 0;
        for (int x = hexadecimal.length() - 1; x >= 0; x--) {
            int valor = caracterHexadecimalADecimal(hexadecimal.charAt(x));
            long elevado = (long) Math.pow(16, potencia) * valor;
            decimal += elevado;
            potencia++;
        }
        return decimal;
    }
    public static int caracterHexadecimalADecimal(char caracter) {
        switch (caracter) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return Integer.parseInt(String.valueOf(caracter));
        }
    }
    
}
