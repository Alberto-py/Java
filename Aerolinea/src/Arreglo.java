import java.io.*;
public class Arreglo {
	public static void main(String [] agrs) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		try {
			int opc, Numero = 0, num = 5;
			String Aero[][], Nombre;
			
			Aero = new String[10][2];
			Aero[0][0] = "1";
			Aero[1][0] = "2";
			Aero[2][0] = "3";
			Aero[3][0] = "4";
			Aero[4][0] = "5";
			Aero[5][0] = "6";
			Aero[6][0] = "7";
			Aero[7][0] = "8";
			Aero[8][0] = "9";
			Aero[9][0] = "10";
			
			for(int c=0; c<10; c++) {
				System.out.println("Ingresa 1 si desea Clase Preferencial | 2 para la Clase Economica");
				opc = Integer.parseInt(br.readLine());
				switch(opc) {
				case 1:
					if(Numero<=5) {
					System.out.println("Ingresa el Nombre del Pasajero: ");
					Nombre = br.readLine();
					Aero[Numero][1] = Nombre;
					Numero ++;
					}
					else {
						System.out.println("El Siguiente Vuelo Sale en 3 Horas");
					}
					break;
				
				case 2:
					if(num >= 5) {
					System.out.println("Ingresa el Nombre del Pasajeo: ");
					Nombre =  br.readLine();
					Aero[num][1] = Nombre;
					num ++;
					}
					else {
						System.out.println("El Siguiente Vuelo Sale en 3 Horas");
					}
					break;
				}
			}
			System.out.println("\n");
			
			for(int i = 0; i<10; i++) {
				System.out.println(Aero[i][0] + "|" + Aero[i][1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}