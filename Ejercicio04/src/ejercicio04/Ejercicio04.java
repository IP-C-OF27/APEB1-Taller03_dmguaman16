/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author USER
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerador = 20;
        int sumando1 = 1;
        int sumando2 = 3;
        int suma = 2;
        int numeroComparacion = 3;
        int ladoIzquierdo;
        
        
        ladoIzquierdo = (numerador/ (sumando1+sumando2)) + suma;
        boolean esMayorOIgual = ladoIzquierdo >= numeroComparacion;
        
        System.out.println("El resultado izquierdo es: " + ladoIzquierdo);
        System.out.println("¿" + ladoIzquierdo + " es mayor o igual a " + numeroComparacion + "?: " + esMayorOIgual);
    }
    
}
