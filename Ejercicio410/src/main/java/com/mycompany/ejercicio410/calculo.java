/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ejercicio410;

/**
 *
 * @author Juanda
 */
public class calculo {
    double patrimonio;
    double estrato;
    
    calculo(double patrimonio, double estrato) {
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }
    
    double op(){
        
        if(patrimonio > 2000000 && estrato>3 ){
            
            double porc = (patrimonio * 3)/100;
            
            double matricula = 50000 + porc;
            
            return matricula;
            
            
        }else {
            int matricula = 50000;
            return matricula;
        }
             
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
