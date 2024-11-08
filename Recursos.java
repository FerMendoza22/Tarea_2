/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea_modulo2;

/**
 *
 * @author Fernando Mendoza
 */
import java.util.ArrayList;
import java.util.List; 

public class Recursos {

    /**
     * @param args the command line arguments
     */
    public String Mensaje(){
        return "Programacion orientada a objetos 2021";
        // TODO code application logic here
    }
    public String Edad(int edad){
        if (edad >= 21){
            return "Mayor de edad";
        }else{
            return "Menor de edad";
        }
        
    }
    public int multiplicacion (int a, int b){
        return (a * b); 
        
    }
    public List <Integer>
            Lista(int x){
                List<Integer> lista = new ArrayList<>(); 
                for (int i = 1; i <= x; i++){
                    lista.add(i);
                }
                return lista;
    }
}
