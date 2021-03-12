/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

public class Excepciones { 
    public Excepciones() {} 
    public void ValidarHexadecimal (String hexadecimal) throws HexadecimalDecimal{
        String c=hexadecimal.toUpperCase();
        int z=0;
        for (int i = 0; hexadecimal.length()==1; i++) {
            char var=c.charAt(i);
            switch (var) {
                case 'A':
                    z++;
                case 'B':
                    z++;
                case 'C':
                    z++;
                case 'D':
                    z++;
                case 'E':
                    z++;
                case 'F':
                    z++;
                case '1':
                    z++;
                case '2':
                    z++;
                case '3':
                    z++;
                case '4':
                    z++;
                case '5':
                    z++;
                case '6':
                    z++;
                case '7':
                    z++;
                case '8':
                    z++;
                case '9':
                    z++;     
            }
        }
        if(hexadecimal.length()==z){
                throw new HexadecimalDecimal("El hexadecimal no es valido");
        }
    }
}
