import java.io.*;

public class Unarios {
	public static void main (String[] args)
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buffer=new BufferedReader(isr);
		try
		{
			int n1=0;
			
			System.out.println("Ingresa un Numero");
			n1 = Integer.parseInt(buffer.readLine());
			System.out.println("\nEl valor es positivo:" + (+n1));
			System.out.println("\nEl valor es negativo:" + (-n1));
			System.out.println("\nEl valor incrementado es: " + (++n1));
			System.out.println("\nEl valor disminuido es: " + (--n1));
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
