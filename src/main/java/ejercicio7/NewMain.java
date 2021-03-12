/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.ArrayList;
import java.util.List;


public class NewMain {

    public static void main(String[] args) {
       List<Double> l= new ArrayList<Double>();
       l.add(3.3);
       l.add(4.5);
       l.add(3.0);
       MyMath a=new MyMath();
       System.out.println(a.max(l));
       System.out.println(a.mini(l));
       
    }
    
}
