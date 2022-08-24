import java.io.*;
public class Busqueda_Binaria {
	public static int Binaria(int arreglo[], int elemento) {
		int front, back, centro, valorC;
		
		front = 0;
		back = arreglo.length-1;
		
		while(front <= back) {
			centro = (front + back) / 2;
			valorC = arreglo[centro];
			System.out.println("Comparando a " + elemento + " con " + arreglo[centro]);
			
			if(elemento == valorC) {
				return centro;
			} else if(elemento < valorC) {
				//Desplazarnos a la izquierda
				back = centro - 1;
			} else {
				//Desplazarnos a la derecha
				front = centro + 1;
			}
		}
		return -1;
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
        
			//Numeros
			int numeros [] = {2,4,6,8,10,12,14,16,18,20};
			System.out.println("\t\t\tBUSQUEDA BINARIA");
			
			System.out.print("Arreglo Original: ");
			Imprimir(numeros); System.out.print("\n");
        
			//Llamada Metodo
			int indice = Binaria(numeros, 8);
			
			if(indice != -1) {
				System.out.println("Elemento 8 Encontrado en el Indice " + indice);
			} else {
				System.out.println("El Elemento No Fue Encontrado");
			}
		}	
}