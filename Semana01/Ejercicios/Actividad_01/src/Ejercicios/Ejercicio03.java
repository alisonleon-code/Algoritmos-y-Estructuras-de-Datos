package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio03 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Vector para 10 personas (aunque diga Edad, usamos pesos)
        double[] Edad = new double[4];
        
        // INGRESO DE DATOS
        System.out.println("Ingrese los pesos de 10 personas:");
        for (int i = 0; i < Edad.length; i++) {
            System.out.print("Peso " + (i + 1) + ": ");
            Edad[i] = sc.nextDouble();
        }

        // MOSTRAR EN ORDEN INVERSO
        System.out.println("\nVector en orden inverso:");

        // Empezamos desde el último índice hasta el primero
        for (int i = Edad.length - 1; i >= 0; i--) {
            System.out.print(Edad[i] + " ");
        }
    }
}