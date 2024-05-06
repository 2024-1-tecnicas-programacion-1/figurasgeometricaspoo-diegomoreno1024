package com.mycompany.figurasgeometricaspoo;

public class TrianguloIsosceles extends FiguraGeometrica {
    private double baseIsosceles;
    private double alturaIsosceles;
    //Este constructor tiene una complejidad constante, O(1).
    public TrianguloIsosceles(String nombre, String color,double baseIsosceles,double alturaIsosceles) {
        super(nombre, color);
        this.baseIsosceles=baseIsosceles;
        this.alturaIsosceles=alturaIsosceles;
    }
    //La complejidad de este método es constante, O(1).
    public double obtenerArea() {
        double area= (this.alturaIsosceles*this.baseIsosceles)/2;
        return area;
    }
    //La complejidad de este método es constante, O(1).
    public double obtenerPerimetro() {
        double ladosIsosceles= Math.sqrt(Math.pow(this.alturaIsosceles, 2)+Math.pow(this.baseIsosceles/2, 2))*2;
        double perimetro= ladosIsosceles+this.baseIsosceles; 
        return perimetro;
    }
    
}
