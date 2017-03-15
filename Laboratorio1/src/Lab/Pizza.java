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
public class Pizza {
    private int tamaño;
    private String base;
    private double precio;
    private String tipo;
    private Doityourself ptipo2;
    
    
    public Pizza() {
        this.tamaño = tamaño;
        this.base = base;
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getBase() {
        return base;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void pedidopizza(){
       Scanner teclado=new Scanner (System.in);
        String a = null;
        int b=0;
        String c=null;
        String g=null;
        
          
        System.out.println("¿Que tipo de pizza quiere?"+"\n"+"1.Prefabricada"+"\n"+"2.Do it yourself");
        c=teclado.next();
        switch(c){
            case "prefabricada":
                setTipo(c);
                System.out.println("¿Cuál pizza quiere?"+"\n"+"1.Hawaiana"+"\n"+"2.Pollo"+"\n"+"3.Colombiana"+"\n"+"4.Tocineta"+"\n"+"5.Vegetariana");
              
        g=teclado.next();
        switch(g){
                case "hawaiana":
                    this.setPrecio(8000);
                    break;
                case "pollo":
                    this.setPrecio(9000);
                    break;
                case "colombiana":
                    this.setPrecio(9500);
                    break;
                 case "tocineta":
                     this.setPrecio(8500);
                     break;
                 case "vegetariana":
                     this.setPrecio(7500);
                 default:
                 System.out.println("No existe esta opción");
                 break;
                  }
                System.out.println("¿Qué base de pizza quiere para la pizza?"+"\n"+"1.Delgada"+"\n"+ "2.Gruesa");
                a=teclado.next(); 
                setBase(a);
                switch(a){
                    case "delgada":
                        this.setPrecio(getPrecio());
                        break;
                    case "gruesa":
                        this.setPrecio(getPrecio()+1000);
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
                        this.setPrecio(getPrecio());
                        break;
                    case 9:
                        this.setPrecio(getPrecio()+2000);
                        break;
                    case 12:
                         this.setPrecio(getPrecio()+4000);
                        break;
                    default:
                        System.out.println("No existe esta opción");
                        break;
                        }
                break;
                    
            case "doityourself":
                Doityourself pizza=new Doityourself();
                pizza.establecerToppings();
                setPrecio(pizza.getPrecio());          
                System.out.println("¿Qué base de pizza quiere para la pizza?"+"\n"+"1.Delgada"+"\n"+ "2.Gruesa");
                a=teclado.next(); 
                setBase(a);
                switch(a){
                    case "delgada":
                        this.setPrecio(getPrecio());
                        break;
                    case "gruesa":
                        this.setPrecio(getPrecio()+1000);
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
                        this.setPrecio(getPrecio());
                        break;
                    case 9:
                        this.setPrecio(getPrecio()+2000);
                        break;
                    case 12:
                         this.setPrecio(getPrecio()+4000);
                        break;
                    default:
                        System.out.println("No existe esta opción");
                        break;
                        }
                break;
        }
        
        }
        
    }    
   