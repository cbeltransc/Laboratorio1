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
public class Pizza {
    private int tamaño;
    private String base;
    private int cantidad;
    private Doityourself tipopizza1;
    private Prefab tipopizza2;
    private double preciototal;

    public Pizza() {
        this.tamaño = tamaño;
        this.base = base;
        this.tipopizza1 = tipopizza1;
        this.tipopizza2 = tipopizza2;
        this.cantidad=cantidad;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   

    public int getTamaño() {
        return tamaño;
    }

    public String getBase() {
        return base;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setBase(String base) {
        this.base = base;
    }

  
   
   public void pedidopizza(){
       Scanner teclado=new Scanner (System.in);
        String a = null;
        int b=0;
        String c=null;
        int z=0;
        double d=0;
        double e=0;
        double f=0;
        System.out.println("¿Cuántas pizzas quiere?");
        z=teclado.nextInt();
        setCantidad(z);
        for (int i = 0; i < z; i++) {           
        System.out.println("¿Que tipo de pizza quiere?"+"\n"+"1.Prefabricada"+"\n"+"2.Do it yourself");
        c=teclado.next();
        switch(c){
            case "Prefabricada":
                Prefab pizza1= new Prefab();
                pizza1.pedidoPrefab();
                System.out.println("¿Qué base de pizza quiere para la pizza?"+"\n"+"1.Delgada"+"\n"+ "2.Gruesa");
                a=teclado.next(); 
                setBase(a);
                switch(a){
                    case "Delgada":
                        d=pizza1.getPrecio();
                        break;
                    case "Gruesa":
                        d=pizza1.getPrecio()+1000;
                        break;
                    default:
                        System.out.println("No existe esta opción");
                        break;
                        }
                System.out.println("¿Qué tamaño? 6inch,9 inch o 12 inch");
                b=teclado.nextInt();
                setTamaño(b);
                switch(b){
                    case 6:
                        d=d;
                        break;
                    case 9:
                        d=d+2000;
                        break;
                    case 12:
                         d=d+4000;
                        break;
                    default:
                        System.out.println("No existe esta opción");
                        break;
                        }
                f=f+d;
                break;
                    
            case "Doityourself":
                Doityourself pizza2=new Doityourself();
                pizza2.pedidoDoityourself();
                System.out.println("¿Qué base de pizza quiere para la pizza?"+"\n"+"1.Delgada"+"\n"+ "2.Gruesa");
                a=teclado.next(); 
                setBase(a);
                switch(a){
                    case "Delgada":
                        e=pizza2.getPrecio()+500;
                        break;
                    case "Gruesa":
                        e=pizza2.getPrecio()+1000;
                        break;
                    default:
                        System.out.println("No existe esta opción");
                        break;
                        }
                System.out.println("¿Qué tamaño? 6inch,9 inch o 12 inch");
                b=teclado.nextInt();
                setTamaño(b);
                switch(b){
                    case 6:
                        e=e;
                        break;
                    case 9:
                        e=e+2000;
                        break;
                    case 12:
                         e=e+4000;
                        break;
                    default:
                        System.out.println("No existe esta opción");
                        break;
                }
            f=f+e;
            break;
             }
        
        }
        this.setPreciototal(f);
    }
}



