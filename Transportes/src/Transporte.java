public abstract class Transporte {
	public String Color, Combustible, Luces, Serie, Capacidad;
	protected String Modelo, Velocidad, Motor;
	public double CargaFuel;
	protected int Año;
	public Transporte(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ) {
		setColor(col);
		setCombustible(comb);
		setModelo(mod);
		setLuces(luz);
		setVelocidad(vel);
		setCapacidad(cap);
		setAño(añ);
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
	public void setAño(int añ) {
		Año = añ;
	}
	public int getAño() {
		return Año;
	}
	public void setSerie(String ser) {
		Serie = ser;
	}
	public String getSerie() {
		return Serie;
	}
	public abstract double CargaFuel ();
}