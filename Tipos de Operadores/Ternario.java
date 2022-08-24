import java.io.*;

public class Ternario {
	public static void main (String[] args)
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buffer=new BufferedReader(isr);
		try
		{
			int n1=0, n2=0;
			String mensaje = "";
			
			System.out.println("\nIngresa un Numero");
			n1 = Integer.parseInt(buffer.readLine());
			System.out.println("Ingresa otro Numero");
			n2 = Integer.parseInt(buffer.readLine());
			
			mensaje = (n1>n2)?"\nEs mayor":"No es mayor";
			System.out.println(mensaje);
			
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
