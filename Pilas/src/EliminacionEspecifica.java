import java.util.*;
import java.io.*;
public class EliminacionEspecifica {
	
	public static void main(String []args) {
		int opc;
		String dato, dat;
		boolean repite = true;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Stack<String> Prin = new Stack<String>();
		
		try {
			do {
				System.out.println("1. Agregar Un Dato ");
				System.out.println("2. Eliminar Un Dato ");
				System.out.println("3. Mostrar Todos Los Datos ");
				System.out.println("0. Salir ");
				opc = Integer.parseInt(br.readLine());
				
				switch(opc) {
				case 1:
					System.out.println("Ingresa El Dato A Guardar");
					dato = br.readLine();
					Prin.push(dato);
					break;
					
				case 2:
					System.out.println("Ingresa El Dato Que Quieres Eliminar ");
					dat = br.readLine();
					if(!Prin.empty()) {
						if(Prin.search(dat) == -1) {
							System.out.println("El Dato No Existe ");
						}
						else {
							Prin.remove(dat);
							System.out.println("El Dato Se A Borrado Correctamente ");
						}
					}
					else {
						System.out.println("La Pila Se Encuentra Vacia ");
					}
					break;
					
				case 3:
						System.out.println(Prin);
					break;
					
				case 0:
					repite = false;
					break;
				}
			}while(repite);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}