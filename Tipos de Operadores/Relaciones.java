import java.io.*;

public class Relaciones {
	public static void main (String[] args)
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buffer=new BufferedReader(isr);
		try
		{
			int n1=0, n2=0;
			
			System.out.println("\nIngresa un Numero");
			n1 = Integer.parseInt(buffer.readLine());
			System.out.println("Ingresa un Numero");
			n2 = Integer.parseInt(buffer.readLine());
			System.out.println("\nLos valores son iguales: " +(n1 == n2));
			System.out.println("\nLos valores son distintos: " +(n1 != n2));
			System.out.println("\nEl primer valor es menor que el segundo: " +(n1 < n2));
			System.out.println("\nEl primer valor es mayor que el segundo: " +(n1 > n2));
			System.out.println("\nEl primer valor es menor o igual que el segundo: " +(n1 <= n2));
			System.out.println("\nEl primer valor es mayor o igual que el segundo: " +(n1 >= n2));
			
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}