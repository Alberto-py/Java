public abstract class Terrestre extends Transporte{
	protected String Transmision, Marca;
	public int Llantas, Retrovisores, Asientos;
	public double CalKM_L, KM = 110, km = 20;
	public Terrestre(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String trans, String mar, int lla, int retro, int asie) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ);
		setTransmision(trans);
		setMarca(mar);
		setLlantas(lla);
		setRetrovisores(retro);
		setAsientos(asie);
	}
	
	public void setTransmision(String trans) {
		Transmision = trans;
	}
	public String getTransmision() {
		return Transmision;
	}
	public void setMarca(String mar) {
		Marca = mar;
	}
	public String getMarca() {
		return Marca;
	}
	public void setLlantas(int lla) {
		Llantas = lla;
	}
	public int getLlantas() {
		return Llantas;
	}
	public void setRetrovisores(int retro) {
		Retrovisores = retro;
	}
	public int getRetrovisores() {
		return Retrovisores;
	}
	public void setAsientos(int asie) {
		Asientos = asie;
	}
	public int getAsientos() {
		return Asientos;
	}
	public abstract double CalKM_L();
}