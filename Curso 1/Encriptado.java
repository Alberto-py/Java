import java.io.*;

public class Encriptado {
	public static void main(String[] args){

		int number;
		String encriptado="", numero="";

		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader (isr);

		try {
			for(int i=0; i<=9; i++) {
				System.out.println("Ingrese un numero del 0 al 9\n");
				number = Integer.parseInt(br.readLine());

				switch(number) {

				case 1:
					numero += String.valueOf(number);
					encriptado += "A";
					break;

				case 2:
					numero += String.valueOf(number);
					encriptado += "B";
					break;

				case 3:
					numero += String.valueOf(number);
					encriptado += "L";
					break;

				case 4:
					numero += String.valueOf(number);
					encriptado += "R";
					break;

				case 5:
					numero += String.valueOf(number);
					encriptado += "E";
					break;

				case 6:
					numero += String.valueOf(number);
					encriptado += "N";
					break;

				case 7:
					numero += String.valueOf(number);
					encriptado += "T";
					break;

				case 8:
					numero += String.valueOf(number);
					encriptado += "D";
					break;

				case 9:
					numero += String.valueOf(number);
					encriptado += "O";
					break;

				case 0:
					numero += String.valueOf(number);
					encriptado += "Y";
					break;

				default :
					System.out.println("Ingrese un numero valido de entre 0 y 9");
					break;

				}
			}

		}catch (Exception ex) {
				ex.printStackTrace();
			}



		System.out.println(numero);
		System.out.println(encriptado);
	}
}
