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
                System.out.println("El àrea es: "+circuloCreado.obtenerArea());
                System.out.println("El perìmetro es: "+circuloCreado.obtenerPerimetro());
            break;
            case "rectangulo":
                System.out.println("Ingrese el valor del lado 1 del rectángulo");
                double lado1Ingresado= leer.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo");
                double lado2Ingresado= leer.nextDouble();
                Rectangulo rectanguloCreado= new Rectangulo(nombreFigura, colorFigura, lado1Ingresado, lado2Ingresado);
                System.out.println("El àrea es: "+rectanguloCreado.obtenerArea());
                System.out.println("El perìmetro es: "+rectanguloCreado.obtenerPerimetro());
            break;
            case "triangulo":
                System.out.println("Ingrese el valor de la base del tríangulo");
                double baseIngresada=leer.nextDouble();
                System.out.println("Ingrese el valor de la altura del tríangulo");
                double alturaIngresada=leer.nextDouble();
                Triangulo trianguloCreado= new Triangulo(nombreFigura, colorFigura, baseIngresada, alturaIngresada);
                System.out.println("El àrea es: "+trianguloCreado.obtenerArea());
                System.out.println("El perìmetro es: "+trianguloCreado.obtenerPerimetro());
                break;
            case "trianguloisosceles":
                System.out.println("Ingrese el valor de la base del tríangulo");
                double baseIngresadaIsosceles=leer.nextDouble();
                System.out.println("Ingrese el valor de la altura del tríangulo");
                double alturaIngresadaIsosceles=leer.nextDouble();
                TrianguloIsosceles trianguloIsoscelesCreado= new TrianguloIsosceles(nombreFigura, colorFigura, baseIngresadaIsosceles, alturaIngresadaIsosceles);
                System.out.println("El àrea es: "+trianguloIsoscelesCreado.obtenerArea());
                System.out.println("El perìmetro es: "+trianguloIsoscelesCreado.obtenerPerimetro());
        }
    }
}
