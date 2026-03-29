
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // CREACIÓN DE VECTORES
        int[] A = new int[30];
        int[] B = new int[30];
        int[] C = new int[30]; // Aquí se guarda la suma
        
        // INGRESO DE DATOS PARA A
        System.out.println("Ingrese los valores del vector A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }
        // INGRESO DE DATOS PARA B
        System.out.println("\nIngrese los valores del vector B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = sc.nextInt();
        }
        // SUMA DE VECTORES
        // Se suma posición por posición
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }
        // MOSTRAR VECTOR C
        System.out.println("\nVector C (A + B):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}