public class Camioneta extends Terrestre{
	public String TamanoCabina, AsientosRemovi;
	public int Puertas1;
	public Camioneta(String col, String comb, String mod, String luz, String cap, String ser, String vel, String mot, int añ, String trans, String mar, int lla, int retro, int asie, String tamcabi, String asieR, int puer1) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ, trans, mar, lla, retro, asie);
		setTamanoCabina(tamcabi);
		setAsientosRemovi(asieR);
		setPuertas1(puer1);
	}
	
	public void setTamanoCabina(String tamcabi) {
		TamanoCabina = tamcabi;
	}
	public String getTamanoCabina() {
		return TamanoCabina;
	}
	public void setAsientosRemovi(String asieR) {
		AsientosRemovi = asieR;
	}
	public String getAsientosRemovi() {
		return AsientosRemovi;
	}
	public void setPuertas1(int puer1) {
		Puertas1 = puer1;
	}
	public int getPuertas1() {
		return Puertas1;
	}
	@Override
	public double CalKM_L() {
		double distan;
		distan = km/CargaFuel();
		return distan;
	}
	@Override
	public double CargaFuel() {
		return 90;
	}
	public String toString() {
		return "Camioneta Color: " + Color +", Tipo de Combustible: "+ Combustible +", Tipo de Luces: "+ Luces +", Serie: "+ Serie +", Modelo: "+ Modelo +", Velocidad Maxima: "+ Velocidad +", Tipo de Motor: "+ Motor +", Capacidad: "+ Capacidad +", Año: "+ Año +", Marca "+ Marca +", Tipo de Transmision "+ Transmision +", Numero de Llantas: "+ Llantas +", Numero de Retrovisores: "+ Retrovisores +", Numero de Asientos: "+ Asientos +", Tamaño de la Cabina: "+ TamanoCabina +", Numero de Asientos Removibles: "+ AsientosRemovi +", Numero de Puertas: "+ Puertas1 +", Capacidad de Tanque: "+ CargaFuel() +", Distancia Recorrida en 20km: "+ CalKM_L() +" ";
	}
}