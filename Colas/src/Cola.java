import java.util.*;
public class Cola {
	class Nodo{
		int info;
		Nodo sig;
	}
	private Nodo raiz, fondo;
	
	Cola(){
		raiz = null;
		fondo = null;
	}
	
	public boolean vacia() {
		if(raiz == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insertar(int dato) {
		Nodo nuevo = new Nodo();
		nuevo.info = dato;
		nuevo.sig = null;
		
		if(vacia()) {
			raiz = nuevo;
			fondo = nuevo;
		}
		else {
			fondo.sig = nuevo;
			fondo = nuevo;
		}
	}
	
	public int eliminar() {
		if(!vacia()) {
			int informacion = raiz.info;
			
			if(raiz == fondo) {
				raiz = null;
				fondo = null;
			}
			else {
				raiz = raiz.sig;
			}
			System.out.println("El Elemento " + informacion + " Se Elimino");
			return informacion;
		}
		else {
			return Integer.MAX_VALUE;
		}
	}
	
	public void imprimir() {
		Nodo pun = raiz;
		if(!vacia()) {
			System.out.println("Todos Los Elementos De La Cola Son: ");
			
			while(pun != null) {
				System.out.println(pun.info);
				pun = pun.sig;
			}
		}
		else {
			System.out.println("La Cola Se Encuentra Vacia ");
		}
	}
	
	public static void main (String [] args) {
		int opc, dato;
		boolean repite = true;
		Scanner br = new Scanner(System.in);
		Cola cola = new Cola();
		
		do {
			System.out.println("\n1. Ingresa Un Dato A La Cola ");
			System.out.println("2. Elimina Un Dato De La Cola ");
			System.out.println("3. Mostrar Los Datos De La Cola ");
			System.out.println("0. Salir ");
			opc = br.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("Ingresa el Dato: ");
				dato = br.nextInt();
				cola.insertar(dato);
				break;
				
			case 2:
				cola.eliminar();
				break;
				
			case 3:
				cola.imprimir();
				break;
				
			case 0:
				repite = false;
				break;
				
			default:
				System.out.println("Ingresa Una Opcion Correcta ");
				break;
			}
			
		}while(repite);
	}
}