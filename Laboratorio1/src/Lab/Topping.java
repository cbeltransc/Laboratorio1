/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

/**
 *
 * @author USUARIO
 */
public class Topping {
     /**      Declaración de las variables privadas.
     */
    private String ingrediente;
    private double precio;
/**
 * Creación del constructor
 *@param ingrediente indica la el nombre del topping.
 *@param precio indica su precio correspondiente.
 */
    public Topping(String ingrediente, double precio) {
        this.ingrediente = ingrediente;
        this.precio = precio;
    }
/**
 * Metodos get que se usan para retornar la información guardada en ese espacio de memoria.
 */
    public String getIngrediente() {
        return ingrediente;
    }

    public double getPrecio() {
        return precio;
    }

/**
 * Metodos set que se usan para llenar espacios de momeria con información.
 */

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}

    

