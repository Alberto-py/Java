import java.io.*;
public class Main {
	public static void main(String[] args) {
		Empleado e2;
		Empleado e1 = new Empleado("Pablo", "Gerente", 100.5);
		System.out.println("El Empleado" + e1.getnombre() + "Con Puesto " + e1.getpuesto() + "y Salario " + e1.getsalario() + "Aumento del Salario " + e1.aumentosal(e1.getsalario()));

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String p, n;
			double s;

			System.out.println("Ingresa el nombre del empleado ");
			n = br.readLine();
			System.out.println("Ingresa el Puesto ");
			p = br.readLine();
			System.out.println("Ingresa el Salario ");
			s = Double.parseDouble(br.readLine());

			e2 = new Empleado(n, p, s);
			System.out.println("El Empleado " + e2.getnombre() + "Con Puesto " + e2.getpuesto() + "y Salario " + e2.getsalario() + "Aumento del Salario " + e2.aumentosal(e2.getsalario()));
	 	} catch(Exception e) {
	 		e.printStackTrace();
	 	}
	}
}
