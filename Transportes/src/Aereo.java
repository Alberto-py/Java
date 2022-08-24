public abstract class Aereo extends Transporte{
	public String Cola, Cabina, CajaNegra, Seguridad;
	protected String Marca;
	public int Asientos1, Ventanas;
	public double CalNud_L, Millas1 = 1848, millas1 = 30;
	public Aereo(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String cola, String cabi, String can, String seg, String mar, int asie1, int ven) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ);
		setCola(cola);
		setCabina(cabi);
		setCajaNegra(can);
		setSeguridad(seg);
		setMarca(mar);
		setAsientos1(asie1);
		setVentanas(ven);
	}
	
	public void setCola(String cola) {
		Cola = cola;
	}
	public String getCola() {
		return Cola;
	}
	public void setCabina(String cabi) {
		Cabina = cabi;
	}
	public String getCabina() {
		return Cabina;
	}
	public void setCajaNegra(String can) {
		CajaNegra = can;
	}
	public String getCajaNegra() {
		return CajaNegra;
	}
	public void setSeguridad(String seg) {
		Seguridad = seg;
	}
	public String getSeguridad() {
		return Seguridad;
	}
	public void setMarca(String mar) {
		Marca = mar;
	}
	public String getMarca() {
		return Marca;
	}
	public void setAsientos1(int asie1) {
		Asientos1 = asie1;
	}
	public int getAsientos1() {
		return Asientos1;
	}
	public void setVentanas(int ven) {
		Ventanas = ven;
	}
	public int getVentanas() {
		return Ventanas;
	}
	public abstract double CalNud_L();
}