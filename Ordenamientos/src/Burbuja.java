import java.io.*;
public class Burbuja {
	
	public static void Burbuja(int listab []) {
		for(int i = 0; i < listab.length; i++) {
			System.out.print(listab[i]);
			
			if(i < listab.length-1)
				System.out.print(", ");
			else
				System.out.print("");
		}
	}

	public static void main(String [] args) {
		
		int numeros [] = {20,14,22,2,8,0,10,4,6,18};
		
		System.out.println("\t\t\tORDENAMIENTO BURBUJA");
		
		System.out.print("Lista Original: ");
		Burbuja(numeros); System.out.print("\n");
		
		System.out.print("\n\t\t\tPROCESO BURBUJA");
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros.length-1; j++) {
				if(numeros[j]>numeros[j+1]) {
					int temp = numeros[j+1];
					numeros[j+1] = numeros[j];
					numeros[j] = temp;
				}
			}
			System.out.print("\nBucle " + i + ": ");
			Burbuja(numeros);
		}
		System.out.print("\n\nLista Final: ");
		Burbuja(numeros);
	}
}