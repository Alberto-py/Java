public class Metodos_Internos {
	
	//Metodo de Ordenamiento Burbuja
	public void Burbuja(int numeros[]) {
		int i, j, temp;
		for(i = 0; i < numeros.length; i++) {
			for(j = i + 1; j < numeros.length; j++) {
				if(numeros[i] > numeros[j]) {
					temp = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = temp;
				}
			}
		}
	}
	
	//Metodo de Ordenamiento QuickSort
    public void Quicksort(int numeros[], int izq, int der) {
        
            int pivote = numeros[izq];
            
            int a = izq; 
            int b = der; 
            int aux;
           
            while(a < b) {
                while (numeros[a] <= pivote && a < b) 
                	a++;

                while (numeros[b] > pivote) 
                    b--;   

                if (a < b) {                                     
                	aux = numeros[a];                  
                    numeros[a]= numeros[b];
                    numeros[b]=aux;
               }
            }

             numeros[izq] = numeros[b]; 
             numeros[b] = pivote;

             if (izq < b-1)
                Quicksort(numeros,izq,b-1);

             if (b+1 < der)
                Quicksort(numeros,b+1,der);
      }
 
	//Metodo de Ordenamiento ShellSort
    public void Shell(int vector[]) {
		int salto, aux, dat;
		boolean cambio;
		
		for(salto = vector.length / 2; salto != 0; salto /= 2) {
			cambio = true;
			while(cambio) {
				cambio = false;
				for(dat = salto; dat < vector.length; dat++) {
					if(vector[dat - salto] > vector[dat]) {
						aux = vector[dat];
						vector[dat] = vector[dat - salto];
						vector[dat - salto] = aux;
						cambio = true;
					}
				}
			}
		}
	}
    
	//Metodo de Ordenamiento Radix
    public int[] radix(int vector[]) {
		int x, i, j;
		for(x = Integer.SIZE -1; x >= 0; x--) {
			int aux[] = new int[vector.length];
			j = 0;
			for(i = 0; i < vector.length; i++) {
				boolean cambio = vector[i] << x >= 0;
				if(x == 0 ? !cambio:cambio) {
					aux[j] = vector[i];
					j++;
				} else {
					vector[i - j] = vector[i];
				}
			}
			for(i = j; i < aux.length; i++) {
				aux[i] = vector[i - j];
			}
			vector = aux;
		}
		return vector;
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