import java.io.*;
public class Main {
	public static void main(String [] args) {
		Perro pe;
		Gato ga;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			String c1, n1, t1;
			int p1;
			System.out.println("Ingresa el Color que tendra el Perro");
			c1 = br.readLine();
			System.out.println("Ingresa el Nombre que tendra el Perro");
			n1 = br.readLine();
			System.out.println("Ingresa la Estatura del Perro");
			t1 = br.readLine();
			System.out.println("Ingresa el numero de Patas que tendra el Perro");
			p1 = Integer.parseInt(br.readLine());
			System.out.println("\n");
			
			String c2, n2, t2;
			int p2;
			System.out.println("Ingresa el Color que tendra el Gato");
			c2 = br.readLine();
			System.out.println("Ingresa el Nombre que tendra el Gato");
			n2 = br.readLine();
			System.out.println("Ingresa la Estatura del Gato");
			t2 = br.readLine();
			System.out.println("Ingresa el numero de Patas que tendra el Gato");
			p2 = Integer.parseInt(br.readLine());
			System.out.println("\n");
			
			pe = new Perro(c1, n1, t1, p1);
			System.out.println("El Perro se llama: " + pe.getNombre() + " | Es de Color: " + pe.getColor() + " | Es de Estatura: " + pe.getTamano() + " | Tiene: " + pe.getPatas() + " Patas " + " | Y Hace: " + pe.getLadrar());
			System.out.println("\n");
			ga = new Gato(c2, n2, t2, p2);
			System.out.println("El Gato se llama: " + ga.getNombre() + " | Es de Color: " + ga.getColor() + " | Es de Estatura: " + ga.getTamano() + " | Tiene: " + ga.getPatas() + " Patas " + " | Y Hace: " + ga.getMaullar());
			
		}catch(Exception e) {
	 		e.printStackTrace();
	 	}
	}
}
