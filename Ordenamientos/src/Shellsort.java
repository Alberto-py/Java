import java.io.*;
public class Shellsort {
	
	public static void Shell(int vector[]) {
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
	
	public static void Imprimir(int datos[]) {
		for(int i = 0; i < datos.length; i++) {
            System.out.print( datos[i]);
            
            if(i < datos.length-1)
				System.out.print(", ");
			else
				System.out.print("");
        }
	}
	
	public static void main(String[] args) {
        
        //Numeros para ordenar
        int numeros [] = {1,8,0,7,9,5,4,6,2,3};
        
        System.out.println("\t\t\tORDENAMIENTO SHELLSORT");
		
		System.out.print("Arreglo Original: ");
		Imprimir(numeros); System.out.print("\n");
        
        //Llamada Metodo de Ordenamiento Shellsort
        Shell(numeros);
        
        //Metodo para imprimir Vector Ordenado
         System.out.print("\n\nArreglo Final: ");
         Imprimir(numeros);
    }
}