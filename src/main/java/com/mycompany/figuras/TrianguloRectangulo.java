/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author User
 */
// TrianguloRectangulo.java
public class TrianguloRectangulo {
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        if (base == altura && altura == hipotenusa) {
            return "Equilatero";
        } else if (base == altura || base == hipotenusa || altura == hipotenusa) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }

    public void mostrarDatos() {
        System.out.println("TRIANGULO RECTANGULO");
        System.out.println("Base: " + base + " cm");
        System.out.println("Altura: " + altura + " cm");
        System.out.printf("Hipotenusa: %.2f cm\n", calcularHipotenusa());
        System.out.printf("Area: %.2f cm\n", calcularArea());
        System.out.printf("Perimetro: %.2f cm\n", calcularPerimetro());
        System.out.println("Tipo: " + determinarTipoTriangulo() + "\n");
    }
}
