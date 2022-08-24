import java.util.*;
public class DatosRepetidos {
	Scanner teclado = new Scanner(System.in);
	int Pila[];
	int contador[] = new int[10];
	int inicio, Nmax;
	
	public DatosRepetidos() {
		this.inicio = 0;
		this.Nmax = 10;
		this.Pila = new int[this.Nmax + 1];
	}
	
	public DatosRepetidos(int max) {
		this.inicio = 0;
		this.Nmax = 10;
		this.Pila = new int[this.Nmax + 1];
	}
	
	public int getInicio() {
		return inicio;
	}
	
	public void Vaciar() {
		this.inicio = 0;
	}
	
	public boolean PilaLlena() {
		if(this.Nmax == this.inicio) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean PilaVacia() {
		if(this.inicio == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push() {
		if(this.PilaLlena()) {
			System.out.println("La Pila Esta LLena ");
		}
		else {
			int num;
			System.out.println("Ingresa El Valor A Guardar ");
			num = teclado.nextInt();
			this.inicio++;
			this.Pila[this.inicio] = num;
		}
	}
	
	public void pop() {
		if(this.PilaVacia()) {
			System.out.println("La Pila Esta Vacia ");
		}
		else {
			int num = this.Pila[this.inicio];
			this.inicio--;
			System.out.println("El Valor Se Ha Eliminado Correcramente ");
		}
	}
	
	public void mostrar() {
		if(this.PilaVacia()) {
			System.out.println("La Pila Esta Vacia ");
		}
		else {
			for(int i = 1; i <= this.inicio; i++) {
				System.out.println(this.Pila[i] + "\n");
			}
		}
	}
	
	public void Repeditos() {
		for(int i = 0; i < Pila.length; i++) {
			contador[Pila[i]] +=1;
		}
		for (int j = 1; j < contador.length; j++) {
			System.out.println("El Dato: " + j + " Se Reptie: " + contador[j] + " Veces\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		DatosRepetidos pila = new DatosRepetidos(5);
		int opc;
		boolean repite = true;
		
		do {
			System.out.println(" 1. Agregar Un Dato\n "
					 + "2. Elimina Un Dato\n "
					 + "3. Mostrar Todos Los Datos\n "
					 + "4. Vaciar La Pila\n "
					 + "5. Datos Repetidos\n "
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
				pila.Vaciar();
				break;
				
			case 5:
				pila.Repeditos();
				break;
				
			case 0 :
				repite = false;
				break;
			}
			
		}while(repite);
	}
}