import java.util.*;
import java.io.*;
public class ColaDoble {
	private List<String> cola = new ArrayList<String>();
	
	public void pushFront(String dato) {
		cola.add(0,dato);
	}
	public void pushBack(String dato) {
		cola.add(dato);
	}
	
	public void popFront() {
		if(!cola.isEmpty()) {
			String remov = cola.remove(0);
			System.out.println("El Primer Dato '" +remov+ "' A Sido Eliminado");
		} else {
			System.out.println("La Cola Esta Vacia");	
		}
	}
	public void popBack() {
		if(!cola.isEmpty()) {
			String remov = cola.remove(cola.size()-1);
			System.out.println("El Ultimo Dato '" +remov+ "' A Sido Eliminado");	
		} else {
			System.out.println("La Cola Esta Vacia");
		}
	}
	
	public void mostrarFront() {
		if(!cola.isEmpty()) {
			String front = cola.get(0);
			System.out.println("El Primer Dato Es: " +front);
		} else {
			System.out.println("La Cola Esta Vacia");
		}
	}
	public void mostrarBack() {
		if(!cola.isEmpty()) {
			String back = cola.get(cola.size()-1);
			System.out.println("El Ultimo Dato Es: " +back);
		} else {
			System.out.println("La Cola Esta Vacia");
		}
	}
	
	public void imprimirFront() {
		if(!cola.isEmpty()) {
			for(int i = 0; i < cola.size(); i++) {
				System.out.println(cola.get(i));
			} 
		} else {
			System.out.println("La Cola Esta Vacia");
		}
	}
	public void imprimirBack() {
		if(!cola.isEmpty()) {
			for(int i = cola.size()-1; i >= 0; i--) {
				System.out.println(cola.get(i));
			}
		} else {
			System.out.println("La Cola Esta Vacia");
		}
	}
	
	public static void main(String [] agrs) {
		ColaDoble Cola = new ColaDoble();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(isr);
		String dato, dat;
		int opc;
		boolean repite = true;
		try {
			
			do {
				System.out.println("\n 1. Agregar Un Dato Por Enfrente\n"
						 + " 2. Agregar Un Dato Por Atras\n"
						 + " 3. Eliminar Un Dato Por Enfrente\n"
						 + " 4. Eliminar Un Dato Por Atras\n"
						 + " 5. Mostrtar El Primer Dato\n"
						 + " 6. Mostrar El Ultimo Dato\n"
						 + " 7. Imprimir Por Enfrente\n"
						 + " 8. Imprimir Por Atras\n"
						 + " 0. Salir");
				System.out.println("Selecciona Una Opcion: ");
				opc = Integer.parseInt(teclado.readLine());
				
				switch(opc) {
				case 1:
					System.out.println("Ingresa El Valor A Guardar: ");
					dato = teclado.readLine();
					Cola.pushFront(dato);
					break;
				case 2:
					System.out.println("Ingresa El Valor A Guardar: ");
					dat = teclado.readLine();
					Cola.pushBack(dat);
					break;
					
				case 3:
					Cola.popFront();
					break;
				case 4:
					Cola.popBack();
					break;
					
				case 5:
					Cola.mostrarFront();
					break;
				case 6:
					Cola.mostrarBack();
					break;
					
				case 7:
					Cola.imprimirFront();
					break;
				case 8:
					Cola.imprimirBack();
					break;
					
				case 0:
					repite = false;
					break;
					
					default:
						System.out.println("Ingresa Una Opcion Valida! ");
				}
			}while(repite);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}