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
public class Main {
    public static void main(String[] args) {
       
       Bebida bebida=new Bebida();
       Pizza pizza=new Pizza();
       bebida.pedidobebida();
       pizza.pedidopizza();
        System.out.println("El precio total de su pedido es "+ (bebida.getPrecio()+pizza.getPreciototal())+ " pesos.");
       
    }
    
}
