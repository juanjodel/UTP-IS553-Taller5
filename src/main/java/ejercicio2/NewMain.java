/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import ejercicio1.RegistroLibreta;



public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LibretaDeDirecciones a=new LibretaDeDirecciones();
        RegistroLibreta regis1= new RegistroLibreta("juan","montecarmelo",111111111,"xxxxxxxxxx");
        RegistroLibreta regis2= new RegistroLibreta("andrea","la ospona",2222222,"xxxxxxxx");
        a.anadir(regis2);
        a.anadir(regis1);
        a.mostrar();
    }
    
}
