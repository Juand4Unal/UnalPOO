/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.actividad3parte2;

/**
 *
 * @author Juanda
 */
public class Trapecio {

    double baseMayor;
    double baseMenor;
    double lado1;
    double lado2;
    double altura;

    // Constructor para inicializar el trapecio
    public Trapecio(double baseMayor, double baseMenor, double lado1, double lado2, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    // Método para calcular el área del trapecio
    public double calcularArea() {
        return (baseMayor + baseMenor) * altura / 2.0;
    }

    // Método para calcular el perímetro del trapecio
    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}
