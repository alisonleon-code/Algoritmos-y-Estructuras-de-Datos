package balotario01;

import java.util.Scanner;

/**
Ejercicio 03:
Dada una lista implementada en un arreglo, implementa un método que inserte 
un nuevo valor inmediatamente después del primer nodo que contenga un 
valor específico. 
 * 
 * @author AlisonLeon
 */
public class Ejercicio03_InsertarDespues {

    public static void main(String[] args) {

        // Objeto para leer datos desde teclado
        Scanner sc = new Scanner(System.in);

        // Pedimos el tamaño del arreglo
        System.out.print("Tamaño del arreglo: ");
        int n = sc.nextInt();

        // Creamos el arreglo original
        int[] arr = new int[n];

        // Ingreso de elementos
        System.out.println("Ingrese elementos:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Valor que se desea buscar en el arreglo
        System.out.print("Valor a buscar: ");
        int buscar = sc.nextInt();

        // Valor que se insertará después del encontrado
        System.out.print("Valor a insertar: ");
        int nuevoVal = sc.nextInt();

        // Llamamos al método
        int[] res = insertarDespues(arr, buscar, nuevoVal);

        // Mostramos resultado
        System.out.print("Resultado: ");
        mostrar(res);
    }

    /**
     * Método que inserta un valor después de otro valor específico
     */
    public static int[] insertarDespues(int[] arr, int buscar, int nuevoVal){

        // Creamos un nuevo arreglo con un espacio adicional
        int[] nuevo = new int[arr.length + 1];

        int i = 0;

        // Copiamos los elementos hasta encontrar el valor buscado
        while(i < arr.length && arr[i] != buscar){
            nuevo[i] = arr[i];
            i++;
        }

        // Si encontramos el valor
        if(i < arr.length){

            // Copiamos el valor encontrado
            nuevo[i] = arr[i];
            i++;

            // Insertamos el nuevo valor después
            nuevo[i] = nuevoVal;

            // Copiamos el resto del arreglo desplazado una posición
            for(int j = i; j < arr.length; j++){
                nuevo[j + 1] = arr[j];
            }
        }

        // Retornamos el nuevo arreglo
        return nuevo;
    }

    /**
     * Método para mostrar los elementos del arreglo
     */
    public static void mostrar(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}