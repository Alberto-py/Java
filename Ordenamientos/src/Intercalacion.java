import java.io.*;
public class Intercalacion {
	
	public static void intercalacion(int arregloA [], int arregloB []) {
		int i, j, k;
		int arregloC [] = new int [arregloA.length + arregloB.length];
		
		for(i=j=k=0; i<arregloA.length && j<arregloB.length; k++) {
			if(arregloA[i] < arregloB[j]) {
				arregloC[k] = arregloA[i];
				i++;
			} else {
				arregloC[k] = arregloB[j];
				j++;
			}
		}
		for(; i<arregloA.length; i++, k++) {
			arregloC[k] = arregloA[i];
		}
		for(; j<arregloB.length; j++, k++) {
			arregloC[k] = arregloB[j];
		}
		//Metodo para imprimir Arreglos Ordenados
		System.out.print("\n\nArreglo Final: ");
		Imprimir(arregloC);
	}
	
	public static void Imprimir(int datos[]) {
		for(int i = 0; i < datos.length; i++) {
            System.out.print( datos[i]);
            if(i < datos.length-1)
				System.out.print(", ");
			else
				System.out.print("");
        }
	}
	
	public static void main(String[] args) {
        
        //Arreglos previamente ordenados
        int vector1 [] = {1,2,4,6,9};
        int vector2 [] = {3,5,7,8,10};
        
        System.out.println("\t\t\tORDENAMIENTO POR INTERCALACION");
        
		System.out.print("Arreglo A Original: ");
		Imprimir(vector1); System.out.print("\n");
		System.out.print("Arreglo B Original: ");
		Imprimir(vector2); System.out.print("\n");
        
        //Llamada Metodo de Ordenamiento por Intercalacion
        intercalacion(vector1, vector2);
    }
}