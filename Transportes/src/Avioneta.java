public class Avioneta extends Aereo{
	public String TAvioneta, Alas1, Helice1, Brujula1;
	public Avioneta(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String cola, String cabi, String can, String seg, String mar, int asie1, int ven, String avione, String al1, String hel1, String bruj1) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ, cola, cabi, can, seg, mar, asie1, ven);
		setTAvioneta(avione);
		setAlas1(al1);
		setHelice1(hel1);
		setBrujula1(bruj1);
	}
	
	public void setTAvioneta(String avione) {
		TAvioneta = avione;
	}
	public String getTAvioneta() {
		return TAvioneta;
	}
	public void setAlas1(String al1) {
		Alas1 = al1;
	}
	public String getAlas1() {
		return Alas1;
	}
	public void setHelice1(String hel1) {
		Helice1 = hel1;
	}
	public String getHelice1() {
		return Helice1;
	}
	public void setBrujula1(String bruj1) {
		Brujula1 = bruj1;
	}
	public String getBrujula1() {
		return Brujula1;
	}
	@Override
	public double CalNud_L() {
		double Distancia;
		Distancia = millas1/CargaFuel();
		return Distancia;
	}
	@Override
	public double CargaFuel() {
		return 500;
	}
	
	public String toString() {
		return "Avioneta Color: " + Color +", Tipo de Combustible: "+ Combustible +", Tipo de Luces: "+ Luces +", Serie: "+ Serie +", Modelo: "+ Modelo +", Velocidad Maxima: "+ Velocidad +", Tipo de Motor: "+ Motor +", Capacidad: "+ Capacidad +", Año: "+ Año +", Tipo de Cola: "+ Cola +", Tipo de Cabina "+ Cabina +", Tamaño de la Caja Negra: "+ CajaNegra +", Tipo de Seguridad: "+ Seguridad +", Marca: "+ Marca +", Numero de Asientos: "+ Asientos1 +", Numero de Ventanas: "+ Ventanas +", Tipo de Avioneta: "+ TAvioneta +", Tipo de Alas: "+ Alas1 +", Tipo de Helice: "+ Helice1 +", Tipo de Brujula: "+ Brujula1 +", Capacidad de Tanque: "+ CargaFuel() +", Distancia Recorrida en 20 Millas: "+ CalNud_L() +" ";
	}
}