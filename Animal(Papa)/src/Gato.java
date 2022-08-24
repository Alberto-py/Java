public class Gato extends Animal {
	public String Ladrar;
	
	public Gato(String col, String nom, String tam, int pat) {
		super(col, nom, tam, pat);
	}
	protected String getMaullar() {
		return "Miau Miau";
	}
}