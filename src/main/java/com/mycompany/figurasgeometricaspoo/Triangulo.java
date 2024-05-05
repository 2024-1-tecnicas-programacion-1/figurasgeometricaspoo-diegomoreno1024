package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    
    public Triangulo(String nombre,String color,double base,double altura){
        super(nombre, color);
        this.base=base;
        this.altura=altura;
    }
    
    public double obtenerArea(){
        double area= (this.altura*this.base)/2;
        return area;
    }
    
    public double obtenerPerimetro(){
         double tercerLado = (2*obtenerArea())/this.base;
         double perimetro= tercerLado+ this.altura+this.base;
         return perimetro;
    }
}
