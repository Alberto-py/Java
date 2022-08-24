import java.io.*;
public class ListasDoble {
	
	public static void main(String [] args) {
		ListaD lista = new ListaD();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(isr);
		int opc, posi;
		String dato, dat, buscando;
		boolean repite = true;
		
		try {
			do {
				System.out.println("\n 1. Agregar Un Dato Al Inicio\n"
						+  " 2. Agregar Un Dato Al Final\n"
						+  " 3. Eliminar El Inicio\n"
						+  " 4. Eliminar El Final\n"
						+  " 5. Eliminar Un Dato Por Posicion\n"
						+  " 6. Buscar La Posicion de Un Dato\n"
						+  " 7. Buscar Un Dato\n"
						+  " 8. Actualizar Un Dato\n"
						+  " 9. Imprimir Por Inicio\n"
						+  " 10. Imprimir Por Final\n"
						+  " 0. Salir\n");
				System.out.println("Selecciona Una Opcion: ");
				opc = Integer.parseInt(teclado.readLine());
				
				switch(opc) {
				case 1:
					System.out.println("Ingresa El Dato Que Desea Guardar: ");
					dato = teclado.readLine();
					lista.pushInicio(dato);
					break;
				case 2:
					System.out.println("Ingresa El Dato Que Desea Guardar: ");
					dato = teclado.readLine();
					lista.pushFinal(dato);
					break;
					
				case 3:
					System.out.println("Se Elimino El Primer Dato ");
					lista.popInicio();
					break;
				case 4:
					System.out.println("Se Elimino El Ultimo Dato ");
					lista.popFinal();
					break;
				case 5:
					System.out.println("Ingresa El Dato Que Desea Eliminar: ");
					dat = teclado.readLine();
					lista.popPosicion(dat);
					break;
					
				case 6:
					if(!lista.vacia()) {
						System.out.println("Ingresa El Dato Para Buscar Su Posicion: ");	
						dato = teclado.readLine();
						if(lista.buscarPosicion(dato) == -1) {
							System.out.println("El Dato " + dato + " No Se Encuentra");
						} else {
							System.out.println("El Dato " + dato + " Se Encuentra En La Posicion " + lista.buscarPosicion(dato));
						}
					} else {
						System.out.println("La Lista Esta Vacia");
					}
					break;
				case 7:
					System.out.println("Ingresa El Dato Que Desea Buscar: ");
					buscando = teclado.readLine();
					
					if(lista.buscar(buscando)) {
						System.out.println("El Dato Se Encuentra ");
					} else {
						System.out.println("El Dato No Se Encuentra ");
					}
					break;
					
				case 8:
					System.out.println("Ingresa La Posicion En La Se Encuentra El Dato: ");
					posi = Integer.parseInt(teclado.readLine());
					System.out.println("Ingresa El Dato Que Desea Actualizar: ");
					dato = teclado.readLine();
					lista.actualizar(posi, dato);
					break;
					
				case 9:
					if(!lista.vacia()) {
						lista.imprimirInicio();
					} else {
						System.out.println("La Lista Esta Vacia");
					}
					break;
				case 10:
					if(!lista.vacia()) {
						lista.imprimirFinal();
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

class NodoD{
	public NodoD sig, anterior;
	private String dato;
	
	public NodoD(String dat, NodoD a, NodoD s) {
		sig = s;
		anterior = a;
		dato = dat;
	}
	
	public NodoD getSiguiente() {
		return sig;
	}
	public void setSiguiente(NodoD sig) {
		this.sig = sig;
	}
	
	public NodoD getAnterior() {
		return  anterior;
	}
	public void setAnterior(NodoD anterior) {
		this.anterior = anterior;
	}
	
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
}

class ListaD{
	private NodoD inicio, fin;
	private int cont;
	
	public ListaD() {
		inicio = fin = null;
		cont = 0;
	}
	public int getcont() {
		return cont;
	}
	
	public boolean vacia() {
		return inicio == null;
	}
	
	public void pushInicio(String dato) {
		if(vacia()) {
			inicio = new NodoD(dato, null, null);
			fin = inicio;
		} else {
			NodoD aux = new NodoD(dato, null, inicio);
			inicio.setAnterior(aux);
			inicio = aux;
			cont++;
		}
	}
	public void pushFinal(String dato) {
		if(vacia()) {
			fin = new NodoD(dato, null, null);
			inicio = fin;
		} else {
			NodoD aux = new NodoD(dato, fin, null);
			fin.setSiguiente(aux);
			fin = aux;
			cont++;
		}
	}
	
	public void popInicio() {
		if(vacia()) {
			System.out.println("La Lista Esta Vacia");
		} else {
			NodoD aux = inicio.sig;
			if(aux == null) {
				inicio = null;
				fin = null;
			} else {
				aux.anterior = null;
				inicio = aux;
			}
			cont--;
		}
	}
	public void popFinal() {
		if(vacia()) {
			System.out.println("La Lista Esta Vacia");
		} else {
			NodoD aux = fin.anterior;
			if(aux == null) {
				inicio = null;
				fin = null;
			} else {
				aux.sig = null;
				fin = aux;
			}
			cont--;
		}
	}
	public void popPosicion(String dat) {
		if(vacia()) {
			System.out.println("La Lista Esta Vacia");
		} else 
			if(inicio.getDato() == dat) {
				inicio = inicio.getSiguiente();
				cont--;
			} else {
				NodoD aux = inicio;
				while(aux.getSiguiente() != null && !aux.getSiguiente().getDato().equals(dat))
					aux = aux.getSiguiente();
					if(aux.getSiguiente() == null)
						System.out.println("El Elemento " +dat+ " No Se Encuentra En La Lista");
					else {
						aux.setSiguiente(aux.getSiguiente().getSiguiente());
						cont--;
					}
				System.out.println("El Dato Se Elimino Correctamente");
			}
	}
	
	public void imprimirInicio() {
		NodoD aux = inicio;
		while(aux != null) {
			System.out.println(aux.getDato());
			aux = aux.getSiguiente();
		}
	}
	public void imprimirFinal() {
		NodoD aux = fin;
		while(aux != null) {
			System.out.println(aux.getDato());
			aux = aux.getAnterior();
		}
	}
	
	public int buscarPosicion(String dat) {
		NodoD aux = inicio;
		for(int i = 0; aux != null; i++) {
			if(aux.getDato().equals(dat)) {
				return i + 1;
			} else {
				aux = aux.getSiguiente();
			}
		}
		return -1;
	}
	public boolean buscar(String dat) {
		NodoD aux = inicio;
		boolean yes = false;
		while(yes != true && aux != null) {
			if(dat.equals(aux.getDato())) {
				yes = true;
			} else {
				aux = aux.getSiguiente();
			}
			if(yes == true) break;
		}
		return yes;
	}
	
	public void actualizar(int pos, String dat) {
		if(!vacia()) {
			try {
				NodoD aux = inicio;
				for(int i = 0; i < (pos -1); i++) {
					aux = aux.getSiguiente();
				}
				aux.setDato(dat);
			}catch(Exception e) {
				System.out.println("Limite de la Lista Superado");
			}
		}
	}
}