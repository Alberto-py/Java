import java.util.*;

public class Pila {
	int max, tope;
	private String pila[];
	
	public Pila(int t) {
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
		Scanner br = new Scanner(System.in);
		
		System.out.println("Ingresa El Tamaño De La Pila ");
		tam = br.nextInt();
		
		Pila pila = new Pila(tam);
		
		do {
			System.out.println("\n 1. Agrega Un Dato A La Pila ");
			System.out.println(" 2. Elimina Un Dato De La Pila ");
			System.out.println(" 3. Mostrar Un Dato De La Pila ");
			System.out.println(" 4. Buscar Un Dato En La Pila ");
			System.out.println(" 5. Salir ");
			System.out.println(" Selecciona Una Opcion: ");
			opc = br.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("Ingresa El Dato: ");
				Dato = br.toString();
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
				Dato = br.toString();
				pila.buscar(Dato);
				break;
			}
		} while(opc<5);
	}
}
