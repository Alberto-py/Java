import java.io.*;
public class Radix {
	
	public static void radix(int vector[]) {
		int x, i, j;
		for(x = Integer.SIZE -1; x >= 0; x--) {
			int aux[] = new int[vector.length];
			j = 0;
			for(i = 0; i < vector.length; i++) {
				boolean cambio = vector[i] << x >= 0;
				if(x == 0 ? !cambio:cambio) {
					aux[j] = vector[i];
					j++;
				} else {
					vector[i - j] = vector[i];
				}
			}
			for(i = j; i < aux.length; i++) {
				aux[i] = vector[i - j];
			}
			vector = aux;
		}
		//Metodo para imprimir Vector Ordenado
		System.out.print("\n\nArreglo Final: ");
        Imprimir(vector);
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
        
        //Numeros para ordenar
        int numeros [] = {850,280,325,410};
        System.out.println("\t\t\tORDENAMIENTO RADIX");
		
		System.out.print("Arreglo Original: ");
		Imprimir(numeros); System.out.print("\n");
        
        //Llamada Metodo de Ordenamiento Radix
        radix(numeros);
    }	
}