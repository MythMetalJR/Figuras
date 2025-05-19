/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author User
 */
// Rectangulo.java
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void mostrarDatos() {
        System.out.println("RECTANGULO");
        System.out.println("Base: " + base + " cm");
        System.out.println("Altura: " + altura + " cm");
        System.out.printf("Area: %.2f cm\n", calcularArea());
        System.out.printf("Perimetro: %.2f cm\n\n", calcularPerimetro());
    }
}
