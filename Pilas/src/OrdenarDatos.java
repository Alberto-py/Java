import java.util.*;
import java.io.*;
public class OrdenarDatos {
	public static void main(String[] args) {
		Stack <String> pila = new Stack <String> ();
		int [] vec = new int [9];
		int c = 0, aux;
		boolean band = false;
		
		pila.push(Integer.toString(8));
		pila.push(Integer.toString(2));
		pila.push(Integer.toString(3));
		pila.push(Integer.toString(9));
		pila.push(Integer.toString(6));
		pila.push(Integer.toString(1));
		pila.push(Integer.toString(4));
		pila.push(Integer.toString(7));
		pila.push(Integer.toString(5));
		
		while(!pila.empty()) {
			vec[c] = Integer.parseInt(pila.pop());
			c = c +1;
		}
		while(!band) {
			band = true;
			for(int i = 0; !pila.empty(); i++) {
				if(vec[i] > vec[i - 1]) {
					aux = vec[i];
					vec[i] = vec[i - 1];
					vec[i + 1] = aux;
					band = false;
				}
			}
		}
		
		for(int i = 0; i < 9; i++)
			pila.push(Integer.toString(vec[i]));
		System.out.println("Pila Ordenada " + pila);
	}
}