import java.io.*;
public class Vendedores extends Productos {
	public Vendedores(int prod, int SubT) {
		super(prod);
	}

	public static void main(String [] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			int opc, sueldo, comi = 0, comi1 = 0, comi2 = 0, comi3 = 0;
			int p1,p2,p3,p4,p5;
			do {
				System.out.println("\t1. Vendedor#1");
				System.out.println("\t2. Vendedor#2");
				System.out.println("\t3. Vendedor#3");
				System.out.println("\t4. Vendedor#4");
				System.out.println("\t0. Cerrar");
				System.out.println("Ingresa la Opcion");
				opc = Integer.parseInt(br.readLine());
				System.out.println("\n");
				switch(opc) {
				case 1:
					System.out.println("Ingresa la cantidad de los Celulares vendidos");
					p1 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de las Tablet's vendidas");
					p2 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de las Laptop's vendidas");
					p3 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de los Mouses vendidos");
					p4 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de los Teclados vendidos");
					p5 = Integer.parseInt(br.readLine());
					comi = Productos.getcelular()*p1 + Productos.gettablet()*p2 + Productos.getlaptop()*p3 + Productos.getmouse()*p4 + Productos.getteclado()*p5;
					break;
				case 2:
					System.out.println("Ingresa la cantidad de los Celulares vendidos");
					p1 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de las Tablet's vendidas");
					p2 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de las Laptop's vendidas");
					p3 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de los Mouses vendidos");
					p4 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de los Teclados vendidos");
					p5 = Integer.parseInt(br.readLine());
					comi1 = Productos.getcelular()*p1 + Productos.gettablet()*p2 + Productos.getlaptop()*p3 + Productos.getmouse()*p4 + Productos.getteclado()*p5;
					break;
				case 3:
					System.out.println("Ingresa la cantidad de los Celulares vendidos");
					p1 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de las Tablet's vendidas");
					p2 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de las Laptop's vendidas");
					p3 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de los Mouses vendidos");
					p4 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de los Teclados vendidos");
					p5 = Integer.parseInt(br.readLine());
					comi2 = Productos.getcelular()*p1 + Productos.gettablet()*p2 + Productos.getlaptop()*p3 + Productos.getmouse()*p4 + Productos.getteclado()*p5;
					break;
				case 4:
					System.out.println("Ingresa la cantidad de los Celulares vendidos");
					p1 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de las Tablet's vendidas");
					p2 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de las Laptop's vendidas");
					p3 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de los Mouses vendidos");
					p4 = Integer.parseInt(br.readLine());
					System.out.println("Ingresa la cantidad de los Teclados vendidos");
					p5 = Integer.parseInt(br.readLine());
					comi3 = Productos.getcelular()*p1 + Productos.gettablet()*p2 + Productos.getlaptop()*p3 + Productos.getmouse()*p4 + Productos.getteclado()*p5;
					break;
				}
			} while(opc!=0);
			
			if (comi <=1000) {
				sueldo = Productos.getsueldo() + 500;
				System.out.println("La comision es: " + 500);
				System.out.println("La venta total es: " + comi);
				System.out.println("El sueldo total es: " + sueldo);
			}
			else if (comi <=3000){
				sueldo = Productos.getsueldo() + 1000;
				System.out.println("La comision es: " + 1000);
				System.out.println("La venta total es: " + comi);
				System.out.println("El sueldo total es: " + sueldo);
			}
			else if (comi <=5000){
				sueldo = Productos.getsueldo() + 1500;
				System.out.println("La comision es: " + 1500);
				System.out.println("La venta total es: " + comi);
				System.out.println("El sueldo total es: " + sueldo);
			}
			else if (comi >5000){
				sueldo = Productos.getsueldo() + 2000;
				System.out.println("La comision es: " + 2000);
				System.out.println("La venta total es: " + comi);
				System.out.println("El sueldo total es: " + sueldo);
			}
			System.out.println("\n");
			if (comi1 <=1000) {
				sueldo = Productos.getsueldo() + 500;
				System.out.println("La comision es: " + 500);
				System.out.println("La venta total es: " + comi1);
				System.out.println("El sueldo total es: " + sueldo);
			}
			else if (comi1 <=3000){
				sueldo = Productos.getsueldo() + 1000;
				System.out.println("La comision es: " + 1000);
				System.out.println("La venta total es: " + comi1);
				System.out.println("El sueldo total es: " + sueldo);
			}
			else if (comi1 <=5000){
				sueldo = Productos.getsueldo() + 1500;
				System.out.println("La comision es: " + 1500);
				System.out.println("La venta total es: " + comi1);
				System.out.println("El sueldo total es: " + sueldo);
			}
			else if (comi1 >5000){
				sueldo = Productos.getsueldo() + 2000;
				System.out.println("La comision es: " + 2000);
				System.out.println("La venta total es: " + comi1);
				System.out.println("El sueldo total es: " + sueldo);
			}
			System.out.println("\n");
			if (comi2 <=1000) {
				sueldo = Productos.getsueldo() + 500;
				System.out.println("La comision es: " + 500);
				System.out.println("La venta total es: " + comi2);
				System.out.println("El sueldo total es: " + sueldo);
			}
			else if (comi2 <=3000){
				sueldo = Productos.getsueldo() + 1000;
				System.out.println("La comision es: " + 1000);
				System.out.println("La venta total es: " + comi2);
				System.out.println("El sueldo total es: " + sueldo);
			}
			else if (comi2 <=5000){
				sueldo = Productos.getsueldo() + 1500;
				System.out.println("La comision es: " + 1500);
				System.out.println("La venta total es: " + comi2);
				System.out.println("El sueldo total es: " + sueldo);
			}
			else if (comi2 >5000){
				sueldo = Productos.getsueldo() + 2000;
				System.out.println("La comision es: " + 2000);
				System.out.println("La venta total es: " + comi2);
				System.out.println("El sueldo total es: " + sueldo);
			}
			System.out.println("\n");
			if (comi3 <=1000) {
				sueldo = Productos.getsueldo() + 500;
				System.out.println("La comision es: " + 500);
				System.out.println("La venta total es: " + comi3);
				System.out.println("El sueldo total es: " + sueldo);
			}
			else if (comi3 <=3000){
				sueldo = Productos.getsueldo() + 1000;
				System.out.println("La comision es: " + 1000);
				System.out.println("La venta total es: " + comi3);
				System.out.println("El sueldo total es: " + sueldo);
			}
			else if (comi3 <=5000){
				sueldo = Productos.getsueldo() + 1500;
				System.out.println("La comision es: " + 1500);
				System.out.println("La venta total es: " + comi3);
				System.out.println("El sueldo total es: " + sueldo);
			}
			else if (comi3 >5000){
				sueldo = Productos.getsueldo() + 2000;
				System.out.println("La comision es: " + 2000);
				System.out.println("La venta total es: " + comi3);
				System.out.println("El sueldo total es: " + sueldo);
			}
		} catch (Exception e) {
	 		e.printStackTrace();
		}
	}
}