package balotario01;

import java.util.Scanner;

/**
Ejercicio 01:
Dada una lista implementada en un arreglo que ya está ordenada en orden 
ascendente, crea un método para insertar un nuevo elemento en la posición 
correcta, de modo que la lista siga estando ordenada.
* 
* @author AlisonLeon
*/

public class Ejercicio01_InsertarOrdenado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tamaño del arreglo
        System.out.print("Tamaño del arreglo: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Ingreso de datos (SIN ordenar)
        System.out.println("Ingrese elementos:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Ordenamos el arreglo
        ordenarAscendente(arr);

        System.out.print("Arreglo ordenado: ");
        mostrar(arr);

        // Valor a insertar
        System.out.print("Valor a insertar: ");
        int valor = sc.nextInt();

        // Insertamos manteniendo el orden
        int[] nuevo = insertarOrdenado(arr, valor);

        System.out.print("Resultado final: ");
        mostrar(nuevo);

        sc.close();
    }

    /**
     * Método para ordenar el arreglo en forma ascendente
     */
    public static void ordenarAscendente(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * Método para insertar un valor manteniendo el orden
     */
    public static int[] insertarOrdenado(int[] arr, int valor){

        int[] nuevo = new int[arr.length + 1];

        int i = 0;

        while(i < arr.length && arr[i] < valor){
            nuevo[i] = arr[i];
            i++;
        }

        nuevo[i] = valor;

        for(int j = i; j < arr.length; j++){
            nuevo[j + 1] = arr[j];
        }

        return nuevo;
    }

    /**
     * Método para mostrar el arreglo
     */
    public static void mostrar(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}