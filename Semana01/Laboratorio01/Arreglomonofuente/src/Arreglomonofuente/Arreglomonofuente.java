
package Arreglomonofuente;

import java.util.Scanner;

public class Arreglomonofuente {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // Se pide al usuario la cantidad de notas
        System.out.print("ingrese nro de notas: ");
        int n=sc.nextInt();
        
        // Se crea un arreglo de tamaño n para almacenar las notas
        int[] notas=new int[n];
        
        // Se llena el arreglo con valores aleatorios
        cargaNotas(notas);
        // Se muestran todas las notas en pantalla
        muestraNotas(notas);
       
        // Se obtiene la nota máxima del arreglo
        int notaMax= notaMax(notas);
        System.out.println("nota maxima= "+notaMax);
        
        // Se calcula el promedio de las notas
        double promNotas=promNotas(notas);
        System.out.println("nota promedio= "+promNotas);
    }
    // Método que calcula el promedio de las notas
    public static double promNotas (int[] notas){
       // Variable para acumular la suma de las notas
        int sUma=0;
        // Recorre todo el arreglo sumando cada nota
        for(int i=0;i<notas.length;i++){
            sUma+=notas[i];
        }
        // Retorna el promedio (se multiplica por 1.0 para obtener decimal)
        return sUma*1.0/notas.length;
    }
    // Método que encuentra la nota máxima
    public static int notaMax(int[] notas){
        // Se inicializa la nota máxima en 0
        int notaMax=0;
        // Recorre el arreglo buscando el valor mayor
        for(int i=0;i<notas.length;i++){
            if(notas[i]>notaMax) notaMax=notas[i];
        }
        // Retorna la nota máxima encontrada
        return notaMax;
    }
    // Método que muestra las notas en pantalla
    public static void muestraNotas(int[] notas){
        // Recorre el arreglo e imprime cada nota
        for(int i=0;i<notas.length;i++)
            System.out.print(notas[i]+" ");
        // Salto de línea al final
        System.out.println();
    }
    // Método que carga el arreglo con valores aleatorios
    public static void cargaNotas(int[] notas){
       // Recorre el arreglo asignando valores aleatorios entre 0 y 20
        for(int i=0;i<notas.length;i++)
            notas[i]=(int) (Math.random()*21);
    }
}
