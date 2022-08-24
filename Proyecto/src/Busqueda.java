public class Busqueda {
	
	//Busqueda Secuencial
	public int Secuencial(int arreglo[], int elemento) {
		int i;
		boolean encontrado = false;
		
		for(i = 0; i < arreglo.length && encontrado == false; i++) {
			if(elemento == arreglo[i]) {
				encontrado = true;
				return i;
			}
		}
		
		return -1;
	}
	
	//Busqueda Binaria
	public int Binaria(int arreglo[], int elemento) {
		int front, back, centro, valorC;
		
		front = 0;
		back = arreglo.length-1;
		
		while(front <= back) {
			centro = (front + back) / 2;
			valorC = arreglo[centro];
			System.out.println("Comparando a " + elemento + " con " + arreglo[centro]);
			
			if(elemento == valorC) {
				return centro;
			} else if(elemento < valorC) {
				//Desplazarnos a la izquierda
				back = centro - 1;
			} else {
				//Desplazarnos a la derecha
				front = centro + 1;
			}
		}
		return -1;
	}
	
	//Metodo para Imprimir
    public void Imprimir(int datos[]) {
		for(int i = 0; i < datos.length; i++) {
            System.out.print( datos[i]);
            if(i < datos.length-1)
				System.out.print(", ");
			else
				System.out.print("");
        }
	}
}