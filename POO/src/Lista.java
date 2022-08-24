import java.util.*;
import java.io.*;
public class Lista {
	public static void main(String [] args) {
		
	Empleado e3;
	ArrayList <Empleado> Istemp = new ArrayList<Empleado>();
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	try {
		String nom, puesto;
		double sal;
		
		for(int i = 0; i<3; i++) {
			System.out.println("Ingresa un Nombre: ");
			nom = br.readLine();
			System.out.println("Ingresa el Puesto: ");
			puesto = br.readLine();
			System.out.println("Ingresa el Salario Desado: ");
			sal = Double.parseDouble(br.readLine());
			
			e3 = new Empleado(nom, puesto, sal, sal);
			Istemp.add(e3);	
		}
		for(Empleado A : Istemp) {
			System.out.println("\n");
			System.out.println(A.getnombre());
			System.out.println(A.getpuesto());
			System.out.println(A.getsalario());
			System.out.println(A.getaumento());
		}
		
	} catch(Exception e) {
		e.printStackTrace();
	 }
  }
}
