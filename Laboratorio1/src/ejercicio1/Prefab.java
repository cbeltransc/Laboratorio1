/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Prefab {
    private Topping ingrediente;
    private double Precio ;
    private int Cantidad;

    public Prefab() {
        this.ingrediente = ingrediente;
    }

    public Topping getIngrediente() {
        return ingrediente;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setIngrediente(Topping ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setCantidad(int Canitdad) {
        this.Cantidad = Canitdad;
    }
    
    
    
    public void pedidoPrefab(){
        Scanner teclado=new Scanner (System.in);
        this.setPrecio(3000);
        int z=0;
        System.out.println("¿Cuántas pizzas quiere?");
        z=teclado.nextInt();
        setCantidad(z);
        double c=0;
        double d=0;
        for (int i = 0; i < z; i++) {    
        System.out.println("¿Cuál pizza quiere?"+"\n"+"1.hawaiana"+"\n"+"2.Pollo"+"\n"+"3.Colombiana"+"\n"+"4.Tocineta");
        String b[]=new String[z];
        Topping ing[]=new Topping[z];
        b[i]=teclado.next();
        switch(b[i]){
                case "Hawaiana":
                    c=8000;
                    break;
                case "Pollo":
                    c=9000;
                    break;
                case "Colombiana":
                    c=9000;
                    break;
                 case "Tocineta":
                     c=8500;
                     break;
                 default:
                 System.out.println("No existe esta opción");
                 break;
                  }
        
                    
        ing[i]=new Topping(b[i],c);
        
        d=d+c;
        
                  
        } 
        setPrecio(d);
        System.out.println("Este pedido cuesta "+ getPrecio()+"pesos." );  

        
    }
    
}
