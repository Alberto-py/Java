import java.io.*;
public class fibonacci {
	
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			int n, i;
			
			do {
				System.out.println("Ingresa un Numero Mayor a 1: ");
				n = Integer.parseInt(br.readLine());
			
			}while(n<2);
			System.out.println("Los Primeros " +n + " Numeros de la Sucesion Fibonacci son: ");
			
			for(i=0; i<n; i++) {
				System.out.println(Fibonacci(i).toString());
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static Integer Fibonacci(int n) {
		if((n == 0)  || (n == 1)) {
			return 1;
		}
		else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}
}