package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AlisonLeon
 */
public class Ejercicio01 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // CREACIÓN DEL VECTOR
        double[] NOTAS = new double[20];
        // INGRESO DE DATOS
        System.out.println("Ingrese las 20 notas:");

        for (int i = 0; i < NOTAS.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            NOTAS[i] = sc.nextDouble();
        }
        // VARIABLES PARA LOS CÁLCULO
        int aprobados = 0;     // contador de notas >= 12
        int nota17 = 0;        // contador de notas iguales a 17
        double suma = 0;       // suma total para promedio

        // PROCESO
        for (int i = 0; i < NOTAS.length; i++) {
            
            // Acumular suma
            suma += NOTAS[i];

            // a) Contar aprobados (>= 12)
            if (NOTAS[i] >= 12) {
                aprobados++;
            }

            // b) Contar notas iguales a 17
            if (NOTAS[i] == 17) {
                nota17++;
            }
        }

        // CÁLCULO DEL PROMEDIO
        double promedio = suma / NOTAS.length;
        // SALIDA DE RESULTADOS
        
        // c) Mostrar vector completo
        System.out.println("\nVector de notas:");
        for (double nota : NOTAS) {
            System.out.print(nota + " ");
        }

        // Resultados
        System.out.println("\n\nCantidad de aprobados (>=12): " + aprobados);
        System.out.println("Cantidad de alumnos con nota 17: " + nota17);
        
        // d) Mostrar promedio
        System.out.println("Promedio de notas: " + promedio);
    }
}