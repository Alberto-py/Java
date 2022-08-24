public class Submarino extends Acuatico{
	public String TSubmarino, TBlindaje, Oxigeno, Periscopio, Radar1, Radio1, Sonores;
	public int Asientos2, Profundidad;
	public Submarino(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String mat, String bruj, String hel, int salv, String submari, String blin, String oxi, String peris, String rad1, String radi1, String son, int asie2, int prof) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ, mat, bruj, hel, salv);
		setTSubmarino(submari);
		setTBlindaje(blin);
		setOxigeno(oxi);
		setPeriscopio(peris);
		setRadar1(rad1);
		setRadio1(radi1);
		setSonores(son);
		setAsientos2(asie2);
		setProfundidad(prof);
	}
	
	public void setTSubmarino(String submari) {
		TSubmarino = submari;
	}
	public String getTSubmarino() {
		return TSubmarino;
	}
	public void setTBlindaje(String blin) {
		TBlindaje = blin;
	}
	public String getTBlindaje() {
		return TBlindaje;
	}
	public void setOxigeno(String oxi) {
		Oxigeno = oxi;
	}
	public String getOxigeno() {
		return Oxigeno;
	}
	public void setPeriscopio(String peris) {
		Periscopio = peris;
	}
	public String getPeriscopio() {
		return Periscopio;
	}
	public void setRadar1(String rad1) {
		Radar1 = rad1;
	}
	public String getRadar1() {
		return Radar1;
	}
	public void setRadio1(String radi1) {
		Radio1 = radi1;
	}
	public String getRadio1() {
		return Radio1;
	}
	public void setSonores(String son) {
		Sonores = son;
	}
	public String getSonores() {
		return Sonores;
	}
	public void setAsientos2(int asie2) {
		Asientos2 = asie2;
	}
	public int getAsientos2() {
		return Asientos2;
	}
	public void setProfundidad(int prof) {
		Profundidad = prof;
	}
	public int getProfundidad() {
		return Profundidad;
	}
	@Override
	public double CalNudo_L() {
		double distancia;
		distancia = Millas/CargaFuel();
		return distancia;
	}
	@Override
	public double CargaFuel() {
		return 40000;
	}
	
	public String toString() {
		return "Submarino Color: " + Color +", Tipo de Combustible: "+ Combustible +", Tipo de Luces: "+ Luces +", Serie: "+ Serie +", Tipo de Material: "+ Material +", Tipo de Brujula: "+ Brujula +", Tipo de Helice: "+ Helice +", Numero de Salvavidas: "+ Salvavidas +", Tipo de SubMarino: "+ TSubmarino +", Tipo de Blindaje: "+ TBlindaje +", Cuenta con Oxigeno para Busos: "+ Oxigeno +", Tipo de Periscopio: "+ Periscopio +", Tipo de Radar: "+ Radar1 +", Tipo de Radio: "+ Radio1 +", Cuenta con Ondas Sonoras: "+ Sonores +", Numero de Asientos: "+ Asientos2 +", Profundidad que llega en Metros: "+ Profundidad +", Capacidad del Tanque: "+ CargaFuel() +", Distancia Recorrida en 1885 Millas: "+ CalNudo_L() +" ";
	}
}