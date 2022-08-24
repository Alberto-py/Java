public class Camion extends Terrestre{
	public String TipoC, AireC, BolsasA;
	public Camion(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String trans, String mar, int lla, int retro, int asie, String cami, String ac, String bolsa) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ, trans, mar, lla, retro, asie);
		setTipoC(cami);
		setAireC(ac);
		setBolsasA(bolsa);
	}
	
	public void setTipoC(String cami) {
		TipoC = cami;
	}
	public String getTipoC() {
		return TipoC;
	}
	public void setAireC(String ac) {
		AireC = ac;
	}
	public String getAireC() {
		return AireC;
	}
	public void setBolsasA(String bolsa) {
		BolsasA = bolsa;
	}
	public String getBolsasA() {
		return BolsasA;
	}
	@Override
	public double CalKM_L() {
		double distan;
		distan = KM/CargaFuel();
		return distan;
	}
	@Override
	public double CargaFuel() {
		return 200;
	}
	
	public String toString() {
		return "Camion Color: " + Color +", Tipo de Combustible: "+ Combustible +", Tipo de Luces: "+ Luces +", Serie: "+ Serie +", Modelo: "+ Modelo +", Velocidad Maxima: "+ Velocidad +", Tipo de Motor: "+ Motor +", Capacidad: "+ Capacidad +", Año: "+ Año +", Marca "+ Marca +", Tipo de Transmision "+ Transmision +", Numero de Llantas: "+ Llantas +", Numero de Retrovisores: "+ Retrovisores +", Numero de Asientos: "+ Asientos +", Tipo de Camion: "+ TipoC +", Tiene Aire Acondicionado: "+ AireC +", Numero de Bolsas de Aire: "+ BolsasA +", Capacidad de Tanque: "+ CargaFuel() +", Distancia Recorrida en 100km: "+ CalKM_L() +" ";
	}
}