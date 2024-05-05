package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica{
    private double radio;
    
    public Circulo(String nombre,String color,double radio){
        super(nombre, color);
        this.radio=radio;
    }
        
    public double obtenerArea(){
        double area = Math.PI * Math.pow(this.radio, 2);
        return area;
    }
    
    public double obtenerPerimetro(){
        double perimetro = 2 * Math.PI * this.radio;
        return perimetro;
    }
}
