/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea_modulo2;

/**
 *
 * @author Fernando Mendoza
 */
public class Tarea_Modulo2 {

    public static void main(String[] args) {
        
        Recursos recursos = new Recursos(); 
        
        System.out.println(recursos.Mensaje());
        
        int edad = 30; 
        System.out.println(recursos.Edad(edad));
        
        int a = 5;
        int b = 8; 
        System.out.println("El resultado de la multiplicacion es: " + recursos.multiplicacion(a, b));
        
        int x = 20;
        System.out.println("Lista generada: " + recursos.Lista(x));
        
    }

}
