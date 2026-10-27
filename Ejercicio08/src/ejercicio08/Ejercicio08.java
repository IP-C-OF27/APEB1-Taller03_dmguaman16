/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author USER
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean primeraExpresion;
        boolean segundaExpresion;
        boolean resultado;
        
        double primerResultado;
        int multiplicacion;
        int factor1 = 10;
        int factor2 = 9;
        int sumaIzquierda = 20;
        double division;
        int numerador = 500;
        int denominador = 2;
        int base = 3;
        int potencia = 2;
        int primerNumeroComparacion= 200;
        
        int segundoNumeroComparacion= 50;
        int sumatoria;
        int sumaDerecha = 50;
        int restaDerecha = 50;
        int sumaDerecha2 = 51;
        
        multiplicacion = factor1 * factor2;
        division = numerador / denominador;
        
        primerResultado = multiplicacion + sumaIzquierda - division + Math.pow(base, potencia);
        
        primeraExpresion = primerResultado >= primerNumeroComparacion;
        
        sumatoria = sumaDerecha - restaDerecha + sumaDerecha2;
        
        segundaExpresion = segundoNumeroComparacion >= sumatoria;
        
        resultado = primeraExpresion || segundaExpresion;
        
        System.out.println("La primera expresión es: " + primeraExpresion);
        System.out.println("La segunda expresion es: " + segundaExpresion);
        System.out.println("La expresión es: " + resultado);
        
    }
    
}
