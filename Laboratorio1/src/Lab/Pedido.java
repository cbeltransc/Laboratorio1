/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Pedido {
    private int cantidad;
    private ArrayList<Bebida> bebida;
    private ArrayList<Pizza> pizza;

    public Pedido() {
        this.bebida = new ArrayList<>();
        this.pizza = new ArrayList<>();
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public ArrayList<Bebida> getBebida() {
        return bebida;
    }

    public ArrayList<Pizza> getPizza() {
        return pizza;
    }

    public void setBebida(ArrayList<Bebida> bebida) {
        this.bebida = bebida;
    }

    public void setPizza(ArrayList<Pizza> pizza) {
        this.pizza = pizza;
    }

    
    public void pedidoTotal(){
        Scanner teclado=new Scanner (System.in);
        int z=0;
        System.out.println("¿Cuántas pizzas quiere?");
        z=teclado.nextInt();
        setCantidad(z);
        for (int i = 0; i < z; i++) {
            Pizza pizza =new Pizza();
            pizza.pedidopizza();
            pizza.getBase();
            pizza.getTamaño();
            pizza.getTipo();
            pizza.getPrecio();
            this.pizza.add(pizza);
            Bebida bebida=new Bebida();
            bebida.pedidoBebida();
            bebida.getPrecio();
            bebida.getTamaño();
            bebida.getTipo();
            this.bebida.add(bebida);
           
        
            
        }
    }
    
    public double calcularTotalbebida(){
        double total=0;
    for(Bebida bebida:bebida){
        total+=bebida.getPrecio();
    }
    return total;
}    
    public double calcularTotalpizza(){
        double total=0;
    for(Pizza pizza:pizza){
        total+=pizza.getPrecio();
    }
    return total;
  }
        
        public void verProgreso(){
            System.out.println("Gracias por su compra");
            for (int i = 0; i < 110; i=i+10) {                
                System.out.println("El progreso de su pizza es "+i+"%.");
                
            }
}

    
    public void confirmarPedido(){
        Scanner teclado=new Scanner (System.in);
        String a=null;
        System.out.println("El valor de sus bebidas es "+ this.calcularTotalbebida()+". El valor de sus pizzas es "+this.calcularTotalpizza());
        System.out.println("El valor total de su pedido es "+(this.calcularTotalpizza()+this.calcularTotalbebida())+"\n"+"¿Confirma su pedido?");
        a=teclado.next();
        switch(a){
            case "si":
                this.verProgreso();
                break;
            case "no":
                this.pedidoTotal();
                break;
            default:
                 System.out.println("No existe esta opción");
                 break;
        }
        
    }
}

   
