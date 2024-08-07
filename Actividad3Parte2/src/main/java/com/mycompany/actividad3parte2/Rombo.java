/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.actividad3parte2;

/**
 *
 * @author Juanda
 */
public class Rombo {

    double diagonal1;
    double diagonal2;
    double lado;

    // Constructor para inicializar el rombo con las diagonales y el lado
    public Rombo(double diagonal1, double diagonal2, double lado) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.lado = lado;
    }

    // Método para calcular el área del rombo
    public double calcularArea() {
        return (diagonal1 * diagonal2) / 2.0;
    }

    // Método para calcular el perímetro del rombo
    public double calcularPerimetro() {
        return 4 * lado;
    
    }
}
