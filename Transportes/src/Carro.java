public class Carro extends Terrestre{
	public String Sonido;
	public int Puertas, Ventanas1, Version;
	public Carro(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String trans, String mar, int lla, int retro, int asie, String sony, int puer, int ven1, int vers) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ, trans, mar, lla, retro, asie);
		setSonido(sony);
		setPuertas(puer);
		setVentanas1(ven1);
		setVersion(vers);
	}
	
	public void setSonido(String sony) {
		Sonido = sony;
	}
	public String getSonido() {
		return Sonido;
	}
	public void setPuertas(int puer) {
		Puertas = puer;
	}
	public int getPuertas() {
		return Puertas;
	}
	public void setVentanas1(int ven1) {
		Ventanas1 = ven1;
	}
	public int getVenanas1() {
		return Ventanas1;
	}
	public void setVersion(int vers) {
		Version = vers;
	}
	public int getVersion() {
		return Version;
	}
	
	@Override
	public double CalKM_L() {
		double distan;
		distan = km/CargaFuel();
		return distan;
	}
	@Override
	public double CargaFuel() {
		return 60;
	}
	
	public String toString() {
		return "Carro Color: " + Color +", Tipo de Combustible: "+ Combustible +", Tipo de Luces: "+ Luces +", Serie: "+ Serie +", Modelo: "+ Modelo +", Velocidad Maxima: "+ Velocidad +", Tipo de Motor: "+ Motor +", Capacidad: "+ Capacidad +", Año: "+ Año +", Marca "+ Marca +", Tipo de Transmision "+ Transmision +", Numero de Llantas: "+ Llantas +", Numero de Retrovisores: "+ Retrovisores +", Numero de Asientos: "+ Asientos +", Tipo de Sonido: "+ Sonido +", Numero de Puertas: "+ Puertas +", Numero de Ventanas: "+ Ventanas1  +", Version: "+ Version +", Capacidad de Tanque: "+ CargaFuel() +", Distancia Recorrida en 20km: "+ CalKM_L() +" ";
	}
}