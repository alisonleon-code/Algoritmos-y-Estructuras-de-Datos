package balotario01;

import java.util.Scanner;

/**
Ejercicio 02:
 * Ejercicio 02:Dadas dos listas implementadas como arreglos y ordenadas ascendentemente, 
crea un método que mezcle ambas listas en una nueva lista también ordenada 
de forma ascendente. 
 * @author AlisonLeon
 */
public class Ejercicio02_MezclarArreglos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tamaño arreglo A
        System.out.print("Tamaño arreglo A: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        // Ingreso de datos A (sin ordenar)
        System.out.println("Ingrese elementos de A:");
        for(int i = 0; i < n1; i++){
            a[i] = sc.nextInt();
        }

        // Tamaño arreglo B
        System.out.print("Tamaño arreglo B: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        // Ingreso de datos B (sin ordenar)
        System.out.println("Ingrese elementos de B:");
        for(int i = 0; i < n2; i++){
            b[i] = sc.nextInt();
        }

        // Ordenamos ambos arreglos
        ordenarAscendente(a);
        ordenarAscendente(b);

        System.out.print("Arreglo A ordenado: ");
        mostrar(a);

        System.out.print("Arreglo B ordenado: ");
        mostrar(b);

        // Mezclamos
        int[] res = mezclar(a, b);

        System.out.print("Resultado final: ");
        mostrar(res);

        sc.close();
    }

    /**
     * Método para ordenar en forma ascendente
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
     * Método para mezclar dos arreglos ordenados
     */
    public static int[] mezclar(int[] a, int[] b){

        int[] res = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                res[k++] = a[i++];
            }else{
                res[k++] = b[j++];
            }
        }

        while(i < a.length){
            res[k++] = a[i++];
        }

        while(j < b.length){
            res[k++] = b[j++];
        }

        return res;
    }

    /**
     * Método para mostrar arreglo
     */
    public static void mostrar(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}