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
    
    public Prefab() {
        this.ingrediente = ingrediente;
    }

    public Topping getIngrediente() {
        return ingrediente;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setIngrediente(Topping ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
  
    public void pedidoPrefab(){
        Scanner teclado=new Scanner (System.in);
        double c=0;
        double d=0; 
        System.out.println("¿Cuál pizza quiere?"+"\n"+"1.hawaiana"+"\n"+"2.Pollo"+"\n"+"3.Colombiana"+"\n"+"4.Tocineta");
        String b=null;        
        b=teclado.next();
        switch(b){
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
        
                    
        Topping pizza=new Topping(b,c);
        

        setPrecio(c);
        System.out.println("Este pedido cuesta "+ getPrecio()+"pesos." );  

        
    }
    
}
