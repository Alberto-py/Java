import java.io.*;
public class ListaCircular {
	private Nodo inicio, fin;
	private int cont;
	
	public static void main(String [] args) {
		ListaCircular lista = new ListaCircular();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(isr);
		int opc, pos;
		String dato, dat, ref;
		boolean repite = true;
		
		try {
			do {
				System.out.println("\t\tOptimizer NET");
				System.out.println("\n 1. Agregar Una Configuracion Al Inicio\n"
						+  " 2. Agregar Una Configuracion Al Final\n"
						+  " 3. Agregar Una Configuracion Por Prioridad\n"         //Por Posicion
						+  " 4. Agregar Por Tipo de Configuracion\n"               //Por Referencia
						+  " 5. Eliminar Una Configuracion de Prioridad\n"         //Por Posicion
						+  " 6. Eliminar Un Tipo De Configuracion\n"               //Por Referencia
						+  " 7. Buscar Una Configuracion Por Prioridad\n"          //Por Posicion
						+  " 8. Buscar Un Tipo de Configuracion\n"                 //Por Referencia
						+  " 9. Buscar La Poscion Por El Tipo De Configuracion\n"  //Posicion por Referencia
						+  " 10. Modificar Por Prioridad\n"                        //Por Posicion
						+  " 11. Modificar Por Tipo De Configuracion\n"            //Por Referencia
						+  " 12. Enlistar Configuraciones de Internet\n"
						+  " 0. Salir\n");
				System.out.println("Selecciona Una Opcion: ");
				opc = Integer.parseInt(teclado.readLine());
				
				switch(opc) {
				case 1:
					System.out.println("Ingresa El Nombre De La Configuracion: ");
					dato = teclado.readLine();
					lista.pushInicio(dato);
					break;
				case 2:
					System.out.println("Ingresa El Nombre De La Configuracion: ");
					dato = teclado.readLine();
					lista.pushFinal(dato);
					break;
				case 3:
					System.out.println("Ingresa La Prioridad De La Configuracion: ");
					pos = Integer.parseInt(teclado.readLine());
					System.out.println("Ingresa El Nombre De La Configuracion: ");
					dato = teclado.readLine();
					lista.pushPosicion(pos, dato);
					break;
				case 4:
					System.out.println("Ingresa El Tipo De Configuracion: ");
					ref = teclado.readLine();
					System.out.println("Ingresa El Nombre De La Configuracion: ");
					dato = teclado.readLine();
					lista.pushReferencia(ref, dato);
					break;
					
				case 5:
					System.out.println("Ingresa La Prioridad De La Configuracion: ");
					pos = Integer.parseInt(teclado.readLine());
					if(pos == -1) {
						System.out.println("La Prioridad De La Configuracion No Fue Encontrada");
					} else {
						System.out.println("La Configuracion A Sido Eliminada Correctamente");
						lista.popPosicion(pos);
					}
					break;
				case 6:
					System.out.println("Ingresa El Tipo De Configuracion: ");
					dat = teclado.readLine();
					if(dat == null) {
						System.out.println("El Tipo De Configuracion No Se Encuentra");
					} else {
						System.out.println("La Configuracion A Sido Eliminada Correctamente");
						lista.popReferencia(dat);
					}
					break;
					
				case 7:
					System.out.println("Ingresa La Prioridad De La Configuracion: ");
					pos = Integer.parseInt(teclado.readLine());
					System.out.println("La Prioridad " + lista.getPosicion(pos) +" Si Se Encuentra En Las Configuraciones");
					break;
				case 8:
					System.out.println("Ingresa El Tipo De Configuracion: ");
					ref = teclado.readLine();
					if(lista.buscar(ref)) {
						System.out.println("La Configuracion " + ref + " Si Se Encontro");
					} else {
						System.out.println("La Configuracion " + ref + " No Esta Incluida");
					}
					break;
				case 9:
					if(!lista.vacia()) {
						System.out.println("Ingresa El Tipo De Configuracion Para Buscar Su Prioridad: ");
						ref = teclado.readLine();
						if(lista.Referencia(ref) == -1) {
							System.out.println("La Configuracion " + ref + " No Esta Incluida");
						} else {
							System.out.println("La Configuracion " + ref + " Tiene Prioridad De: " + lista.Referencia(ref));
						}
					} else {
						System.out.println("No Hay Configuraciones");
					}
					break;
					
				case 10:
					System.out.println("Ingresa La Prioridad Que Tiene La Configuracion: ");
					pos = Integer.parseInt(teclado.readLine());
					System.out.println("Ingresa El Nombre de La Nueva Configuracion: ");
					dato = teclado.readLine();
					lista.modificarPosicion(pos, dato);
					break;
				case 11:
					System.out.println("Ingresa El Nombre De La Configuracion: ");
					ref = teclado.readLine();
					System.out.println("Ingresa El Nombre de La Nueva Configuracion: ");
					dato = teclado.readLine();
					lista.modificarReferencia(ref, dato);
					break;
					
				case 12:
					lista.mostrar();
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
	
	class Nodo{
		public Nodo sig;
		private String dato;
		
		public void Nodo() {
			this.dato = "";
			this.sig = null;
		}
		
		public Nodo getSiguiente() {
			return sig;
		}
		public void setSiguiente(Nodo sig) {
			this.sig = sig;
		}
		
		public String getDato() {
			return dato;
		}
		public void setDato(String dato) {
			this.dato = dato;
		}
	}
	
	public void lista() {
		inicio = null;
		fin = null;
		cont = 0;
	}
	
	public int getContador() {
		return cont;
	}
	
	public boolean vacia() {
		return inicio == null;
	}
	
	public void pushInicio(String dato) {
		Nodo aux = new Nodo();
		aux.setDato(dato);
		
		if(vacia()) {
			inicio = aux;
			fin = aux;
			fin.setSiguiente(inicio);
		} else {
			aux.setSiguiente(inicio);
			inicio = aux;
			fin.setSiguiente(inicio);
		}
		cont++;
	}
	public void pushFinal(String dato) {
		Nodo aux = new Nodo();
		aux.setDato(dato);
		
		if(vacia()) {
			inicio = aux;
			fin = aux;
			fin.setSiguiente(inicio);
		} else {
			fin.setSiguiente(aux);;
			aux.setSiguiente(inicio);
			fin = aux;
		}
		cont++;
	}
	public void pushPosicion(int pos, String dato) {
		if(pos >= 0 && pos<=cont) {
			Nodo aux = new Nodo();
			aux.setDato(dato);
			if(pos == 0) {
				aux.setSiguiente(inicio);
				inicio = aux;
				fin.setSiguiente(inicio);
			} else {
				if(pos == cont) {
					fin.setSiguiente(aux);
					aux.setSiguiente(inicio);
					fin = aux;
				} else {
					Nodo temp = inicio;
					for(int i = 0; i < (pos-1); i++) {
						temp = temp.getSiguiente();
					}
					Nodo siguiente = temp.getSiguiente();
					temp.setSiguiente(aux);
					aux.setSiguiente(siguiente);
				}
			}
			cont++;
		}
	}
	public void pushReferencia(String referencia, String dato) {
		Nodo aux = new Nodo();
		aux.setDato(dato);
		if(!vacia()) {
			if(buscar(referencia)) {
				Nodo temp = inicio;
				while(!temp.getDato().equals(referencia)) {
					temp = temp.getSiguiente();
				}
				if(temp == fin) {
					temp.setSiguiente(aux);
					aux.setSiguiente(inicio);
					fin = aux;
				} else {
					Nodo next = temp.getSiguiente();
					temp.setSiguiente(aux);
					aux.setSiguiente(next);
				}
				cont++;
			}
		}
	}
	
	//Busqueda Por Posicion
		public String getPosicion(int pos) throws Exception{
			if(pos >= 0 && pos <= cont) {
				if(pos == 0) {
					return inicio.getDato();
				} else {
					Nodo aux = inicio;
					for(int i = 0; i < pos; i++) {
						aux = aux.getSiguiente();
					}
					return aux.getDato();
				}
			} else {
				throw new Exception("Prioridad Inexistente En Las Configuraciones");
			}
		}
	//Busqueda Por Referencia
	public boolean buscar(String referencia) {
		Nodo aux = inicio;
		boolean encontrado = false;
		do {
			if(referencia.equals(aux.getDato())) {
				encontrado = true;
			} else {
				aux = aux.getSiguiente();
			}
		}while(aux != inicio && encontrado != true);
		return encontrado;
	}
	//Busqueda De Posicion Por Referencia
	public int Referencia(String ref) throws Exception{
		if(buscar(ref)) {
			Nodo aux = inicio;
			int acum = 0;
			while(!aux.getDato().equals(ref)) {
				acum++;
				aux = aux.getSiguiente();
			}
			return acum;
		} else {
			throw new Exception("Nombre Inexistente En Las Configuraciones");
		}
	}
	
	public void modificarPosicion(int pos, String dato) {
		if(pos >= 0 && pos < cont) {
			if(pos == 0) {
				inicio.setDato(dato);
			} else {
				Nodo aux = inicio;
				for(int i = 0; i < pos; i++) {
					aux = aux.getSiguiente();
				}
				aux.setDato(dato);
			}
		}
	}
	public void modificarReferencia(String referencia, String dato) {
		if(buscar(referencia)) {
			Nodo aux = inicio;
			while(!aux.getDato().equals(referencia)) {
				aux = aux.getSiguiente();
			}
			aux.setDato(dato);
		}
	}
	
	public void pop() {
		inicio = null;
		fin = null;
		cont = 0;
	}
	public void popPosicion(int pos) {
		if(pos >= 0 && pos < cont) {
			if(pos == 0) {
				inicio = inicio.getSiguiente();
				fin.setSiguiente(inicio);
			} else {
				Nodo aux = inicio;
				for(int i = 0; i < (pos-1); i++) {
					aux = aux.getSiguiente();
				}
				if(aux.getSiguiente() == inicio) {
					aux.setSiguiente(inicio);
					fin = aux;
				} else {
					Nodo temp = aux.getSiguiente();
					aux.setSiguiente(temp.getSiguiente());
				}
			}
			cont--;
		}
	}
	public void popReferencia(String referencia) {
		if(buscar(referencia)) {
			if(inicio.getDato().equals(referencia)) {
				inicio = inicio.getSiguiente();
				fin.setSiguiente(inicio);
			} else {
				Nodo aux = inicio;
				while(!aux.getSiguiente().getDato().equals(referencia)) {
					aux = aux.getSiguiente();
				}
				if(aux.getSiguiente() == fin) {
					aux.setSiguiente(inicio);
					fin = aux;
				} else{
					Nodo temp = aux.getSiguiente();
					aux.setSiguiente(temp.getSiguiente());
				}
			}
			cont--;
		}
	}
	
	public void mostrar() {
		if(!vacia()) {
			Nodo aux = inicio;
			int v = 0;
			do {
				System.out.print("—> " + v + ".[ " + aux.getDato() + " ]" + " \n");
				v++;
				aux = aux.getSiguiente();
			} while(aux != inicio);
		}
	}
}