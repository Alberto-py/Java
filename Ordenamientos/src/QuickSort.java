import java.io.*;
public class QuickSort {
	
	//Metodo de Ordenamiento QuickSort
    public static void Quicksort(int numeros[], int izq, int der) {
        
            //Se toma como pivote el primer valor
            int pivote = numeros[izq];
            
            //Se definen los dos lados y un auxiliar
            int a = izq; 
            int b = der; 
            int aux;
           
            while(a < b) {
                while (numeros[a] <= pivote && a < b) 
                	a++;

                while (numeros[b] > pivote) 
                    b--;   

                if (a < b) {                                     
                	aux = numeros[a];                  
                    numeros[a]= numeros[b];
                    numeros[b]=aux;
               }
            }

             numeros[izq] = numeros[b]; 
             numeros[b] = pivote;

             if (izq < b-1)
                Quicksort(numeros,izq,b-1);

             if (b+1 < der)
                Quicksort(numeros,b+1,der);
      }
    
    public static void ImprimirVector(int arreglo[]) {
        for(int i = 0; i < arreglo.length; i++) {
            System.out.print( arreglo[i]);
            
            if(i < arreglo.length-1)
				System.out.print(", ");
			else
				System.out.print("");
            
        }
    }
            
	public static void main(String[] args) {
        
        //Numeros para ordenar
        int numeros [] = {33,20,1,5,10,8,18,30,32,0};
        
        System.out.println("\t\t\tORDENAMIENTO QUICKSORT");
		
		System.out.print("Arreglo Original: ");
		ImprimirVector(numeros); System.out.print("\n");
        
        //Llamada Metodo de Ordenamiento QuickSort
        Quicksort(numeros, 0, numeros.length -1);
        
        //Metodo para imprimir Vector Ordenado
         System.out.print("\n\nArreglo Final: ");
         ImprimirVector(numeros);
    }
}