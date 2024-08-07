/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3parte2;

/**
 *
 * @author Juanda
 */
public class TrianguloRectangulo {
    int base;
    int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura / 2.0);
    }

    double calcularPerimetro() {
        return Math.round((base + altura + calcularHipotenusa()));
    }

    double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        if ((base == altura) && (base == hipotenusa) && (altura == hipotenusa)) {
            return "Es un triangulo equilatero";
        } else if ((base != altura) && (base != hipotenusa) && (altura != hipotenusa)) {
            return "Es un triangulo escaleno";
        } else {
            return "Es un triangulo isosceles";
        }
    }
}


