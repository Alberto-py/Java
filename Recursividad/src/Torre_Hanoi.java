import java.util.*;
public class Torre_Hanoi {
	
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		int n = 0;
		
		System.out.println("Ingresa un Numero de Aros: ");
		n = br.nextInt();
		TorreHanoi(n, 1, 2, 3);
		
	}
	
	public static void TorreHanoi(int n, int start, int fin, int inter) {
		if (n == 1) {
			System.out.println("Moviendo de la Torre  "+start+ " a la Torre  " +fin);
		}
		else {
			TorreHanoi(n - 1, start, fin, inter);
			System.out.println("Moviendo de la Torre  "+start+ " a la Torre  " +fin);
			TorreHanoi(n - 1, inter, start, fin);
		}
	}
}