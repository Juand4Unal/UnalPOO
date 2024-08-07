/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ejercicio423;

/**
 *
 * @author Juanda
 */
public class calculo {
    
    double a;
    double b;
    double c;
    
    double op1(double a, double b, double c){
        
        
        double ecuacion = (-b + Math.sqrt((b*b) - (4*a*c)))/(2*a);
        return ecuacion;
        
    }
    
    double op2(double a, double b, double c){
        
        double ecuacion = (-b - (Math.sqrt((b*b) - (4*a*c))))/(2*a);
        return ecuacion;
    }
    
    

    public static void main(String args[]) {
        // TODO code application logic here
    }
}
