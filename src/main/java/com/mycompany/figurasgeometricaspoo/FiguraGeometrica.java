package com.mycompany.figurasgeometricaspoo;

public class FiguraGeometrica {
    private String nombre;
    private String color;
    
    public FiguraGeometrica(String nombre,String color){
        this.nombre= nombre;
        this.color= color;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setColor(String color){
        this.color= color;
    }
    
    public String getColor(){
        return color;
    }
    
    public double obtenerArea(){
    }
    
    public double obtenerPerimetro(){
    }
}
