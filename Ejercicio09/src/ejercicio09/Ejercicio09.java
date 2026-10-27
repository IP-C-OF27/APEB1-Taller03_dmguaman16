/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author USER
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double primeraExpresion;
        boolean resultado;
      
        
        double primeraRaiz = 81;
        double segundaRaiz = 25;
        int factor = 10;
        
        int numeroComparacion = 50;
        
        primeraExpresion = Math.sqrt(primeraRaiz) + Math.sqrt(segundaRaiz) * factor;
        resultado = primeraExpresion >= numeroComparacion;
        System.out.println("El resultado de la primera ecuación es: " + primeraExpresion);
        System.out.println("Entonces " + primeraExpresion + " >= 50 es: " + resultado);
        
    }
    
}
