/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author User
 */
// Circulo.java
public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void mostrarDatos() {
        System.out.println("CIRCULO");
        System.out.println("Radio: " + radio + " cm");
        System.out.printf("Area: %.2f cm\n", calcularArea());
        System.out.printf("Perimetro: %.2f cm\n\n", calcularPerimetro());
    }
}


