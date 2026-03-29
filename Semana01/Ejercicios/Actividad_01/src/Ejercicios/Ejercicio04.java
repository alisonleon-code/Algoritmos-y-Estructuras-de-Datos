
package Ejercicios;

/**
 *
 * @author AlisonLeon
 */

import java.util.Random;

public class Ejercicio04 {
    
    public static void main(String[] args) {
        Random rand = new Random();
        // CREACIÓN DEL VECTOR
        int[] vector = new int[15];
        // LLENAR CON VALORES ALEATORIOS
        System.out.println("Vector generado:");
        
        for (int i = 0; i < vector.length; i++) {
            
            // Números aleatorios entre 1 y 100
            vector[i] = rand.nextInt(100) + 1;
            
            System.out.print(vector[i] + " ");
        }
        
        // BUSCAR PRIMER NÚMERO PAR
        boolean encontrado = false;

        for (int i = 0; i < vector.length; i++) {
            
            // Verificar si es par
            if (vector[i] % 2 == 0) {
                
                System.out.println("\nPrimer número par: " + vector[i]);
                System.out.println("Posición: " + i);
                
                encontrado = true;
                break; // IMPORTANTE: detenerse en el primero
            }
        }
        // SI NO HAY NÚMEROS PARES
        if (!encontrado) {
            System.out.println("\nNo se encontró ningún número par.");
        }
    }
}
