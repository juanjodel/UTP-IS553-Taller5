/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import ejercicio1.RegistroLibreta;

public class LibretaDeDirecciones {
    private RegistroLibreta[] libreta;

    public LibretaDeDirecciones() {
        this.libreta =new RegistroLibreta[100];
    } 
    
    public void anadir(RegistroLibreta a) {
       boolean encontrado=false;
       for(int i=0 ;i < libreta.length && !encontrado ;i++){
            if(libreta[i]==null){
                libreta[i]=a;
                encontrado=true;
            }
        }
       if(encontrado){
           System.out.println("Se agrego el dato");
       }else{
           System.out.println("No se agrego el dato");
       }
    }   
    public  void mostrar(){
        for (int i = 0; i < libreta.length; i++) {
            if(libreta[i]!=null){
                System.out.println(libreta[i].getAll());
            }
        }
        
    }
    public void eliminar(RegistroLibreta a){
        boolean encontrado=false;
        for (int i = 0; i < libreta.length; i++) {
           if(libreta[i]!=null && libreta[i].equals(a)){
               libreta[i]=null;
               encontrado=true;
               }
        }
        if(!encontrado){
            System.out.println("No se elimino");
        }
    }

}
