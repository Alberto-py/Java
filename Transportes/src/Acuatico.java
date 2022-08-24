public abstract class Acuatico extends Transporte{
	public String Material, Brujula, Helice;
	public int Salvavidas;
	public double CalNudo_L, Millas = 1885, millas = 20;
	public Acuatico(String col, String comb, String mod, String luz, String ser, String cap, String vel, String mot, int añ, String mat, String bruj, String hel, int salv) {
		super(col, comb, mod, luz, vel, mot, ser, cap, añ);
		setMaterial(mat);
		setBrujula(bruj);
		setHelice(hel);
		setSalvavidas(salv);
	}
	
	public void setMaterial(String mat) {
		Material = mat;
	}
	public String getMaterial() {
		return Material;
	}
	public void setBrujula(String bruj) {
		Brujula = bruj;
	}
	public String getBrujula() {
		return Brujula;
	}
	public void setHelice(String hel) {
		Helice = hel;
	}
	public String getHelice() {
		return Helice;
	}
	public void setSalvavidas(int salv) {
		Salvavidas = salv;
	}
	public int getSalvavidas() {
		return Salvavidas;
	}
	public abstract double CalNudo_L();
}