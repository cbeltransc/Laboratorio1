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
public class Doityourself {
        private Topping ingrediente;
        private double precio;

    public Doityourself() {
        this.ingrediente = ingrediente;
        this.precio=precio;
    }
       public Topping getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Topping ingrediente) {
        this.ingrediente = ingrediente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void pedidoDoityourself() {
        Scanner teclado=new Scanner (System.in);
        
        int a=0;
        double c=0;
        double d=0;
        System.out.println("¿Cuántos ingredientes quiere?");
        a=teclado.nextInt();        
        System.out.println("¿Cuáles?"+"\n"+"1.Queso"+"\n"+"2.Jamon"+"\n"+"3.Champinones"+"\n"+"4.Pollo"+"\n"+"5.Carne"+"\n"+"6.Tocineta"+"\n"+"7.Maiz"+"\n"+"8.Pina"+"\n"+"9.Pimenton"+"\n"+"El tomate ya viene incluido en el precio");
        String b[]=new String[a];
        Topping ing[]=new Topping[a];

        for (int i = 0; i < a; i++) {
        b[i]=teclado.next();
        switch(b[i]){
                case "Queso":
                    c=1000;
                    break;
                case "Pollo":
                    c=3000;
                    break;
                case "Maiz":
                    c=600;
                    break;
                 case "Tocineta":
                    c=2500;
                    break;
                case "Carne":
                    c=3000;
                    break;
                case "Pina":
                    c=900;
                    break;
                case "Jamon":
                    c=2000;
                    break;
                case "Champinones":
                    c=2500;
                    break;
                case "Pimenton":
                    c=500;
                    break;
                default:
                 System.out.println("No existe esta opción");
                 break;
        }
                    
        ing[i]=new Topping(b[i],c);
        
        d=d+c;
                  
        } 
        setPrecio(d+2000);
        System.out.println("El precio de esta combinación es:"+getPrecio()+" pesos.");          
    }
    
}

