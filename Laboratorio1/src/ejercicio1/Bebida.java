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
public class Bebida {
    
   private String tamaño;
   private String tipo;
   private double precio;
   
   

    public Bebida() {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void pedidobebida(){
        Scanner teclado=new Scanner (System.in);
        String a = null;
        String b=null;
        System.out.println("¿Qué bebida quiere?"+"\n"+"1.Limonada"+"\n"+"2.Cola");
        a=teclado.next(); 
        setTipo(a);
        switch(a){
            case "Limonada":
                setPrecio(2000);
                break;
            case "Cola":
                setPrecio(1500);
                break;                
            default:
                 System.out.println("No existe esta opción");
                 break;
        }
        System.out.println("¿Qué tamaño?"+"\n"+"1.Grande"+"\n"+"2.Peque");
        b=teclado.next();
        setTamaño(b);
        
        switch(b){
            case "Grande":
                setPrecio(getPrecio()+1500);
                break;
            case "Peque":
                setPrecio (getPrecio());
            default:
                 System.out.println("No existe esta opción");
                 break;
        }
            
        
        System.out.println("Escogió la bebida " + getTipo()+" de tamaño "+ getTamaño()+". Esta cuesta "+ getPrecio()+ " pesos.");
        
    }
   
   
   
    
}
