public class Moto extends Terrestre{
	public String TipoMoto, Manubrio, Cadena;
	public Moto(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String trans, String mar, int lla, int retro, int asie, String moto, String manu, String cad) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ, trans, mar, lla, retro, asie);
		setManubrio(manu);
		setCadena(cad);
		setTipoMoto(moto);
	}
	
	public void setTipoMoto(String moto) {
		TipoMoto = moto;
	}
	public String getTipoMoto() {
		return TipoMoto;
	}
	public void setManubrio(String manu) {
		Manubrio = manu;
	}
	public String getManubrio() {
		return Manubrio;
	}
	public void setCadena(String cad) {
		Cadena = cad;
	}
	public String getCadena() {
		return Cadena;
	}
	@Override
	public double CalKM_L() {
		double distan;
		distan = km/CargaFuel();
		return distan;
	}
	@Override
	public double CargaFuel() {
		return 40;
	}
	
	public String toString() {
		return "Moto Color: " + Color +", Tipo de Combustible: "+ Combustible +", Tipo de Luces: "+ Luces +", Serie: "+ Serie +", Modelo: "+ Modelo +", Velocidad Maxima: "+ Velocidad +", Tipo de Motor: "+ Motor +", Capacidad: "+ Capacidad +", Año: "+ Año +", Marca "+ Marca +", Tipo de Transmision "+ Transmision +", Numero de Llantas: "+ Llantas +", Numero de Retrovisores: "+ Retrovisores +", Numero de Asientos: "+ Asientos +", Tipo de Moto: "+ TipoMoto +", Tipo de Manubrio: "+ Manubrio +", Tipo de Cadena: "+ Cadena +", Capacidad de Tanque: "+ CargaFuel() +", Distancia Recorrida en 20km: "+ CalKM_L() +" ";
	}
}