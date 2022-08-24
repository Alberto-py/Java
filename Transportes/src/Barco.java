public class Barco extends Acuatico{
	public String Radar, Timon, Ancla, TBarco, Iluminacion, Radio;
	public int BSalvavidas, Tripulacion, Camarotes;
	public Barco(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String mat, String bruj, String hel, int salv, String rad, String tim, String anc, String barco, String ilum, String radi, int bsalva, int trip, int camar) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ, mat, bruj, hel, salv);
		setRadar(rad);
		setTimon(tim);
		setAncla(anc);
		setTBarco(barco);
		setIluminacion(ilum);
		setRadio(radi);
		setBSalvavidas(bsalva);
		setTripulacion(trip);
		setCamarotes(camar);
	}
	
	public void setRadar(String rad) {
		Radar = rad;
	}
	public String getRadar() {
		return Radar;
	}
	public void setTimon(String tim) {
		Timon = tim;
	}
	public String getTimon() {
		return Timon;
	}
	public void setAncla(String anc) {
		Ancla = anc;
	}
	public String getAncla() {
		return Ancla;
	}
	public void setTBarco(String barco) {
		TBarco = barco;
	}
	public String getTBarco() {
		return TBarco;
	}
	public void setIluminacion(String ilum) {
		Iluminacion = ilum;
	}
	public String getIluminacion() {
		return Iluminacion;
	}
	public void setRadio(String radi) {
		Radio = radi;
	}
	public String getRadio() {
		return Radio;
	}
	public void setBSalvavidas(int bsalva) {
		BSalvavidas = bsalva;
	}
	public int getBSalvavidas() {
		return BSalvavidas;
	}
	public void setTripulacion(int trip) {
		Tripulacion = trip;
	}
	public int getTripulacion() {
		return Tripulacion;
	}
	public void setCamarotes(int camar) {
		Camarotes = camar;
	}
	public int getCamarotes() {
		return Camarotes;
	}
	@Override
	public double CalNudo_L() {
		double distancia;
		distancia = Millas/CargaFuel();
		return distancia;
	}
	@Override
	public double CargaFuel() {
		return 23560;
	}
	
	public String toString() {
		return "Barco Color: " + Color +", Tipo de Combustible: "+ Combustible +", Tipo de Luces: "+ Luces +", Serie: "+ Serie +", Tipo de Material: "+ Material +", Tipo de Brujula: "+ Brujula +", Tipo de Helice: "+ Helice +", Numero de Salvavidas: "+ Salvavidas +", Tipo de Radar: "+ Radar +",Tipo de Timon: "+ Timon +", Tipo de Ancla: "+ Ancla +", Tipo de Barco "+ TBarco +", Tipo de Iluminacion "+ Iluminacion +", Tiene Radio: "+ Radio +", Numero de Barcos Salvavidas: "+ BSalvavidas +", Numero de la Tripulacion en Total: "+ Tripulacion +", Numero de Camarotes en Total: "+ Camarotes +", Capacidad del Tanque: "+ CargaFuel() +", Distancia Recorrida en 1885 Millas: "+ CalNudo_L() +" ";
	}
}