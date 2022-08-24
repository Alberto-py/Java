import java.io.*;

public class Pila {
	String dato;
	Pila saltar;
	
	public Pila(String valor) {
		dato = valor;
		saltar = null;
	}
	
	private Pila UltimoValor;
	int tamano = 0;
	String lista = "";
	
	public Pila() {
		UltimoValor = null;
		tamano = 0;
	}
	
	public boolean PilaVacia() {
		return UltimoValor == null;
	}
	
	public void insertar(String nod) {
		Pila Nodo = new Pila(nod);
		Nodo.saltar = UltimoValor;
		UltimoValor = Nodo;
		tamano++;
	}
	
	public String eliminar() {
		String temp = UltimoValor.dato;
		UltimoValor = UltimoValor.saltar;
		tamano--;
		return temp;
	}
	
	public String MostrarUltimo() {
		return UltimoValor.dato;
	}
	
	public int TamanoP() {
		return tamano;
	}
	
	public void vaciar() {
		while(!PilaVacia()) {
			eliminar();
		}
	}
	
	public void MostrarT() {
		Pila recorrido = UltimoValor;
		
		while(recorrido != null) {
			lista += recorrido.dato + "\n";
			recorrido = recorrido.saltar;
		}
		
		System.out.println(lista);
		lista = "";
	}

	public static void main(String[] args) {
		int opc = 0;
		String nod;
		Pila pila = new Pila();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			
			do {
				
				System.out.println("\n" + " 1. Agrega Un Dato A La Pila ");
				System.out.println(" 2. Elimina Un Dato De La Pila ");
				System.out.println(" 3. Mostrar Todos Los Datos De La Pila ");
				System.out.println(" 4. Mostrar El Ultimo Dato De La Pila ");
				System.out.println(" 5. Tamaño De La Pila ");
				System.out.println(" 6. Vaciar La Pila ");
				System.out.println(" 7. Salir ");
				System.out.println(" Selecciona Una Opcion: " );
				opc = Integer.parseInt(br.readLine());
				
				switch(opc) {
				case 1:
					System.out.println("Ingresa El Dato A Guardar");
					nod = br.readLine();
					pila.insertar(nod);
					break;
				
				case 2:
					if(!pila.PilaVacia()) {
						System.out.println("Se Ha Eliminado Un Nodo con el Dato: " + pila.eliminar());
					}
					
					else {
						System.out.println("No Hay Ningun Dato Que Eliminar");
					}
					break;
					
				case 3:
					pila.MostrarT();
					break;
					
				case 4:
					if(!pila.PilaVacia()) {
						System.out.println("El Ultimo Dato Ingresado Es: " + pila.MostrarUltimo());
					}
					
					else {
						System.out.println("La Pila Esta Vacia");
					}
					break;
					
				case 5:
					System.out.println("La Pila Contiene " + pila.TamanoP() + " Nodos");
					break;
					
				case 6: 
					if(!pila.PilaVacia()) {
						pila.vaciar();
						System.out.println("Se Ha Vaciado La Pila Correctamente");
					}
					
					else {
						System.out.println("La Pila Esta Vacia");
					}
					break;
					
				case 7:
					opc = 9;
					break;
			
				default:
					System.out.println("Ingresa una Opcion Validad.");
					break;
				}
				
			}while(opc < 9);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
