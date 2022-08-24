import java.util.*;
import java.io.*;
public class PrioridadL {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(isr);
		int opc;  
		String dato, dat;
		boolean repite = true;
		
		try {
			Comparator<String> prioridad = new Comparator<String>() {
				public int compare(String d1, String d2) {
					if(d1.length() < d2.length()) {
						return -1;
					} else {
						return 1;
					}
				}
			};
			
			Queue<String> Cola = new PriorityQueue<String>(prioridad);
			
			do {
				System.out.println("\n 1. Agregar un Dato\n"
								 + " 2. Eliminar un Dato\n"
								 + " 3. Mostrar Datos\n"
								 + " 0. Salir\n");
				System.out.println("Selecciona Una Opcion: ");
				opc = Integer.parseInt(teclado.readLine());
				
				switch(opc) {
				case 1:
					System.out.println("Ingresa El Dato A Guardar ");
					dato = teclado.readLine();
					Cola.add(dato);
					break;
					
				case 2:
					System.out.println("Ingresa El Dato Que Quieres Eliminar ");
					dat = teclado.readLine();
					
					Cola.remove(dat);
					System.out.println("El Dato Se A Borrado Correctamente ");
					break;
					
				case 3:
					while(!Cola.isEmpty()) {
						System.out.println(Cola.poll());
					}
					break;
					
				case 0:
					repite = false;
					break;
					
					default:
						System.out.println("Ingresa Una Opcion Valida ");
						break;
				}
				
			}while(repite);
		}catch(Exception e) {
		e.printStackTrace();
		}
	}
}