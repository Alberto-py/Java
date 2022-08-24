public abstract class Transporte {
	public String Color, Combustible, Luces, Serie, Capacidad;
	protected String Modelo, Velocidad, Motor;
	public double CargaFuel;
	protected int A�o;
	public Transporte(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int a�) {
		setColor(col);
		setCombustible(comb);
		setModelo(mod);
		setLuces(luz);
		setVelocidad(vel);
		setCapacidad(cap);
		setA�o(a�);
		setSerie(ser);
	}
	
	public void setColor(String col) {
		Color = col;
	}
	public String getColor() {
		return Color;
	}
	public void setCombustible(String comb) {
		Combustible = comb;
	}
	public String getCombustible() {
		return Combustible;
	}
	public void setModelo(String mod) {
		Modelo = mod;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setLuces(String luz) {
		Luces = luz;
	}
	public String getLuces() {
		return Luces;
	}
	public void setVelocidad(String vel) {
		Velocidad = vel;
	}
	public String getVelocidad() {
		return Velocidad;
	}
	public void setCapacidad(String cap) {
		Capacidad = cap;
	}
	public String getCapacidad() {
		return Capacidad;
	}
	public void setA�o(int a�) {
		A�o = a�;
	}
	public int getA�o() {
		return A�o;
	}
	public void setSerie(String ser) {
		Serie = ser;
	}
	public String getSerie() {
		return Serie;
	}
	public abstract double CargaFuel ();
}