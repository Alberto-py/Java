public class Trailer extends Terrestre{
	public String TipoCaja, Claxon;
	public int Camas, Remolques, Mofles;
	public Trailer(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String trans, String mar, int lla, int retro, int asie, String caja, String clax, int cam, int remol, int mof) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ, trans, mar, lla, retro, asie);
		setTipoCaja(caja);
		setClaxon(clax);
		setCamas(cam);
		setRemolques(remol);
		setMofles(mof);
	}
	
	public void setTipoCaja(String caja) {
		TipoCaja = caja;
	}
	public String getTipoCaja() {
		return TipoCaja;
	}
	public void setClaxon(String clax) {
		Claxon = clax;
	}
	public String getClaxon() {
		return Claxon;
	}
	public void setCamas(int cam) {
		Camas = cam;
	}
	public int getCamas() {
		return Camas;
	}
	public void setRemolques(int remol) {
		Remolques = remol;
	}
	public int getRemolques() {
		return Remolques;
	}
	public void setMofles(int mof) {
		Mofles = mof;
	}
	public int getMofles() {
		return Mofles;
	}
	@Override
	public double CalKM_L() {
		double distan;
		distan = KM/CargaFuel();
		return distan;
	}
	@Override
	public double CargaFuel() {
		return 300;
	}
	
	public String toString() {
		return "Trailer Color: " + Color +", Tipo de Combustible: "+ Combustible +", Tipo de Luces: "+ Luces +", Serie: "+ Serie +", Modelo: "+ Modelo +", Velocidad Maxima: "+ Velocidad +", Tipo de Motor: "+ Motor +", Capacidad: "+ Capacidad +", Año: "+ Año +", Marca "+ Marca +", Tipo de Transmision "+ Transmision +", Numero de Llantas: "+ Llantas +", Numero de Retrovisores: "+ Retrovisores +", Numero de Asientos: "+ Asientos +", Tipo de Caja: "+ TipoCaja +", Tipo de Claxon "+ Claxon +", Numero de Camas: "+ Camas +", Numero de Remolques: "+ Remolques +", Numero de Mofles: "+ Mofles +", Capacidad de Tanque: "+ CargaFuel() +", Distancia Recorrida en 100km: "+ CalKM_L() +" ";
	}
}