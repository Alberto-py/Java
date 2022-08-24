import java.io.*;
import java.util.*;

public class HashTable {
	
		public static void main(String[] args) { 
			InputStreamReader isr = new InputStreamReader(System.in);
		    BufferedReader br = new BufferedReader(isr);
		    try {
		   String v;
		   boolean o=true;
		Hashtable<String, String> contenedor=new Hashtable<String, String>();
		contenedor.put("0","Daniela");
		contenedor.put("1", "Oscar");
		contenedor.put("2", "Luis");
		contenedor.put("3", "Maria");
		contenedor.put("4", "Karla");
		contenedor.put("5", "Rene");
		
		do {
			System.out.println("1.- Ingresar nuevo Dato");
			System.out.println("2.- Buscar dato a traves de llave");
			System.out.println("3.- Imprimir todos");
			System.out.println("0.- Salir");
			int op;
			op=Integer.parseInt(br.readLine());
			switch(op) {
			case 1:
				String k,va;
				System.out.println("Ingresa la llave");
				k=br.readLine();
				System.out.println("Ingresa el valor");
				va=br.readLine();
				contenedor.put(k, va);
				break;
			case 2:
				System.out.println("Ingresa la clave del dato a buscar");
				v=br.readLine();
				if(contenedor.get(v)==null) {
					System.out.println("Dato no almacenado");
				}
				else {
					System.out.println(contenedor.get(v));
				}
				break;
			case 3:
				System.out.println("Claves: " +contenedor.toString());
				break;
			case 0:
				o=false;
				break;
			}
		}while(o);
		
		}catch(Exception e)
		    {
	    e.printStackTrace();
	}
		}

	/*public static void main(String [] args) {
		Hashtable<String,String> contenedor = new Hashtable<String,String>();
		
		contenedor.put("101", "Daniela");
		contenedor.put("102", "Oscar");
		contenedor.put("103", "Luis");
		contenedor.put("104", "Maria");
		contenedor.put("105", "Karla");
		contenedor.put("106", "Rene");
		
		
		Enumeration<String> enumeration = contenedor.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(""+"HashTable Valores: " + enumeration.nextElement() );
		}
				
		Enumeration<String> llaves = contenedor.keys();
		while(llaves.hasMoreElements()) {
			System.out.println(""+"HashTable Llaves: " + llaves.nextElement());
		}
		
		System.out.println(contenedor.get("101"));
	}*/
}