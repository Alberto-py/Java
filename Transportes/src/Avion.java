public class Avion extends Aereo{
	public String TipoAvion, Turbinas, Alas;
	public int Vuelos, Llantas1;
	public Avion(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String cola, String cabi, String can, String seg, String mar, int asie1, int ven, String avion, String turb, String al, int vuel, int lla1) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ, cola, cabi, can, seg, mar, asie1, ven);
		setTipoAvion(avion);
		setTurbinas(turb);
		setAlas(al);
		setVuelos(vuel);
		setLlantas1(lla1);
	}
	
	public void setTipoAvion(String avion) {
		TipoAvion = avion;
	}
	public String getTipoAvion() {
		return TipoAvion;
	}
	public void setTurbinas(String turb) {
		Turbinas = turb;
	}
	public String getTurbinas() {
		return Turbinas;
	}
	public void setAlas(String al) {
		Alas = al;
	}
	public String getAlas() {
		return Alas;
	}
	public void setVuelos(int vuel) {
		Vuelos = vuel;
	}
	public int getVuelos() {
		return Vuelos;
	}
	public void setLlantas1(int lla1) {
		Llantas1 = lla1;
	}
	public int getLlantas1() {
		return Llantas1;
	}
	@Override
	public double CalNud_L() {
		double Distancia;
		Distancia = Millas1/CargaFuel();
		return Distancia;
	}
	@Override
	public double CargaFuel() {
		return 150000;
	}
	
	public String toString() {
		return "Avion Color: " + Color +", Tipo de Combustible: "+ Combustible +", Tipo de Luces: "+ Luces +", Serie: "+ Serie +", Modelo: "+ Modelo +", Velocidad Maxima: "+ Velocidad +", Tipo de Motor: "+ Motor +", Capacidad: "+ Capacidad +", Año: "+ Año +", Tipo de Cola: "+ Cola +", Tipo de Cabina "+ Cabina +", Tamaño de la Caja Negra: "+ CajaNegra +", Tipo de Seguridad: "+ Seguridad +", Marca: "+ Marca +", Numero de Asientos: "+ Asientos1 +", Numero de Ventanas: "+ Ventanas +", Tipo de Avion: "+ TipoAvion +", Tipo de Turbinas: "+ Turbinas +", Tipo de Alas: "+ Alas +", Numero de Vuelos que Puede dar: "+ Vuelos +", Numero de Llantas: "+ Llantas1 +", Capacidad de Tanque: "+ CargaFuel() +", Distancia Recorrida en 1848 Millas: "+ CalNud_L() +" ";
	}
}