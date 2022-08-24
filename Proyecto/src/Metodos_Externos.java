public class Metodos_Externos {
	
	//Metodo de Ordenamiento por Intercalacion
	public int[] intercalacion(int arregloA [], int arregloB []) {
		int i, j, k;
		int arregloC [] = new int [arregloA.length + arregloB.length];
		
		for(i=j=k=0; i<arregloA.length && j<arregloB.length; k++) {
			if(arregloA[i] < arregloB[j]) {
				arregloC[k] = arregloA[i];
				i++;
			} else {
				arregloC[k] = arregloB[j];
				j++;
			}
		}
		for(; i<arregloA.length; i++, k++) {
			arregloC[k] = arregloA[i];
		}
		for(; j<arregloB.length; j++, k++) {
			arregloC[k] = arregloB[j];
		}
		return arregloC;
	}
	
	//Metodo de Ordenamiento de Mezcla Directa
	public int [] MezclaDirecta(int arr[]) {
		int i,j,k;
		if (arr.length>1) {
			int nElIz=arr.length/2;
			int nElDe=arr.length-nElIz;
			int arrIzq[]=new int[nElIz];
			int arrDer[]=new int [nElDe];

			//pasar elementos a la izquierda
			for(i=0 ;i<nElIz; i++) {
				arrIzq[i] = arr[i];
			}
				
			//pasar elementos a la derecha
			for(i=nElIz; i<nElIz+nElDe; i++) {
				arrDer[i-nElIz]=arr[i];
			}
	
			//Recursividad
			arrIzq = MezclaDirecta(arrIzq);
			arrDer = MezclaDirecta(arrDer);
			i = 0;
			j = 0;
			k = 0;
			
			while(arrIzq.length != j && arrDer.length !=k) {
				if(arrIzq[j] < arrDer[k]) {
					arr[i] = arrIzq[j];
					i++;
					j++;
					} else {
						arr[i] = arrDer[k];
						i++;
						k++;
					}
				}
				
			//arreglo final
			while(arrIzq.length != j) {
				arr[i] = arrIzq[j];
				i++;
				j++;
			}
				
			while(arrDer.length != k) {
				arr[i] = arrDer[k];
				i++;
				k++;
			}	
		}
		return arr;
	}

	//Metodo de Ordenamiento de Mezcla Natural
	public void MezclaNatural(int arr[]) {
		int izq = 0,izq2 = 0, der = arr.length-1, der2 = der;
		boolean ord = false;
		
		do {
			ord = true;
			izq = 0;
				
			while(izq<der) {
				izq2=izq;
				while(izq2<der && arr[izq2] <= arr[izq2+1]) {
					izq2++;	
				}	
				der2 = izq2+1;
	
				while(der2 == der-1 || der2<der && arr[der2] <= arr[der2+1]) {
					der2++;	
				}
				
				if(der2 <= der) {
					mezclaD2(arr);
					ord = false;
				}
				izq = izq2;
			}
		}while(!ord);
	
	}
		
	public void mezclaD2(int arr[]) {
		int i,j,k;
		if (arr.length > 1) {
			int nElIz = arr.length/2;
			int nElDe = arr.length-nElIz;
			int arrIzq[] = new int[nElIz];
			int arrDer[] = new int [nElDe];
	
			//pasar elementos a la izquierda
			for(i=0; i<nElIz; i++) {
				arrIzq[i] = arr[i];
			}
				
			//pasar elementos a la derecha
			for(i=nElIz; i<nElIz + nElDe; i++) {
				arrDer[i-nElIz] = arr[i];
			}

			//Recursividad
			 mezclaD2(arrIzq);
			 mezclaD2(arrDer);
			i = 0;
			j = 0;
			k = 0;
		
			while(arrIzq.length != j && arrDer.length != k) {
				if(arrIzq[j] < arrDer[k]) {
					arr[i] = arrIzq[j];
					i++;
					j++;
				} else {
					arr[i] = arrDer[k];
					i++;
					k++;
				}
			}
				
			//arreglo final
			while(arrIzq.length != j) {
				arr[i] = arrIzq[j];
				i++;
				j++;	
			}
				
			while(arrDer.length != k) {
				arr[i] = arrDer[k];
				i++;
				k++;
			}	
		}	
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