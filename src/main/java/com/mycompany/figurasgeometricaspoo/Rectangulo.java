package com.mycompany.figurasgeometricaspoo;

public class Rectangulo extends FiguraGeometrica{
    private double lado1;
    private double lado2;
    //Este constructor tiene una complejidad constante, O(1).
    public Rectangulo(String nombre,String color,double lado1,double lado2){
        super(nombre, color);
        this.lado1=lado1;
        this.lado2=lado2;
    }//La complejidad de este método es constante, O(1).
    public double obtenerArea(){
        double area= this.lado1*this.lado2;
        return area;
    }
    //La complejidad de este método es constante, O(1).
    public double obtenerPerimetro(){
        double perimetro= this.lado1*2+this.lado2*2;
        return perimetro;
    }
}
