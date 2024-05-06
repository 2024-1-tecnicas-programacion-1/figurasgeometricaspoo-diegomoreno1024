package com.mycompany.figurasgeometricaspoo;

public abstract class FiguraGeometrica {
    private String nombre;
    private String color;
    //Este constructor tiene una complejidad constante, O(1).
    public FiguraGeometrica(String nombre,String color){
        this.nombre= nombre;
        this.color= color;
    }
    //La complejidad de este método es constante, O(1).
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //La complejidad de este método es constante, O(1).
    public String getNombre(){
        return nombre;
    }
    //La complejidad de este método es constante, O(1).
    public void setColor(String color){
        this.color= color;
    }
    //La complejidad de este método es constante, O(1).
    public String getColor(){
        return color;
    }
    //La complejidad de este método es constante, O(1).
    public abstract double obtenerArea();
    //La complejidad de este método es constante, O(1).
    public abstract double obtenerPerimetro();
}
