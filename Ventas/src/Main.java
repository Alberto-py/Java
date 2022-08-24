import java.io.*;
public class Main {
	public static void main(String [] args) {
		Productos venta;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			double m, u, n, f, k;
			int opc;
			venta = new Productos(m = 2.98, u = 4.50, n = 9.98, f = 4.50, k = 6.87);
			System.out.println("\n\t1-Mananas");
			System.out.println("\t2-Uvas");
			System.out.println("\t3-Naranjas");
			System.out.println("\t4-Fresas");
			System.out.println("\t5-Kiwis");
			System.out.println("\nIngrese el numero dependiendo lo que quiera comprar");
			opc = Integer.parseInt(br.readLine());
			
			switch(opc) {
			case 1:
				System.out.println("Ingresa la cantidad de manzanas deseadas");
				m = Double.parseDouble(br.readLine());
				System.out.println("El Precio Total Es: " + venta.getmanzana1()*m);
				break;
			case 2:
				System.out.println("Ingresa la cantidad de uvas deseadas");
				u = Double.parseDouble(br.readLine());
				System.out.println("El Precio Total Es: " + venta.getuva2()*u);
				break;
			case 3:
				System.out.println("Ingresa la cantidad de naranjas deseadas");
				n = Double.parseDouble(br.readLine());
				System.out.println("El Precio Total Es: " + venta.getnaranja3()*n);
				break;
			case 4:
				System.out.println("Ingresa la cantidad de fresas deseadas");
				f = Double.parseDouble(br.readLine());
				System.out.println("El Precio Total Es: " + venta.getfresa4()*f);
				break;
			case 5:
				System.out.println("Ingresa la cantidad de kiwis deseados");
				k = Double.parseDouble(br.readLine());
				System.out.println("El Precio Total Es: " + venta.getkiwi5()*k);
			}
			
		} catch (Exception e) {
	 		e.printStackTrace();
		}
	}
}
