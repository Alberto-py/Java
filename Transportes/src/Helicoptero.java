public class Helicoptero extends Aereo{
	public String Helice2, THelicoptero, Base;
	public Helicoptero(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String cola, String cabi, String can, String seg, String mar, int asie1, int ven, String hel2, String helicop, String base) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ, cola, cabi, can, seg, mar, asie1, ven);
		setHelice2(hel2);
		setTHelicoptero(helicop);
		setBase(base);
	}
	
	public void setHelice2(String hel2) {
		Helice2 = hel2;
	}
	public String getHelice2() {
		return Helice2;
	}
	public void setTHelicoptero(String helicop) {
		THelicoptero = helicop;
	}
	public String getTHelicoptero() {
		return THelicoptero;
	}
	public void setBase(String base) {
		 Base = base;
	}
	public String getBase() {
		return Base;
	}
	@Override
	public double CalNud_L() {
		double Distancia;
		Distancia = millas1/CargaFuel();
		return Distancia;
	}
	@Override
	public double CargaFuel() {
		return 200;
	}
	public String toString() {
		return "Heliceptero Color: " + Color +", Tipo de Combustible: "+ Combustible +", Tipo de Luces: "+ Luces +", Serie: "+ Serie +", Modelo: "+ Modelo +", Velocidad Maxima: "+ Velocidad +", Tipo de Motor: "+ Motor +", Capacidad: "+ Capacidad +", Año: "+ Año +", Tipo de Cola: "+ Cola +", Tipo de Cabina "+ Cabina +", Tamaño de la Caja Negra: "+ CajaNegra +", Tipo de Seguridad: "+ Seguridad +", Marca: "+ Marca +", Numero de Asientos: "+ Asientos1 +", Numero de Ventanas: "+ Ventanas +", Tipo de Helice: "+ Helice2 +", Tipo de Helicoptero: "+ THelicoptero +", Tipo de Base: "+ Base +", Capacidad de Tanque: "+ CargaFuel() +", Distancia Recorrida en 30 Millas: "+ CalNud_L() +" ";
	}
}