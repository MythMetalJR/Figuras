/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author User
 */
// Cuadrado.java
public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public void mostrarDatos() {
        System.out.println("CUADRADO");
        System.out.println("Lado: " + lado + " cm");
        System.out.printf("Area: %.2f cm\n", calcularArea());
        System.out.printf("Perimetro: %.2f cm\n\n", calcularPerimetro());
    }
}


