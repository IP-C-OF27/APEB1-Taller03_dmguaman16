/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author USER
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean primeraExpresion;
        boolean segundaExpresion;
        boolean resultado;
        
        double multiplicacion;
        double raizCuadrada = 25;
        int factor = 10;
        int primerNumero = 100;
        
        double division;
        int numerador = 10;
        int denominador = 5;
        int segundoNumero = 2;
        
        multiplicacion = Math.sqrt(raizCuadrada) * factor;
        
        primeraExpresion = multiplicacion >= primerNumero;
        
        division = numerador / denominador;
        
        segundaExpresion = division >= segundoNumero;
        
        resultado = primeraExpresion && true || false || segundaExpresion;
        
        System.out.println("Si " + multiplicacion + " >= " + primerNumero + " && true || false || " + division + " entonces es: " + resultado);
        
        
    }
    
}
