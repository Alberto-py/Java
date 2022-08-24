import java.util.*;
import java.io.*;
//Lista Simplemente Enlazada
public class ListaSimEnl {
	public static void main(String [] args) {
		LinkedList lista = new LinkedList();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(isr);
		int opc, pos;
		String dato, dat;
		boolean repite = true;
		
		try {
			do {
				System.out.println("\n 1. Agregar Un Dato Al Inicio\n"
						+  " 2. Agregar Un Dato Al Final\n"
						+  " 3. Agregar Un Dato Por Posicion\n"
						+  " 4. Eliminar Un Dato Del Inicio\n"
						+  " 5. Eliminar Un Dato Del Final\n"
						+  " 6. Eliminar Un Dato Por Posicion\n"
						+  " 7. Buscar Un Dato\n"
						+  " 8. Mostrar Los Datos\n"
						+  " 9. Mostrar El Dato Del Inicio\n"
						+  " 10. Mostrar El Dato Dell Final\n"
						+  " 0. Salir\n");
				System.out.println("Selecciona Una Opcion: ");
				opc = Integer.parseInt(teclado.readLine());
				
				switch(opc) {
				case 1:
					System.out.println("Ingresa El Dato Que Desea Guardar: ");
					dato = teclado.readLine();
					lista.addFirst(dato);
					break;
					
				case 2:
					System.out.println("Ingresa El Dato Que Desea Guardar: ");
					dato = teclado.readLine();
					lista.addLast(dato);
					break;
					
				case 3:
					System.out.println("Ingresa La Posicion En La Que Vas A Guardar El Dato: ");
					pos = Integer.parseInt(teclado.readLine());
					pos = + 1;
					System.out.println("Ingresa El Dato Que Desea Guardar: ");
					dato = teclado.readLine();
					lista.add(pos, dato);
					break;
					
				case 4:
					System.out.println("El Dato Eliminado Es: " + lista.getFirst());
					lista.removeFirst();
					break;
					
				case 5:
					System.out.println("El Dato Eliminado Es: " + lista.getLast());
					lista.removeLast();
					break;
					
				case 6:
					System.out.println("Ingresa El Dato Que Desea Eliminar: ");
					dat = teclado.readLine();
					lista.remove(dat);
					System.out.println("El Dato Se Elimino Correcramente");
					break;
					
				case 7:
					System.out.println("Ingresa El Dato Que Desea Buscar: ");
					dato = teclado.readLine();
					if(lista.contains(dato)) {
						System.out.println("El Dato "+ dato +" Si Se Encuentra En La Lista");
						System.out.println("En La Posicion: " + (lista.indexOf(dato)+1));
					} else {
						System.out.println("El Dato "+ dato +" No Se Encuentra");
					}
					break;
					
				case 8:
					if(lista.isEmpty()) {
						System.out.println("La Lista Esta Vacia");
					} else {
						Iterator it = lista.iterator();
						while(it.hasNext()) {
							System.out.println(it.next().toString());
						}
					}
					break;
					
				case 9:
					if(!lista.isEmpty()) {
						System.out.println("El Primer Dato Es: " + lista.get(0));
					} else {
						System.out.println("La Lista Esta Vacia");
					}
					break;
					
				case 10:
					if(!lista.isEmpty()) {
						System.out.println("El Ultimo Dato Es: " + lista.get(lista.size()-1));
					} else {
						System.out.println("La Lista Esta Vacia");
					}
					break;
					
				case 0:
					repite = false;
					break;
				}
			}while(repite);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}