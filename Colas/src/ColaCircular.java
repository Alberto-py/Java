import java.util.*;
public class ColaCircular {
	 int size = 10, front, back;
	 int []vector;
	
	ColaCircular(){
		vector = new int[size];
		front = -1;
		back = front;
	}
	
	public boolean vacia() {
		if(front == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int dat) {
		if((back == size-1 && front == 0) || (back +1 == front)) {
			System.out.println("La Cola Circular Esta Llena\n");
			return;
		}
		if(back == size-1 && front != 0) {
			back=0;
		} else {
			back++;
		}
		vector[back] = dat;
		if(front == -1) {
			front=0;
		}
	}
	
	public void pop() {
		if(!vacia()) {
			System.out.println("El Dato " + vector[front] + " Se A Eliminado Correctamente\n");
			if(front == back) {
				front = -1;
				back = -1;
			}
			if(front == size) {
				front = 0;
			} else {
				front++;
			}
		} else {
			System.out.println("La Cola Circular Esta Vacia\n");
		}
	}
	
	public void mostrar() {
		int dat = 0;
		if(vacia()) {
			System.out.println("La Cola Circular Esta Vacia\n");
		} else {
			dat = front;
			do {
				System.out.println("Cola Circular [" + dat + "] = " + vector[dat]);
				dat++;
				if(dat == size && front > back) 
					dat = 0;
			}while(dat != back + 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opc, dato;
		boolean repite = true;
		ColaCircular cola = new ColaCircular();
		
		do {
			System.out.println("\n 1. Agregar Un Dato\n"
							+  " 2. Elimina Un Dato\n"
							+  " 3. Mostrar Los Datos\n"
							+  " 0. Salir\n");
			System.out.println("Selecciona Una Opcion: ");
			opc = teclado.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("Ingresa El Dato: ");
				dato = teclado.nextInt();
				cola.push(dato);
				break;
				
			case 2:
				cola.pop();
				break;
				
			case 3:
				cola.mostrar();
				break;
				
			case 0:
				repite = false;
				break;
				
				default:
					System.out.println("Selecciona Una Opcion Correcta ");
					break;
			}
		}while(repite);
	}
}