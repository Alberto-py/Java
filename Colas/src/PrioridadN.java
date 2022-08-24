import java.util.*;
public class PrioridadN {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opc, Dato;
		boolean repite = true;
		
		Comparator<Integer> prioridad = new Comparator<Integer>() {
			public int compare(Integer d1, Integer d2) {
				if(d1 > d2) {
					return -1;
				} 
				else {
					return 1;
				}
			}
		};
		
		PriorityQueue<Integer> Cola = new PriorityQueue<Integer>(prioridad);
		
		do {
			System.out.println(" 1. Agregar un Dato\n"
							 + " 2. Eliminar un Dato\n"
							 + " 3. Mostrar Datos\n"
							 + " 0. Salir\n");
			System.out.println("Selecciona Una Opcion: ");
			opc = teclado.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("Ingresa Un Dato ");
				Dato = teclado.nextInt();
				Cola.add(Dato);
				break;
				
			case 2:
				System.out.println("El Dato: " + Cola.peek() + " Se A Eliminado Correctamente ");
				Cola.remove();
				break;
				
			case 3:
				System.out.println(Cola);
				break;
				
			case 0:
				repite = false;
				break;
				
				default:
					System.out.println("Ingresa Una Opcion Valida ");
					break;
			}
			
		}while(repite);
	}
}