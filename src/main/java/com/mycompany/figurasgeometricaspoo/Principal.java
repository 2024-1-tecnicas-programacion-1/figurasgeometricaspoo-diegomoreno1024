package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la figura");
        String nombreFigura= leer.next();
        System.out.println("Ingrese el color de la figura");
        String colorFigura= leer.next();
        System.out.println("Ingrese el tipo de figura");
        String tipoFigura= leer.next();
        switch(tipoFigura){
            case "circulo":
                System.out.println("Ingrese el radio del círculo");
                double radioIngresao= leer.nextDouble();
                Circulo circuloCreado= new Circulo(nombreFigura,colorFigura,radioIngresao);
                System.out.println(circuloCreado.obtenerArea());
                System.out.println(circuloCreado.obtenerPerimetro());
            break;
            case "rectangulo":
                System.out.println("Ingrese el valor del lado 1 del rectángulo");
                double lado1Ingresado= leer.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo");
                double lado2Ingresado= leer.nextDouble();
                Rectangulo rectanguloCreado= new Rectangulo(nombreFigura, colorFigura, lado1Ingresado, lado2Ingresado);
                System.out.println(rectanguloCreado.obtenerArea());
                System.out.println(rectanguloCreado.obtenerPerimetro());
            break;
            case "triangulo":
                System.out.println("Ingrese el valor de la base del tríangulo");
                double baseIngresada=leer.nextDouble();
                System.out.println("Ingrese el valor de la altura del tríangulo");
                double alturaIngresada=leer.nextDouble();
                Triangulo trianguloCreado= new Triangulo(nombreFigura, colorFigura, baseIngresada, alturaIngresada);
                System.out.println(trianguloCreado.obtenerArea());
                System.out.println(trianguloCreado.obtenerPerimetro());
        }
    }
}
