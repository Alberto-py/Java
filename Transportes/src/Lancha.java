public class Lancha extends Acuatico{
	public String TLancha, TamanoL, Volante2, Compartimiento;
	public int Asientos3;
	public Lancha(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String mat, String bruj, String hel, int salv, String lancha, String taml, String vola2, String comp, int asie3) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ, mat, bruj, hel, salv);
		setTLancha(lancha);
		setTamanoL(taml);
		setVolante2(vola2);
		setCompartimiento(comp);
		setAsientos3(asie3);
	}
	public void setTLancha(String lancha) {
		TLancha = lancha;
	}
	public String getTLancha() {
		return TLancha;
	}
	public void setTamanoL(String taml) {
		TamanoL = taml;
	}
	public String getTamanoL() {
		return TamanoL;
	}
	public void setVolante2(String vola2) {
		Volante2 = vola2;
	}
	public String getVolante2() {
		return Volante2;
	}
	public void setCompartimiento(String comp) {
		Compartimiento = comp;
	}
	public String getCompartimiento() {
		return Compartimiento;
	}
	public void setAsientos3(int asie3) {
		Asientos3 = asie3;
	}
	public int getAsientos3() {
		return Asientos3;
	}
	@Override
	public double CalNudo_L() {
		double distancia;
		distancia = millas/CargaFuel();
		return distancia;
	}
	@Override
	public double CargaFuel() {
		return 500;
	}
	
	public String toString() {
		return "Lancha Color: " + Color +", Tipo de Combustible: "+ Combustible +", Tipo de Luces: "+ Luces +", Serie: "+ Serie +", Tipo de Material: "+ Material +", Tipo de Brujula: "+ Brujula +", Tipo de Helice: "+ Helice +", Numero de Salvavidas: "+ Salvavidas +", Tipo de Lancha: "+ TLancha +", Tamaño de la Lancha: "+ TamanoL +", Tipo de Volante "+ Volante2 +", Tamaño del Compartimiento: "+ Compartimiento +", Numero de Asientos: "+ Asientos3 +", Capacidad del Tanque: "+ CargaFuel() +", Distancia Recorrida en 20 Millas: "+ CalNudo_L() +" ";
	}
}