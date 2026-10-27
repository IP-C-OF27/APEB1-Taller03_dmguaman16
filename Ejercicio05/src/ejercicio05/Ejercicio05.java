/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author USER
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base = 2;
        int potencia = 2;
        int sumando = 12;
        int restando = 1;
        int numerador;
        int denominador = 3;
        int resultado;
        
        numerador = Math.powExact(base,potencia) + sumando - restando;
        resultado = numerador / denominador;
        
        System.out.println("El resultado de la expresión es: " + resultado);
        
    }
    
}
