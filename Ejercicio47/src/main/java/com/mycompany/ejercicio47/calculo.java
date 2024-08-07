/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ejercicio47;

/**
 *
 * @author Juanda
 */
public class calculo {
    double a;
    double b;
    calculo(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    String comparar(){
        if(a>b){
            return "A es mayor que B";
        } else if (a == b){
            return "A es igual que B";
        } else {
            return "B es mayor que A";
        }
             
    }
 


    public static void main(String args[]) {
        
        
        
    }
}
