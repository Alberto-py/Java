import java.util.*;
import java.io.*;
public class OrdenarDPila {
	public static void main(String []args) {
		int opc, aux, pos = 1;
		String dato;
		boolean repite = true, orden = false;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Stack<String> pila = new Stack<String>();
		int [] vector = new int [10];
		
		try {
			do {
				System.out.println(" 1. Agregar Un Dato\n "
								 + "2. Mostrar Todos Los Datos\n "
								 + "3. Ordenar Todos Los Datos\n "
								 + "0. Salir\n "
								 + "Selecciona Una Opcion: ");
				opc = Integer.parseInt(br.readLine());
				
				switch(opc) {
				case 1:
					System.out.println("Ingresa El Dato A Guardar");
					dato = br.readLine();
					pila.push(dato);
					break;
					
				case 2:
						System.out.println(pila);
					break;
					
				case 3:
					while(!pila.empty()) {
						vector[pos] = Integer.parseInt(pila.pop());
						pos = pos +1;
					}
					while(!orden) {
						orden = true;
						for(int i = 1; i < pos; i++) {
							if(vector[i - 1] > vector[i]) {
								aux = vector[i];
								vector[i] = vector[i - 1];
								vector[i - 1] = aux;
								orden = false;
							}
						}
					}
					for(int i = 1; i < pos; i++)
						pila.push(Integer.toString(vector[i]));
					System.out.println("Pila Ordenada " + pila);
					break;
					
				case 0:
					repite = false;
					break;
				
				default:
					System.out.println("Ingresa Una Opcion Validad ");
					break;
				}
			}while(repite);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}