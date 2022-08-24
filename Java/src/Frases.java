import java.util.*;
public class Frases {
	public static void main (String [] args) {
		
		Scanner cadena = new Scanner (System.in);
		String frase = " ";
		System.out.println("Ingresa la Frase que desees");
		frase=cadena.nextLine();
		
		String caracter[] = frase.split(" ");
		
		for(String F:caracter) {
			System.out.println(F);
		}
		
	}

}
