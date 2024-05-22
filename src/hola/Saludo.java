package hola;

import java.util.Scanner;

public class Saludo {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Saludar al usuario
        System.out.println("Buenos días Ceinmark, soy Marta Gómez");
        
        // Pedir un número al usuario
        System.out.print("Introduce un número para averiguar si es primo o no:");
        int numero = scanner.nextInt();
        
        // Verificar si el número es primo
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
        System.out.println("Los divisores de " + numero + " son: " + obtenerDivisores(numero));
        
        // Cerrar el scanner
        scanner.close();
    }
    
    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }
        // Verificar divisibilidad desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Método para obtener los divisores de un número
    public static String obtenerDivisores(int numero) {
        StringBuilder divisores = new StringBuilder();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                if (divisores.length() > 0) {
                    divisores.append(", ");
                }
                divisores.append(i);
            }
        }
        return divisores.toString();
    }
}
