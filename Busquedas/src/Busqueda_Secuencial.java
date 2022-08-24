import java.io.*;
public class Busqueda_Secuencial {
	public static int Secuencial(int arreglo[], int elemento) {
		int i;
		boolean encontrado = false;
		
		for(i = 0; i < arreglo.length && encontrado == false; i++) {
			if(elemento == arreglo[i]) {
				encontrado = true;
				return i;
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
			System.out.println("\t\t\tBUSQUEDA SECUENCIAL");
			
			System.out.print("Arreglo Original: ");
			Imprimir(numeros); System.out.print("\n");
        
			//Llamada Metodo
			int indice = Secuencial(numeros, 8);
			
			if(indice != -1) {
				System.out.println("Elemento 8 Encontrado en el Indice " + indice);
			} else {
				System.out.println("El Elemento No Fue Encontrado");
			}
		}	
}