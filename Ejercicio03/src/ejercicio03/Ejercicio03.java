package ejercicio03;
public class Ejercicio03 {
    public static void main(String[] args) {
        // TODO code application logic here
        double base = 10;
        double exponente = 2;
        double numeroRaiz = 16;
        double numerador = 20;
        double sumando1 = 1;
        double sumando2 = 11;
        
        double potencia;
        double raizCuadrada;
        double division;
        double resultado;
        
        potencia = Math.pow(base, exponente);
        raizCuadrada = Math.sqrt(numeroRaiz);
        division = numerador/ (sumando1+sumando2);
        resultado = potencia + raizCuadrada + division;
        System.out.println("El resultado de la expresión es: " + resultado);
        
    }
    
}
