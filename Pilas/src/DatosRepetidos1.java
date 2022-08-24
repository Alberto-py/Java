import java.util.*;
public class DatosRepetidos1 {
	Scanner teclado = new Scanner(System.in);
	int Pila[] = new int[10];
	int contador[] = new int[10];
	int tope = -1;
	
	public int push() {
		if(tope >= Pila.length) {
			System.out.println("La Pila Esta Llena ");
		}
		else {
			tope++;
			System.out.println("Ingresa El Dato A Guardar ");
			Pila[tope] = teclado.nextInt();
		}
		return tope;
	}
	
	public int pop() {
		if(tope == -1) {
			System.out.println("La Pila Esta Vacia ");
		}
		else {
			System.out.println("El Datos " + Pila[tope] + " Se Elimino Correctamente ");
			Pila[tope] = 0;
		}
		return tope;
	}
	
	public void mostrar() {
		for(int i = 0; i < Pila.length; i++) {
			System.out.println(Pila[i]);
		}
	}
	
	public void repetidos() {
		for(int i = 0; i < Pila.length; i++) {
			contador[Pila[i]] += 1;
		}
		for (int j = 1; j < contador.length; j++) {
			System.out.println("El Dato: " + j + " Se Reptie: " + contador[j] + " Veces\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		DatosRepetidos1 pila = new DatosRepetidos1();
		boolean repite = true;
		int opc;
		
		do {
			System.out.println(" 1. Agregar Un Dato\n "
					 + "2. Elimina Un Dato\n "
					 + "3. Mostrar Todos Los Datos\n "
					 + "4. Datos Repetidos\n "
					 + "0. Salir ");
			System.out.println("Selecciona Una Opcion: ");
			opc = br.nextInt();
			
			switch(opc) {
			case 1:
				pila.push();
				break;
				
			case 2:
				pila.pop();
				break;
				
			case 3:
				pila.mostrar();
				break;
				
			case 4:
				pila.repetidos();
				break;
				
			case 0:
				repite = false;
				break;
			}
			
		}while(repite);
		
	}
	
}
