/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;


public class Factura extends Precio{
    public String cliente;
    public String emisor;

    public Factura(String cliente, String emisor,Double precio) {
        this.cliente = cliente;
        this.emisor = emisor;
        setPesos(precio);     
    }
    
    public void ImprimirFactura(){
        System.out.println("Cliente: "+cliente+" Emisor:"+emisor+" Precio:"+getPesos());
    }
    
}
