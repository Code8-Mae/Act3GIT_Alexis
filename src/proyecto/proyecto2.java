package proyecto;


import java.util.Scanner;
import java.util.InputMismatchException;

public class proyecto2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Programa de números con incremento de 7 ===");
        
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        while (num1 == num2) {
            System.out.println("Error: Los números deben ser distintos.");
            System.out.println("Introduce el segundo número nuevamente: ");
            num2 = scanner.nextInt();
        }
        
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);
        
        System.out.println("\nNúmeros entre " + menor + " y " + mayor + " (de 7 en 7):");
        System.out.println("----------------------------------------");
        
        int numeroActual = menor;
        int contador = 0;
        
        while (numeroActual <= mayor) {
            System.out.print(numeroActual + "  ");
            numeroActual += 7;
            contador++;
            
            if (contador % 10 == 0) {
                System.out.println();
            }
        }
        
        System.out.println("\n\nTotal de números mostrados: " + contador);
    }
    }