/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author USER
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean primeraExpresion;
        boolean segundaExpresion;
        boolean terceraExpresion;
        boolean resultado;
        
        double division;
        double primeraBase = 81;
        int sumando = 9;
        int primerDenominador = 3;
        int numeroComparacion = 9;
        
        int segundaIzquierda = 10;
        int segundaDerecha = 1;
        
        double terceraDivision;
        int terceraNumerador = 100;
        int tercerDenominador = 25;
        
        double tercerBase = 100;
        
        division = (Math.sqrt(primeraBase) + sumando) / primerDenominador;
        
        primeraExpresion = division == numeroComparacion;
        
        segundaExpresion = segundaIzquierda > segundaDerecha;
        
        terceraDivision = terceraNumerador / tercerDenominador;
        
        terceraExpresion = terceraDivision >= Math.sqrt(tercerBase);
        
        resultado = primeraExpresion && segundaExpresion || terceraExpresion;
        
        System.out.println("La primera expresión es: " + primeraExpresion);
        System.out.println("La segunda expresión es: " + segundaExpresion);
        System.out.println("La tercera expresión es: " + terceraExpresion);
        System.out.println("El resultado de " + primeraExpresion + " && " + segundaExpresion + " || " + terceraExpresion + " es: " + resultado);
    }
    
}
