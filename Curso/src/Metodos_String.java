import java.io.*;

public class Metodos_String {
	public static void main(String [] args)  {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			//Clase 1:
			String nombre;
			
			System.out.println("Ingresa un Nombre ");
			nombre = br.readLine();
			
			System.out.println("\nMi Nombre es: " + nombre);
			System.out.println("Mi Nombre Tiene " + nombre.length() + " Letras");
			System.out.println("La Primera Letra de mi Nombre es " + nombre.charAt(0));
			
			int ultimaLetra;
			
			ultimaLetra = nombre.length();
			
			System.out.println("La Ultima Letra de mi Nombre es " + nombre.charAt(ultimaLetra-1));
			
			//Clase 2: Extraccion de parametros con String
			String frase;
			
			System.out.println("\n\n\nIngresa una Frase: ");
			frase = br.readLine();
			
			//Extraccion con coordenadas de la palabra
			String frase_resumen = frase.substring(5, 9);
			
			System.out.println("Palabras Extraidas " + frase_resumen);
			
			//Clase 3: Comparacion con String
			String alumno1, alumno2;
			
			alumno1 = "Beto";
			alumno2 = "beto";
			System.out.println("\n\n\n");
			System.out.println(alumno1.equals(alumno2));
			
			//ignorando mayusculas y minusculas
			
			System.out.println(alumno1.equalsIgnoreCase(alumno2));
			
			
		} catch (Exception e) {
		}
		
		
	}
}