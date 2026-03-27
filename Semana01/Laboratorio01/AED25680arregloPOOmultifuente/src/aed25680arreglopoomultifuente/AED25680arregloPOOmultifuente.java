package aed25680arreglopoomultifuente;
import java.util.Scanner;

import misClases.CArreglo;

public class AED25680arregloPOOmultifuente 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
         // Se solicita al usuario la cantidad de notas
        System.out.print("ingrese nro de notas: ");
        int n=sc.nextInt();
        
         // Se crea un objeto de la clase CArreglo con tamaño n
        CArreglo arr=new CArreglo(n);
        
        // Se llama al método que llena el arreglo con valores aleatorios
        arr.cargaNotas();

        // Se llama al método que muestra las notas en pantalla
        arr.muestraNotas();
        
        // Se imprime la nota máxima obtenida desde la clase CArreglo
        System.out.println("nota max= "+arr.notaMax());

        // Se imprime el promedio de notas calculado en la clase CArreglo
        System.out.println("nota prom= "+arr.promNotas());
        
    }
}
