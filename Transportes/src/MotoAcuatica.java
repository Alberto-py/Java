public class MotoAcuatica extends Acuatico{
	public String Manubrio2, UsoMA;
	public int Asientos4;
	public MotoAcuatica(String col, String comb, String mod, String luz, String cap, String ser, String vel, String mot, int añ, String mat, String bruj, String hel, int salv, String manu2, String uma, int asie4) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ, mat, bruj, hel, salv);
		setManubrio2(manu2);
		setUsoMA(uma);
		setAsientos4(asie4);
	}
	
	public void setManubrio2(String manu2) {
		Manubrio2 = manu2;
	}
	public String getManubrio2() {
		return Manubrio2;
	}
	public void setUsoMA(String uma) {
		UsoMA = uma;
	}
	public String getUsoMA() {
		return UsoMA;
	}
	public void setAsientos4(int asie4) {
		Asientos4 = asie4;
	}
	public int getAsientos4() {
		return Asientos4;
	}
	@Override
	public double CalNudo_L() {
		double distancia;
		distancia = millas/CargaFuel();
		return distancia;
	}
	@Override
	public double CargaFuel() {
		return 60;
	}
	
	public String toString() {
		return "MotoAcuatica Color: " + Color +", Tipo de Combustible: "+ Combustible +", Tipo de Luces: "+ Luces +", Serie: "+ Serie +", Tipo de Material: "+ Material +", Tipo de Brujula: "+ Brujula +", Tipo de Helice: "+ Helice +", Numero de Salvavidas: "+ Salvavidas +", Tipo de Manubrio: "+ Manubrio2 +", Tipo de Moto: "+ UsoMA +", Numero de Asientos: "+ Asientos4 +", Capacidad del Tanque: "+ CargaFuel() +", Distancia Recorrida en 30 Millas: "+ CalNudo_L() +" ";
	}
}