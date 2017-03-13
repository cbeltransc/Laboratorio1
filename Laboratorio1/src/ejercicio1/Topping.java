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
public class Topping {
   
    private int cantidad;
    private String ingrediente;    
    private double precio;

    public Topping(String ingrediente,double precio) {
        this.ingrediente = ingrediente;
        this.precio = precio;
        
        }

    public String getIngrediente() {
        return ingrediente;
    }
    public double getPrecio() {
        return precio;
    }
    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }    
    }

