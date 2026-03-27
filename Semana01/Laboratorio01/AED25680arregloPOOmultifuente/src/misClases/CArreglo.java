package misClases;

public class CArreglo {
    // Atributo privado: arreglo donde se almacenan las notas
    private int[] notas;
    
    // Constructor: recibe el tamaño del arreglo y lo crea
    public CArreglo(int n) {
        notas=new int[n];
    }
    
    // Método para mostrar las notas en pantalla
    public void muestraNotas() {
        System.out.print("notas= "); 
        for(int i=0;i<notas.length;i++)
            System.out.print(notas[i]+" ");
        System.out.println('}');
    }
    
    // Método que llena el arreglo con valores aleatorios (0 a 20)
    public  void cargaNotas(){
        for(int i=0;i<notas.length;i++)
            notas[i]=(int) (Math.random()*21);
    }
    
    // Método que devuelve la nota máxima
    public  int notaMax(){
        int notaMax=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>notaMax) notaMax=notas[i];
        }
        return notaMax;
    }
    
    // Método que calcula el promedio de las notas
    public  double promNotas (){
        int sUma=0;
        for(int i=0;i<notas.length;i++){
            sUma+=notas[i];
        }
        return sUma*1.0/notas.length;
    }
}
