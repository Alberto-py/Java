import java.io.*;

public class Aritmeticos {
	public static void main (String[] args)
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buffer=new BufferedReader(isr);
		try
		{
			float n1=0, n2=0;
			
			System.out.println("Ingresa un Numero");
			n1 = Integer.parseInt(buffer.readLine());
			System.out.println("Ingresa un Numero");
			n2 = Integer.parseInt(buffer.readLine());
			System.out.println("\nLa suma de los dos numeros es: " +(n1+n2));
			System.out.println("\nLa resta de los dos numeros es: " +(n1-n2));
			System.out.println("\nLa multiplicacion de los dos numeros es: " +(n1*n2));
			System.out.println("\nLa division de los dos numeros es: " +(n1/n2));
			System.out.println("\nEl residuo de los dos numeros es: " + (n1%n2));
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
