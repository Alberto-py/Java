import java.util.*;

public class Funciones_Hash {
	String arreglo [];
	int tamano, contador;
	
	public Funciones_Hash(int tam) {
		tamano = tam;
		arreglo = new String [tam];
		Arrays.fill(arreglo, "-1");
	}
	
	public void funcionesHash(String cArreglo[], String arreglo []) {
		int i;
		for(i = 0; i < cArreglo.length; i++) {
			String elemento = cArreglo[i];
			int indice = Integer.parseInt(elemento) % 7;
			System.out.println("El Indice es: " + indice + " Para el Elemento " + elemento);
			
			//Colisiones
			while(arreglo[indice] != "-1") {
				indice++;
				System.out.println("Ocurrio una Colision en el Indice " + (indice-1) + " Cambiar el Indice " + indice);
				indice %= tamano;
			}
			arreglo[indice] = elemento;
		}
	}
	
	//Metodo para Imprimir la tabla
	public void Imprimir() {
		int incremento = 0, i, j;
		for(i = 0; i < 1; i++) {
			incremento += 8;
			for(j = 0; j < 71; j++) {
				System.out.print("-");
			}
			System.out.println();
			for(j = incremento -8; j < incremento; j++) {
				System.out.format("| %3s " + " ", j);
			}
			System.out.println(" | ");
			for(int n = 0; n < 71; n++) {
				System.out.print("-");
			}
			
			System.out.println();
			
			for(j = incremento-8; j < incremento; j++) {
				if(arreglo[j].equals("-1")) {
					System.out.print(" |       ");
				} else {
					System.out.print(String.format("| %3s " + " ", arreglo[j]));
				}
			}
			System.out.println(" | ");
			for(j = 0; j < 71; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
	
	//Metodo para Buscar Claves
	public String Bclave(String elemento) {
		int indice = Integer.parseInt(elemento) % 7;
		int contador = 0;
		
		while(arreglo[indice] != "-1") {
			if(arreglo[indice] == elemento) {
				System.out.println("El elemento " + elemento + " Fue encontrado en el Indice " + indice);
			return arreglo[indice];
			}
			indice++;
			indice %= tamano;
			contador++;
			if(contador > 7) {
				break;
			}
		}
		return null;
	}
	
	public static void main(String [] args) {
		Funciones_Hash Hash = new Funciones_Hash(8);
		String datos[] = {"Daniela", "Oscar", "Luis", "Maria", "Karla", "Rene"};
		Hash.funcionesHash(datos, Hash.arreglo);
		Hash.Imprimir();
		String Buscar = Hash.Bclave("Oscar");
		if(Buscar == null) {
			System.out.println("El elemento no se encuentra en la tabla ");
		}
	}
}