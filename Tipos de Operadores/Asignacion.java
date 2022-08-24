import java.io.*;

public class Asignacion {
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
			System.out.println("\nLa asignacion de igualdad es: " +(n1 == n2));
			System.out.println("\nLa suma de asignacion es: " +(n1 += n2));
			System.out.println("\nLa resta de asignacion es: " +(n1 -= n2));
			System.out.println("\nLa multiplicacion de asignacion es: " +(n1 *= n2));
			System.out.println("\nLa division de asignacion es: " +(n1 /= n2));
			System.out.println("\nEl residuo de asignacion es: " +(n1 %= n2));
			
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}