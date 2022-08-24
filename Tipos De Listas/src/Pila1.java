import java.io.*;

public class Pila1 {
	int max, tope;
	private String pila[];
	
	public Pila1(int t) {
		max = t;
		pila = new String [max];
		tope = 0;
	}
	
	private void push(String dato) {
		if(tope<max) {
			pila[tope]=dato;
			tope++;
			System.out.println("El Dato se Ingreso Correctamente");
		}
		
		else {
			System.out.println("La Pila Esta Llena");
		}
	}
	
	private void pop() {
		if(tope>0) {
			tope--;
			System.out.println("El Elemento se Elimino Correctamente");
		}
		
		else {
			System.out.println("La Pila Se Encuentra Vacia");
		}
		
	}
		
	private boolean vacia() {
		if(pila == null) {
			return true;
		}
			
		else {
			return false;
		}
	}
		
		private void mostrar() {
			if(!vacia()) {
				for(int a = (tope-1); a >= 0; a--) {
					System.out.println(pila[a]);
				}
			}
			
			else {
				System.out.println("La Pila Se Encuentra Vacia");
			}
		}
		
		private void buscar(String dato) {
			int pos=0;
			
			if(!vacia()) {
				for(int a = (tope-1); a >= 0; a--) {
					if(pila[a].contentEquals(dato)) {
						pos = a + 1;
						System.out.println("El Elemento Se Encuentra En La Posicion " + pos + " De La Pila");
					}
				}
			}
			
			else {
				System.out.println("La Pila Se Encuentra Vacia");
			}
		}
	
	public static void main(String[] args) {
		int tam, opc;
		String Dato;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
		
			System.out.println("Ingresa El Tamaño De La Pila ");
			tam = Integer.parseInt(br.readLine());
			
			Pila1 pila = new Pila1(tam);
		
			do {
				System.out.println(" 1. Agrega Un Dato A La Pila ");
				System.out.println(" 2. Elimina Un Dato De La Pila ");
				System.out.println(" 3. Mostrar Un Dato De La Pila ");
				System.out.println(" 4. Buscar Un Dato A La Pila ");
				System.out.println(" 5. Salir ");
				System.out.println(" Selecciona Una Opcion: ");
				opc = Integer.parseInt(br.readLine());
			
				switch(opc) {
				case 1:
					System.out.println("Ingresa El Dato: ");
					Dato = br.readLine();
					pila.push(Dato);
					break;
				
				case 2:
					pila.pop();
					break;
				
				case 3: 
					pila.mostrar();
					break;
				
				case 4:
					System.out.println("Ingresa El Dato A Buscar ");
					Dato = br.readLine();
					pila.buscar(Dato);
					break;
				}
			} while(opc<5);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
