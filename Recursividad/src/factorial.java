import  java.util.*;

public class factorial {
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		int n = 0;
		
		System.out.println("Ingresa un Numero Mayor a 2 : ");
		n = br.nextInt();
		System.out.println(CalFactorial(n));
		
	}
	
	public static int CalFactorial(int n)  {
		if(n==1) {
			return 1;
		}
		else {
			return n *= CalFactorial(n-1);
		}
	}
}