/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juanda
 */
public class calculo {
    private int a;
    private int b;
    
    public calculo(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void comparar() {
        if (a > b) {
            System.out.println("A (" + a + ") es mayor que B (" + b + ").");
        } else if (a < b) {
            System.out.println("A (" + a + ") es menor que B (" + b + ").");
        } else {
            System.out.println("A (" + a + ") es igual a B (" + b + ").");
        }
    }
    
}
