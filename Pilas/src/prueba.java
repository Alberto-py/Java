import java.util.*;
public class prueba {
	public static void main(String [] args) {
		String frase;
		Scanner leer = new 	Scanner(System.in);
		
		System.out.println("Ingresa la Frase: ");
		frase = leer.nextLine();
		
		if(prueba.esPalindroma(frase)) {
			System.out.println("La Frase Si es Palindroma ");
		}
		else {
			System.out.println("La Frase No es Palindroma ");
		}
		
	}
//Eliminar de la frase los espacios y caracteres especiales
	public static boolean esPalindroma(String frase) {
		String aux = "";
		int tam = frase.length();
		frase = frase.toLowerCase();
		
		for(int i=0; i< tam; i++) {
			if(! (frase.substring(i, i + 1).equals(" ") || frase.substring(i, i + 1).equals(","))) {
				aux += frase.substring(i, i + 1);
			}
		}
		
		tam = aux.length();
		
		for(int i=0; i < tam/2; i++) {
			if (!aux.substring(i, i + 1).equals(aux.substring(tam -i -1, tam - i))) {
				return false;
			}
		}
		return true;
	}
}
