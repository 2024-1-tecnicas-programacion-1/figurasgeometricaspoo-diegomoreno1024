package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica{
    private double radio;
    //Este constructor tiene una complejidad constante, O(1).
    public Circulo(String nombre,String color,double radio){
        super(nombre, color);
        this.radio=radio;
    }
    //La complejidad de este método es constante, O(1).
    public double obtenerArea(){
        double area = Math.PI * Math.pow(this.radio, 2);
        return area;
    }
    //La complejidad de este método es constante, O(1).
    public double obtenerPerimetro(){
        double perimetro = 2 * Math.PI * this.radio;
        return perimetro;
    }
}
