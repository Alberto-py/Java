import java.io.*;
public class Estudiante{
	public static void main (String [] args) {
		Persona e2;
		Persona e1 = new Persona("Alberto", "Dubai", "8-07-2018", 'M');
		
		System.out.println("Nombre: " + e1.nombre);
		System.out.println("Lugar de Nacimiento: " + e1.lugarnacimiento);
		System.out.println("Fecha de Nacimiento: " + e1.fechanacimiento);
		System.out.println("Sexo: " + e1.sexo);
		System.out.println("\n");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			String nom, lugarN, fechaN;
			char sex;
			
			System.out.println("Ingresa un Nombre: ");
			nom = br.readLine();
			System.out.println("Ingresa el Lugar de Nacimiento: ");
			lugarN = br.readLine();
			System.out.println("Ingresa la Fecha de Nacimiento: ");
			fechaN = br.readLine();
			System.out.println("Ingresa el Sexo: ");
			sex = br.readLine().charAt(0);
			
			e2 = new Persona (nom, lugarN, fechaN, sex);
			System.out.println("\n");
			System.out.println("Nombre es: " + e2.nombre);
			System.out.println("Lugar de Nacimiento: " + e2.lugarnacimiento);
			System.out.println("Fecha de Nacimiento: " + e2.fechanacimiento);
			System.out.println("Sexo: " + e2.sexo);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
