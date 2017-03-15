/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

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

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
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
    public void pedidoBebida(){
        Scanner teclado=new Scanner(System.in);
        String a=null;
        String b=null;
        int c=0;
        System.out.println("¿Qué bebida quiere?"+"\n"+"1.Limonada"+"\n"+"2.Cola");
        a=teclado.next(); 
        setTipo(a);
        switch(a){
            case "limonada":
                setPrecio(2000);
                break;
            case "cola":
                setPrecio(1500);
                break;                
            default:
                 System.out.println("No existe esta opción");
                 break;
        }
        System.out.println("¿Qué tamaño?"+"\n"+"1.Grande"+"\n"+"2.Mediana");
        b=teclado.next();
        setTamaño(b);
        
        switch(b){
            case "grande":
                setPrecio(getPrecio()+1500);
                break;
            case "mediana":
                setPrecio (getPrecio());
                break;
            default:
                 System.out.println("No existe esta opción");
                 break;
        }
        
        }    
        
    }



