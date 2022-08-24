import java.util.*;
public class Materia {
	public static void main (String [] args) {
		Calificaciones trab, cal;
		String name;
		double T1, T2, T3, T4;
		double U1=0, U2=0, U3=0, U4=0, Promedio=0;
		Scanner br = new Scanner(System.in);
		
		System.out.println("Ingresa tu Nombre");
		name = br.nextLine();
			System.out.println("\tPrimera Unidad");
			System.out.println("Ingresa la Calificacion de la Actividad 1.1");
			T1 = br.nextDouble();
			System.out.println("Ingresa la Calificacion de la Actividad 1.2");
			T2 = br.nextDouble();
			System.out.println("Ingresa la Calificacion de la Actividad 1.3");
			T3 = br.nextDouble();
			System.out.println("Ingresa la Calificacion de la Actividad 1.4");
			T4 = br.nextDouble();
			trab = new Calificaciones(T1, T2, T3,T4);
			U1 = Calificaciones.getU1();
			
			System.out.println("\tSegunda Unidad");
			System.out.println("Ingresa la Calificacion de la Actividad 2.1");
			T1 = br.nextDouble();
			System.out.println("Ingresa la Calificacion de la Actividad 2.2");
			T2 = br.nextDouble();
			System.out.println("Ingresa la Calificacion de la Actividad 2.3");
			T3 = br.nextDouble();
			System.out.println("Ingresa la Calificacion de la Actividad 2.4");
			T4 = br.nextDouble();
			trab = new Calificaciones(T1, T2, T3,T4);
			U2 = Calificaciones.getU2();
			
			System.out.println("\tTercera Unidad");
			System.out.println("Ingresa la Calificacion de la Actividad 3.1");
			T1 = br.nextDouble();
			System.out.println("Ingresa la Calificacion de la Actividad 3.2");
			T2 = br.nextDouble();
			System.out.println("Ingresa la Calificacion de la Actividad 3.3");
			T3 = br.nextDouble();
			System.out.println("Ingresa la Calificacion de la Actividad 3.4");
			T4 = br.nextDouble();
			trab = new Calificaciones(T1, T2, T3,T4);
			U3 = Calificaciones.getU3();
			
			System.out.println("\tCuarta Unidad");
			System.out.println("Ingresa la Calificacion de la Actividad 4.1");
			T1 = br.nextDouble();
			System.out.println("Ingresa la Calificacion de la Actividad 4.2");
			T2 = br.nextDouble();
			System.out.println("Ingresa la Calificacion de la Actividad 4.3");
			T3 = br.nextDouble();
			System.out.println("Ingresa la Calificacion de la Actividad 4.4");
			T4 = br.nextDouble();
			trab = new Calificaciones(T1, T2, T3,T4);
			U4 = Calificaciones.getU4();
			
			Promedio = (U1+U2+U3+U4)/4;
			System.out.println("\n" + name);
			
			cal(U1, U2, U3, U4);
			System.out.println("Calificacion de la Primera Unidad: " + U1);
			System.out.println("Calificacion de la Segunda Unidad: " + U2);
			System.out.println("Calificacion de la Tercer Unidad: " + U3);
			System.out.println("Calificacion de la Cuarta Unidad: " + U4);
			System.out.println("El Promedio General de la Materia es: " + Promedio);
	}
	private static void cal(double u1, double u2, double u3, double u4) {
	}
}