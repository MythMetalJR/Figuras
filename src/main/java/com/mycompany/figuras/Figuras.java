/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras;

/**
 *
 * @author User
 */
import java.util.Scanner;

// Main.java
public class Figuras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Cuadrado cuadrado = new Cuadrado(3);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3, 4);

        circulo.mostrarDatos();
        rectangulo.mostrarDatos();
        cuadrado.mostrarDatos();
        triangulo.mostrarDatos();
    }
}

