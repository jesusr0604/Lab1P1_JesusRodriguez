package lab1_jesusrodriguez;

import java.util.Scanner;

public class Lab1_JesusRodriguez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("-- Bienvenido al sistema de calculo de promedio --");
        System.out.print( "Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        
        // Se ingresan los notas
        System.out.print ( "Ingrese la nota final de la primera clase: ");
        double primeraClase = entrada.nextDouble();
        
        System.out.print ( "Ingrese la nota final de la segunda clase: ");
        double segundaClase = entrada.nextDouble();
        
        System.out.print ( "Ingrese la nota final de la tercera clase: ");
        double terceraClase = entrada.nextDouble();
        
        System.out.print ( "Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = entrada.nextDouble();
        
        //se calcula
        double sumaclase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaclase / 4;
        
        //Se imprime el resultado
        System.out.println("----" + nombre + "El promedio de las 4 clases es de: " + promedio);
    }
    
    
    
    
}
