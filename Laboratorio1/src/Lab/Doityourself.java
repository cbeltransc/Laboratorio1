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
public class Doityourself {
       /**
 * Declaración de los atributos privados.
 */
    private double precio;
    private Topping[] topping;
/**
 * Creación del constructor
 *@param topping asocia el tipo de pizza con los ingredientes que elige el cliente.
 *@param precio indica el precio que se le agrega a la suma de precios de los ingredientes seleccionados más él mismo.
 */
    public Doityourself() {
        this.precio = precio;
        this.topping = topping;
    }
/**
 * Metodos get que se usan para retornar la información guardada en ese espacio de memoria.
 */
    public double getPrecio() {
        return precio;
    }
    public Topping[] getTopping(){
        return topping;
    }
 /**
 * Metodos set que se usan para llenar espacios de momeria con información.
 */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTopping(Topping[] topping) {
        this.topping = topping;
    }
    /**
 * Se establecen los toppings predeterminados del restaurante con su precio respectivo.
 */
    Topping[] ingrediente=new Topping[8];
    Topping queso=new Topping("queso",2000);
    Topping carne=new Topping("carne",3500);
    Topping pollo=new Topping("pollo",3000);
    Topping tocineta=new Topping("tocineta",2500);
    Topping maiz=new Topping ("maiz", 900);
    Topping champinones=new Topping ("champinones", 2500);
    Topping pina=new Topping ("pina",1000);
    Topping jamon=new Topping("jamon",2000);
    Topping pimenton=new Topping ("pimenton",500);
    
    /**
 * Metódo que permite al cliente escoger la cantidad y el nombre de los topping que desee para su pizza, así mimso, establece el precio de la orden.
 */
    public void establecerToppings() {
        Scanner teclado=new Scanner (System.in);
        System.out.println("¿Cuántos ingrediente quiere?");
        int a =0;
        int  m=0;
        int n=0;
        a=teclado.nextInt(); 
        System.out.println("¿Cuáles?"+"\n"+"1.Queso"+"\n"+"2.Jamon"+"\n"+"3.Champinones"+"\n"+"4.Pollo"+"\n"+"5.Carne"+"\n"+"6.Tocineta"+"\n"+"7.Maiz"+"\n"+"8.Pina"+"\n"+"9.Pimenton"+"\n"+"El tomate ya viene incluido en el precio");
        Topping [] seleccion=new Topping [a];
            for (int i = 0; i < a; i++) {
                 String b=null;
                 b=teclado.next();
             switch(b){
                case "queso":
                    seleccion[i]=queso;
                    m=2000;
                    break;
                case "pollo":
                    seleccion[i]=pollo;
                    m=3000;
                    break;
                case "maiz":
                    seleccion[i]=maiz;
                    m=900;
                    break;
                 case "tocineta":
                    seleccion[i]=tocineta;
                    m=2500;
                    break;
                case "carne":
                    seleccion[i]=carne;
                    m=3500;
                    break;
                case "pina":
                    seleccion[i]=pina;
                    m=1000;
                    break;
                case "jamon":
                    seleccion[i]=jamon;
                    m=2000;
                    break;
                case "champinones":
                    seleccion[i]=champinones;
                    m=2500;
                    break;
                case "pimenton":
                    seleccion[i]=pimenton;
                    m=500;
                    break;
                default:
                 System.out.println("No existe esta opción");
                 break;    
                 } 
             n=n+m;
            }
         setPrecio(n+5000);    
        }
           
      
    }
           
   
