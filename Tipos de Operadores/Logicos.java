import java.io.*;

public class Logicos {
	public static void main (String[] args)
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buffer=new BufferedReader(isr);
		try
		{
			int n1=0, n2=0;
			
			System.out.println("\nIngresa un Numero");
			n1 = Integer.parseInt(buffer.readLine());
			System.out.println("Ingresa otro Numero");
			n2 = Integer.parseInt(buffer.readLine());
			
			if (n1>7 && n2>7) {
				System.out.println("\nLos dos numeros son mayores que 7");
			}
			else {
				System.out.println("\nUno o Dos de los numeros no son mayores que 7");
			}
			
			if (n1>7 || n2>7) {
				System.out.println("\nUno o Dos de los numeros son mayores que 7");
			}
			else {
				System.out.println("\nNinguno de los dos numeros son mayores que 7");
			}
			
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}