import java.io.*;
//Lista Simple
public class ListaSimple {
	public static void main(String [] args) {
		Lista lista = new Lista();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(isr);
		int opc;
		String dato, buscando;
		boolean repite = true;
		
		try {
		do {
			System.out.println("\n 1. Agregar Un Dato Al Inicio\n"
					+  " 2. Agregar Un Dato Al Final\n"
					+  " 3. Eliminar Un Dato\n"
					+  " 4. Buscar Un Dato\n"
					+  " 5. Mostrar Los Datos\n"
					+  " 0. Salir\n");
			System.out.println("Selecciona Una Opcion: ");
			opc = Integer.parseInt(teclado.readLine());
			
			switch(opc) {
			case 1:
				System.out.println("Ingresa El Dato A Guardar: ");
				dato = teclado.readLine();
				lista.pushInicio(dato);
				break;
			case 2:
				System.out.println("Ingresa El Dato A Guardar: ");
				dato = teclado.readLine();
				lista.pushFinal(dato);
				break;
			case 3:
				String d;
				System.out.println("Ingresa El Dato A Eliminar: ");
				d = teclado.readLine();
				lista.pop(d);
				break;
			case 4:
				System.out.println("Ingresa El Dato Que Desea Buscar: ");
				buscando = teclado.readLine();
				
				if(lista.buscar(buscando)) {
					System.out.println("El Dato Se Encuentra ");
				} else {
					System.out.println("El Dato No Se Encuentra ");
				}
				break;
			case 5:
				lista.mostrar();
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
	
	class Nodo{
		private String dato;
		private Nodo sig;
		
		public Nodo(String d, Nodo s) {
			dato = d;
			sig = s;
		}
		public String getDato() {
			return dato;
		}
		public Nodo getSig() {
			return sig;
		}
		public void setDato(String D) {
			dato = D;
		}
		public void setSig(Nodo S) {
			sig = S;
		}
	}
	
	class Lista{
		private Nodo inicio;
		private int cont;
		
		public Lista() {
			inicio = null;
			cont = 0;
		}
		
		public boolean vacia() {
			return inicio == null;
		}
		
		public void pushInicio(String dat) {
			Nodo aux = new Nodo(dat, inicio);
			inicio = aux;
			cont++;
		}
		
		public void pushFinal(String dat) {
			Nodo aux = new Nodo(dat, null);
			if(inicio == null) {
				inicio = aux;
			} else {
				Nodo actual = inicio;
				while(actual.getSig() != null) {
					actual = actual.getSig();
				}
				actual.setSig(aux);
				cont++;
			}
		}
		
		public void pop(String dat) {
			if(vacia()) 
				System.out.println("La Lista Esta Vacia");
			 else 
					 if(inicio.getDato() == dat) {
							inicio = inicio.getSig();
							cont--;
						} else {
							Nodo aux = inicio;
							while(aux.getSig() != null && !aux.getSig().getDato().equals(dat)) 
								aux = aux.getSig();
								if(aux.getSig() == null)
									System.out.println("El Elemento " +dat+ " No Se Encuentra En La Lista");
								else {
									aux.setSig(aux.getSig().getSig());
									cont--;
								}
							System.out.println("El Dato Se Elimino Correctamente");	
						}
		}
		
		public void mostrar() {
			Nodo aux = inicio;
			while(aux != null) {
				System.out.println(aux.getDato());
				aux = aux.getSig();
			}
		}
		
		public boolean buscar(String d) {
			Nodo aux = inicio;
			boolean yes = false;
			while(yes != true && aux != null) {
				if(d.equals(aux.getDato())) {
					yes = true;
				} else {
					aux = aux.getSig();
				}
				if(yes == true) break;
			}
			return yes;
		}
	}