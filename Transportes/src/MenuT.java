import java.io.*;
import java.util.*;
public class MenuT {
	
	public static ArrayList<Transporte> transport = new ArrayList<Transporte>();
	
	public static void main (String [] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int Opc = 0, opc = 0;
		boolean repite = true;
		try {
			do {
				String color, combust, luces, serie, modelo, veloz, motor, capaci;
				int año;
				
				System.out.println("\t1. Terrestre");
				System.out.println("\t2. Aereo");
				System.out.println("\t3. Acuatico");
				System.out.println("\t4. Salir");
				System.out.println("Elija una opcion\n");
				Opc = Integer.parseInt(br.readLine());
				
				switch(Opc) {
				case 1:
					String transmi, marca;
					int llantas, retrovi, asient;
			
					System.out.println("\t1. Moto");
					System.out.println("\t2. Carro");
					System.out.println("\t3. Camioneta");
					System.out.println("\t4. Camion");
					System.out.println("\t5. Trailer");
					System.out.println("\t6. Salir");
					System.out.println("Elija una opcion");
					opc = Integer.parseInt(br.readLine());
					
					switch(opc) {
					case 1:
						String TMoto, manubrio, chain;
						
						System.out.println("Ingresa el Color de la Moto ");
						color = br.readLine();
						System.out.println("Ingresa el Tipo de Combustible para la Moto ");
						combust = br.readLine();
						System.out.println("Ingresa el Tipo de Luz para la Moto ");
						luces = br.readLine();
						System.out.println("Ingresa la Serie de la Moto ");
						serie = br.readLine();
						System.out.println("Ingresa el Modelo de la Moto ");
						modelo = br.readLine();
						System.out.println("Ingresa la Velocidad Maxima de la Moto ");
						veloz = br.readLine();
						System.out.println("Ingresa el Tipo de Motor ");
						motor = br.readLine();
						System.out.println("Ingresa la Capacidad de la Moto ");
						capaci = br.readLine();
						System.out.println("Ingresa el Tipo de Transmision de la Moto ");
						transmi = br.readLine();
						System.out.println("Ingresa la Marca de la Moto ");
						marca = br.readLine();
						System.out.println("Ingresa el Año de la Moto ");
						año = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Llantas ");
						llantas = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Retrovisores ");
						retrovi = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Asientos del Carro");
						asient = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Moto ");
						TMoto = br.readLine();
						System.out.println("Ingresa el Tipo de Manubrio ");
						manubrio = br.readLine();
						System.out.println("Ingresa el Tipo de Cadena de la Moto ");
						chain = br.readLine();
						
						Moto mot = new Moto(color, combust, luces, serie, modelo, veloz, motor, capaci, año, marca, transmi, llantas, retrovi, asient, TMoto, manubrio, chain);
						transport.add(mot);
						break;
					case 2:
						String sony;
						int puert, windows, version;
						
						System.out.println("Ingresa el Color del Carro ");
						color = br.readLine();
						System.out.println("Ingresa el Tipo de Combustible para el Carro ");
						combust = br.readLine();
						System.out.println("Ingresa el Tipo de Luz para el Carro ");
						luces = br.readLine();
						System.out.println("Ingresa la Serie del Carro ");
						serie = br.readLine();
						System.out.println("Ingresa el Modelo del Carro ");
						modelo = br.readLine();
						System.out.println("Ingresa la Velocidad Maxima del Carro ");
						veloz = br.readLine();
						System.out.println("Ingresa el Tipo de Motor ");
						motor = br.readLine();
						System.out.println("Ingresa la Capacidad del Carro ");
						capaci = br.readLine();
						System.out.println("Ingresa el Tipo de Transmision del Carro ");
						transmi = br.readLine();
						System.out.println("Ingresa la Marca del Carro ");
						marca = br.readLine();
						System.out.println("Ingresa el Año del Carro ");
						año = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Llantas ");
						llantas = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Retrovisores ");
						retrovi = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Asientos del Carro");
						asient = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Sonido del Carro ");
						sony = br.readLine();
						System.out.println("Ingresa el Numero de Puertas del Carro ");
						puert = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Ventanas del Carro ");
						windows = Integer.parseInt(br.readLine());
						System.out.println("Ingresa la Version del Carro ");
						version = Integer.parseInt(br.readLine());
						
						Carro car = new Carro(color, combust, luces, serie, modelo, veloz, motor, capaci, año, marca, transmi, llantas, retrovi, asient, sony, puert, windows, version);
						transport.add(car);
						break;
					case 3:
						String SizeCabina, asientosRemovi;
						int puertas1;
						
						System.out.println("Ingresa el Color de la Camioneta ");
						color = br.readLine();
						System.out.println("Ingresa el Tipo de Combustible para la Camioneta ");
						combust = br.readLine();
						System.out.println("Ingresa el Tipo de Luz para la Camioneta ");
						luces = br.readLine();
						System.out.println("Ingresa la Serie de la Camioneta ");
						serie = br.readLine();
						System.out.println("Ingresa el Modelo de la Camioneta ");
						modelo = br.readLine();
						System.out.println("Ingresa la Velocidad Maxima de la Camioneta ");
						veloz = br.readLine();
						System.out.println("Ingresa el Tipo de Motor ");
						motor = br.readLine();
						System.out.println("Ingresa la Capacidad de la Camioneta ");
						capaci = br.readLine();
						System.out.println("Ingresa el Tipo de Transmision de la Camioneta ");
						transmi = br.readLine();
						System.out.println("Ingresa la Marca de la Camioneta ");
						marca = br.readLine();
						System.out.println("Ingresa el Año de la Camioneta ");
						año = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Llantas ");
						llantas = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Retrovisores ");
						retrovi = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Asientos de la Camioneta ");
						asient = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tamaño de la Cabina ");
						SizeCabina = br.readLine();
						System.out.println("La Camioneta Tiene Asientos Removibles ");
						asientosRemovi = br.readLine();
						System.out.println("Ingresa el Numero de Puertas que Tiene la Camioneta ");
						puertas1 = Integer.parseInt(br.readLine());
						
						Camioneta camionet = new Camioneta(color, combust, luces, serie, modelo, veloz, motor, capaci, año, marca, transmi, llantas, retrovi, asient, SizeCabina, asientosRemovi, puertas1);
						transport.add(camionet);
						break;
					case 4:
						String tipoC, aireC, bolsasA;
						
						System.out.println("Ingresa el Color del Camion ");
						color = br.readLine();
						System.out.println("Ingresa el Tipo de Combustible para el Camion ");
						combust = br.readLine();
						System.out.println("Ingresa el Tipo de Luz para el Camion ");
						luces = br.readLine();
						System.out.println("Ingresa la Serie del Camion ");
						serie = br.readLine();
						System.out.println("Ingresa el Modelo del Camion ");
						modelo = br.readLine();
						System.out.println("Ingresa la Velocidad Maxima del Camion ");
						veloz = br.readLine();
						System.out.println("Ingresa el Tipo de Motor ");
						motor = br.readLine();
						System.out.println("Ingresa la Capacidad del Camion ");
						capaci = br.readLine();
						System.out.println("Ingresa el Tipo de Transmision del Camion ");
						transmi = br.readLine();
						System.out.println("Ingresa la Marca del Camion ");
						marca = br.readLine();
						System.out.println("Ingresa el Año del Camion ");
						año = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Llantas ");
						llantas = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Retrovisores ");
						retrovi = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Asientos del Camion ");
						asient = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Camion ");
						tipoC = br.readLine();
						System.out.println("El Camion Tiene Aire Acondicionado? ");
						aireC = br.readLine();
						System.out.println("Ingresa el Numero de Bolsas de Aire ");
						bolsasA = br.readLine();
						
						Camion camy = new Camion(color, combust, luces, serie, modelo, veloz, motor, capaci, año, marca, transmi, llantas, retrovi, asient, tipoC, aireC, bolsasA);
						transport.add(camy);
						break;
					case 5:
						String TCaja, claxon;
						int camas, remolqs, mofles;
						
						System.out.println("Ingresa el Color del Trailer ");
						color = br.readLine();
						System.out.println("Ingresa el Tipo de Combustible para el Trailer ");
						combust = br.readLine();
						System.out.println("Ingresa el Tipo de Luz para el Trailer ");
						luces = br.readLine();
						System.out.println("Ingresa la Serie del Trailer ");
						serie = br.readLine();
						System.out.println("Ingresa el Modelo del Trailer ");
						modelo = br.readLine();
						System.out.println("Ingresa la Velocidad Maxima del Trailer ");
						veloz = br.readLine();
						System.out.println("Ingresa el Tipo de Motor ");
						motor = br.readLine();
						System.out.println("Ingresa la Capacidad del Trailer ");
						capaci = br.readLine();
						System.out.println("Ingresa el Tipo de Transmision del Trailer ");
						transmi = br.readLine();
						System.out.println("Ingresa la Marca del Trailer ");
						marca = br.readLine();
						System.out.println("Ingresa el Año del Trailer ");
						año = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Llantas ");
						llantas = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Retrovisores ");
						retrovi = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Asientos del Trailer ");
						asient = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Caja para el Trailer ");
						TCaja = br.readLine();
						System.out.println("Ingresa el Tipo de Claxon ");
						claxon = br.readLine();
						System.out.println("Ingresa el Numero de Camas del Trailer ");
						camas = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Remolques para el Trailer ");
						remolqs = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Mofles del Trailer ");
						mofles = Integer.parseInt(br.readLine());
						
						Trailer trai = new Trailer(color, combust, luces, serie, modelo, veloz, motor, capaci, año, marca, transmi, llantas, retrovi, asient, TCaja, claxon, camas, remolqs, mofles);
						transport.add(trai);
						break;
					case 6:
						repite = false;
						break;
					default:
						System.out.println("Ingresa una Opcion Valida");
						break;
					}
					break;
				case 2:
					String cola, cabina, CajaBlack, segurity, marca1;
					int asientos1, windows1;
					
					System.out.println("\t1. Avion");
					System.out.println("\t2. Avioneta");
					System.out.println("\t3. Helicoptero");
					System.out.println("\t4. Salir");
					System.out.println("Elija una opcion");
					opc = Integer.parseInt(br.readLine());
					
					switch(opc) {
					case 1:
						String TAvion, turbi, alas;
						int vuelos, llantas1;
						
						System.out.println("Ingresa el Color del Avion ");
						color = br.readLine();
						System.out.println("Ingresa el Tipo de Combustible para el Avion ");
						combust = br.readLine();
						System.out.println("Ingresa el Tipo de Luz para el Avion ");
						luces = br.readLine();
						System.out.println("Ingresa la Serie del Avion ");
						serie = br.readLine();
						System.out.println("Ingresa el Modelo del Avion ");
						modelo = br.readLine();
						System.out.println("Ingresa la Velocidad Maxima del Avion ");
						veloz = br.readLine();
						System.out.println("Ingresa el Tipo de Motor ");
						motor = br.readLine();
						System.out.println("Ingresa la Capacidad del Avion ");
						capaci = br.readLine();
						System.out.println("Ingresa el Año del Avion ");
						año = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Cola del Avion ");
						cola = br.readLine();
						System.out.println("Ingresa el Tipo de la Cabina del Avion ");
						cabina = br.readLine();
						System.out.println("Ingresa el Tamaño de la Caja Negra ");
						CajaBlack = br.readLine();
						System.out.println("Ingresa el Tipo de Seguridad del Avion ");
						segurity = br.readLine();
						System.out.println("Ingresa la Marca del Avion ");
						marca1 = br.readLine();
						System.out.println("Ingresa el Numero de Asientos del Avion ");
						asientos1 = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Ventanas del Avion ");
						windows1 = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Avion ");
						TAvion = br.readLine();
						System.out.println("Ingresa el Tipo de Turbinas del Avion ");
						turbi = br.readLine();
						System.out.println("Ingresa el Tipo de Alas del Avion ");
						alas = br.readLine();
						System.out.println("Ingresa la Cantidad de Vuelos que Puede dar el Avion ");
						vuelos = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Llantas del Avion ");
						llantas1 = Integer.parseInt(br.readLine());
						
						Avion avi = new Avion(color, combust, luces, serie, modelo, veloz, motor, capaci, año, cola, cabina, CajaBlack, segurity, marca1, asientos1, windows1, TAvion, turbi, alas, vuelos, llantas1);
						transport.add(avi);
						break;
					case 2:
						String TAvione, alas1, helice1, bruju1;
						
						System.out.println("Ingresa el Color de la Avioneta ");
						color = br.readLine();
						System.out.println("Ingresa el Tipo de Combustible para la Avioneta ");
						combust = br.readLine();
						System.out.println("Ingresa el Tipo de Luz para la Avioneta ");
						luces = br.readLine();
						System.out.println("Ingresa la Serie de la Avioneta ");
						serie = br.readLine();
						System.out.println("Ingresa el Modelo de la Avioneta ");
						modelo = br.readLine();
						System.out.println("Ingresa la Velocidad Maxima de la Avioneta ");
						veloz = br.readLine();
						System.out.println("Ingresa el Tipo de Motor ");
						motor = br.readLine();
						System.out.println("Ingresa la Capacidad de la Avioneta ");
						capaci = br.readLine();
						System.out.println("Ingresa el Año del Avion ");
						año = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Cola de la Avioneta ");
						cola = br.readLine();
						System.out.println("Ingresa el Tipo de la Cabina de la Avioneta ");
						cabina = br.readLine();
						System.out.println("Ingresa el Tamaño de la Caja Negra ");
						CajaBlack = br.readLine();
						System.out.println("Ingresa el Tipo de Seguridad de la Avioneta ");
						segurity = br.readLine();
						System.out.println("Ingresa la Marca de la Avioneta ");
						marca1 = br.readLine();
						System.out.println("Ingresa el Numero de Asientos de la Avioneta ");
						asientos1 = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Ventanas de la Avioneta ");
						windows1 = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Avioneta ");
						TAvione = br.readLine();
						System.out.println("Ingresa el Tipo de Alas del Avioneta ");
						alas1 = br.readLine();
						System.out.println("Ingresa el Tipo de Helice de la Avioneta ");
						helice1 = br.readLine();
						System.out.println("Ingresa el Tipo de Brujula de la Avioneta ");
						bruju1 = br.readLine();
						
						Avioneta avione = new Avioneta(color, combust, luces, serie, modelo, veloz, motor, capaci, año, cola, cabina, CajaBlack, segurity, marca1, asientos1, windows1, TAvione, alas1, helice1, bruju1);
						transport.add(avione);
						break;
					case 3:
						String THelicop, helice2, base;
						
						System.out.println("Ingresa el Color del Helicoptero ");
						color = br.readLine();
						System.out.println("Ingresa el Tipo de Combustible para el Helicoptero ");
						combust = br.readLine();
						System.out.println("Ingresa el Tipo de Luz para el Helicoptero ");
						luces = br.readLine();
						System.out.println("Ingresa la Serie del Helicoptero ");
						serie = br.readLine();
						System.out.println("Ingresa el Modelo del Helicoptero ");
						modelo = br.readLine();
						System.out.println("Ingresa la Velocidad Maxima del Helicoptero ");
						veloz = br.readLine();
						System.out.println("Ingresa el Tipo de Motor ");
						motor = br.readLine();
						System.out.println("Ingresa la Capacidad del Helicoptero ");
						capaci = br.readLine();
						System.out.println("Ingresa el Año del Helicoptero ");
						año = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Cola del Helicoptero ");
						cola = br.readLine();
						System.out.println("Ingresa el Tipo de la Cabina del Helicoptero ");
						cabina = br.readLine();
						System.out.println("Ingresa el Tamaño de la Caja Negra ");
						CajaBlack = br.readLine();
						System.out.println("Ingresa el Tipo de Seguridad del Helicoptero ");
						segurity = br.readLine();
						System.out.println("Ingresa la Marca del Avion ");
						marca1 = br.readLine();
						System.out.println("Ingresa el Numero de Asientos del Helicoptero ");
						asientos1 = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Ventanas del Helicoptero ");
						windows1 = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Helicoptero ");
						THelicop = br.readLine();
						System.out.println("Ingresa el Tipo de Helice del Helicoptero ");
						helice2 = br.readLine();
						System.out.println("Ingresa el Tipo de Base del Helicopero ");
						base = br.readLine();
						
						Helicoptero helicop = new Helicoptero(color, combust, luces, serie, modelo, veloz, motor, capaci, año, cola, cabina, CajaBlack, segurity, marca1, asientos1, windows1, THelicop, helice2, base);
						transport.add(helicop);
						break;
					case 4:
						repite = false;
						break;
					default:
						System.out.println("Ingresa una Opcion Valida");
						break;
					}
					break;
					
				case 3:
					String material, bruju1, helice;
					int salvavidas;
					
					System.out.println("\t1. Barco");
					System.out.println("\t2. Lancha");
					System.out.println("\t3. MotoAcuatica");
					System.out.println("\t4. Submarino");
					System.out.println("\t5. Salir");
					System.out.println("Elija una opcion");
					opc = Integer.parseInt(br.readLine());
					
					switch(opc) {
					case 1:
						String Tbarco, radar, timon, ancla, ilumina, radio;
						int Bsalvavidas, tripulacion, camarotes;
						
						System.out.println("Ingresa el Color del Barco ");
						color = br.readLine();
						System.out.println("Ingresa el Tipo de Combustible para el Barco ");
						combust = br.readLine();
						System.out.println("Ingresa el Tipo de Luz para el Barco ");
						luces = br.readLine();
						System.out.println("Ingresa la Serie del Barco ");
						serie = br.readLine();
						System.out.println("Ingresa el Modelo del Barco ");
						modelo = br.readLine();
						System.out.println("Ingresa la Velocidad Maxima del Barco ");
						veloz = br.readLine();
						System.out.println("Ingresa el Tipo de Motor ");
						motor = br.readLine();
						System.out.println("Ingresa la Capacidad del Barco ");
						capaci = br.readLine();
						System.out.println("Ingresa el Año del Barco ");
						año = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Material del Barco ");
						material = br.readLine();
						System.out.println("Ingresa el Tipo de Brujula del Barco ");
						bruju1 = br.readLine();
						System.out.println("Ingresa el Tipo de Helice del Barco ");
						helice = br.readLine();
						System.out.println("Ingresa el Numero de Salvavidas ");
						salvavidas = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Barco ");
						Tbarco = br.readLine();
						System.out.println("Ingresa el Tipo de Radar del Barco ");
						radar = br.readLine();
						System.out.println("Ingresa el Tipo de Timon del Barco ");
						timon = br.readLine();
						System.out.println("Ingresa el Tipo de Ancla del Barco ");
						ancla = br.readLine();
						System.out.println("Ingresa el Tipo de Iluminacion del Barco ");
						ilumina = br.readLine();
						System.out.println("El Barco Tiene Radio? ");
						radio = br.readLine();
						System.out.println("Ingresa el Numero de Botes Salvavidas que Tiene el Barco ");
						Bsalvavidas = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de la Tripulacion que Tiene el Barco ");
						tripulacion = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Numero de Camarotes que Tiene el Barco ");
						camarotes = Integer.parseInt(br.readLine());
						
						Barco barc = new Barco(color, combust, luces, serie, modelo, veloz, motor, capaci, año, material, bruju1, helice, salvavidas, Tbarco, radar, timon, ancla, ilumina, radio, Bsalvavidas, tripulacion, camarotes);
						transport.add(barc);
						break;
					case 2:
						String Tlancha, SizeLancha, volante2, compartimi;
						int asientos3;
						
						System.out.println("Ingresa el Color de la Lancha ");
						color = br.readLine();
						System.out.println("Ingresa el Tipo de Combustible para la Lancha ");
						combust = br.readLine();
						System.out.println("Ingresa el Tipo de Luz para La Lancha ");
						luces = br.readLine();
						System.out.println("Ingresa la Serie de la Lancha ");
						serie = br.readLine();
						System.out.println("Ingresa el Modelo de la Lancha ");
						modelo = br.readLine();
						System.out.println("Ingresa la Velocidad Maxima de la Lancha ");
						veloz = br.readLine();
						System.out.println("Ingresa el Tipo de Motor ");
						motor = br.readLine();
						System.out.println("Ingresa la Capacidad de la Lancha ");
						capaci = br.readLine();
						System.out.println("Ingresa el Año del Barco ");
						año = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Material de la Lancha ");
						material = br.readLine();
						System.out.println("Ingresa el Tipo de Brujula de la Lancha ");
						bruju1 = br.readLine();
						System.out.println("Ingresa el Tipo de Helice de la Lancha ");
						helice = br.readLine();
						System.out.println("Ingresa el Numero de Salvavidas ");
						salvavidas = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Lancha ");
						Tlancha = br.readLine();
						System.out.println("Ingresa el Tamaño de la Lancha ");
						SizeLancha = br.readLine();
						System.out.println("Ingresa el Tipo de Volante de la Lancha ");
						volante2 = br.readLine();
						System.out.println("Ingresa el Tamaño del Compartimiento ");
						compartimi = br.readLine();
						System.out.println("Ingresa el Numero de Asientos de la Lancha ");
						asientos3 = Integer.parseInt(br.readLine());
						
						Lancha lanch = new Lancha(color, combust, luces, serie, modelo, veloz, motor, capaci, año, material, bruju1, helice, salvavidas, Tlancha, SizeLancha, volante2, compartimi, asientos3);
						transport.add(lanch);
						break;
					case 3:
						String usoMA, manubrio2;
						int asientos4;
						
						System.out.println("Ingresa el Color de la Moto Acuatica ");
						color = br.readLine();
						System.out.println("Ingresa el Tipo de Combustible para la Moto Acuatica ");
						combust = br.readLine();
						System.out.println("Ingresa el Tipo de Luz para La Moto Acuatica ");
						luces = br.readLine();
						System.out.println("Ingresa la Serie de la Moto Acuatica ");
						serie = br.readLine();
						System.out.println("Ingresa el Modelo de la Moto Acuatica ");
						modelo = br.readLine();
						System.out.println("Ingresa la Velocidad Maxima de la Moto Acuatica ");
						veloz = br.readLine();
						System.out.println("Ingresa el Tipo de Motor ");
						motor = br.readLine();
						System.out.println("Ingresa la Capacidad de la Moto Acuatica ");
						capaci = br.readLine();
						System.out.println("Ingresa el Año del Barco ");
						año = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Material de la Moto Acuatica ");
						material = br.readLine();
						System.out.println("Ingresa el Tipo de Brujula de la Moto Acuatica ");
						bruju1 = br.readLine();
						System.out.println("Ingresa el Tipo de Helice de la Moto Acuatica ");
						helice = br.readLine();
						System.out.println("Ingresa el Numero de Salvavidas ");
						salvavidas = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Helice de la Moto Acuatica ");
						helice = br.readLine();
						System.out.println("Ingresa el Tipo de Uso para la Moto Acuatica ");
						usoMA = br.readLine();
						System.out.println("Ingresa el Tipo de Manubrio de la Moto Acuatica ");
						manubrio2 = br.readLine();
						System.out.println("Ingresa el Numero de Asientos de la Moto Acuatica ");
						asientos4 = Integer.parseInt(br.readLine());
						
						MotoAcuatica MotoAcua = new MotoAcuatica(color, combust, luces, serie, modelo, veloz, motor, capaci, año, material, bruju1, helice, salvavidas, usoMA, manubrio2, asientos4);
						transport.add(MotoAcua);
						break;
					case 4:
						String tSubmarino, tBlindaje, oxigeno, periscopio, radar1, radio1, sonores;
						int asientos5, profundidad;
						
						System.out.println("Ingresa el Color del Submarino ");
						color = br.readLine();
						System.out.println("Ingresa el Tipo de Combustible para el Submarino ");
						combust = br.readLine();
						System.out.println("Ingresa el Tipo de Luz para el Submarino ");
						luces = br.readLine();
						System.out.println("Ingresa la Serie del Submarino ");
						serie = br.readLine();
						System.out.println("Ingresa el Modelo del Submarino ");
						modelo = br.readLine();
						System.out.println("Ingresa la Velocidad Maxima del Submarino ");
						veloz = br.readLine();
						System.out.println("Ingresa el Tipo de Motor ");
						motor = br.readLine();
						System.out.println("Ingresa la Capacidad del Submarino ");
						capaci = br.readLine();
						System.out.println("Ingresa el Año del Barco ");
						año = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Material del Submarino ");
						material = br.readLine();
						System.out.println("Ingresa el Tipo de Brujula del Submarino ");
						bruju1 = br.readLine();
						System.out.println("Ingresa el Tipo de Helice del Submarino ");
						helice = br.readLine();
						System.out.println("Ingresa el Numero de Salvavidas ");
						salvavidas = Integer.parseInt(br.readLine());
						System.out.println("Ingresa el Tipo de Submarino ");
						tSubmarino = br.readLine();
						System.out.println("Ingresa el Tipo de Blindaje del Submarino ");
						tBlindaje = br.readLine();
						System.out.println("El Submarino Cuenta con Oxigeno para busos? ");
						oxigeno = br.readLine();
						System.out.println("Ingresa el Tipo de Periscopio del Submarino ");
						periscopio = br.readLine();
						System.out.println("Ingresa el Tipo de Radar del Submarino ");
						radar1 = br.readLine();
						System.out.println("Ingresa el Tipo de Radio del Submarino ");
						radio1 = br.readLine();
						System.out.println("El Submarino Cuanta con Ondas Sonoras ");
						sonores = br.readLine();
						System.out.println("Ingresa el Numero de Asientos que Contiene el Submarino ");
						asientos5 = Integer.parseInt(br.readLine());
						System.out.println("Ingresa la Profundidad a la que el Submarino Puede Bajar al Mar en Metros ");
						profundidad = Integer.parseInt(br.readLine());
						
						Submarino submari = new Submarino(color, combust, luces, serie, modelo, veloz, motor, capaci, año, material, bruju1, helice, salvavidas, tSubmarino, tBlindaje, oxigeno, periscopio, radar1, radio1, sonores, asientos5, profundidad);
						transport.add(submari);
						break;
					case 5:
						repite = false;
						break;
					default:
						System.out.println("Ingresa una Opcion Valida");
						break;
					}
					break;
					
				case 4:
					repite = false;
					break;
					
				default:
					System.out.println("Ingresa una Opcion Valida");
					break;
				}
				
			}while (repite);
			
			for(int i=0; i<transport.size(); i++) {
				System.out.println(transport.get(i));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}