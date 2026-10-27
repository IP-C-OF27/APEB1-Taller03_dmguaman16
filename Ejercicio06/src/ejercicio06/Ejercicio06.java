/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author USER
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean ladoIzquierdo;
        boolean ladoDerecho;
        double numeroRaiz = 81;
        int sumando = 9;
        int denominador = 3;
        int numeroComparacion1 = 9;
        
        int izquierdaComparacion = 10;
        int derechaComparacion = 1;
        
        double division = (Math.sqrt(numeroRaiz) + sumando) / denominador;
        ladoIzquierdo = division == numeroComparacion1;
        
        ladoDerecho = izquierdaComparacion > derechaComparacion;
        
        boolean resultado = ladoIzquierdo && ladoDerecho;
        
        System.out.println("El resultado de la primera expresión es: " + ladoIzquierdo);
        System.out.println("El resultado de la segunda expresión es: " + ladoDerecho);
        System.out.println("El resultado de las expresiones es: " + resultado);
        
        
        
    }
    
}
