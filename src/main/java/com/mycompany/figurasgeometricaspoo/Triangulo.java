package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    //Este constructor tiene una complejidad constante, O(1).
    public Triangulo(String nombre,String color,double base,double altura){
        super(nombre, color);
        this.base=base;
        this.altura=altura;
    }
    //La complejidad de este método es constante, O(1).
    public double obtenerArea(){
        double area= (this.altura*this.base)/2;
        return area;
    }
    //La complejidad de este método es constante, O(1).
    public double obtenerPerimetro(){
         double tercerLado = Math.sqrt(Math.pow(this.altura, 2)+Math.pow(this.base, 2));
         double perimetro= tercerLado+ this.altura+this.base;
         return perimetro;
    }
}
