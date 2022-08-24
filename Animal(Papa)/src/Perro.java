public class Perro extends Animal {
	public String Ladrar;
	
	public Perro(String col, String nom, String tam, int pat) {
		super(col, nom, tam, pat);
	}
	protected String getLadrar() {
		return "Guau Guau";
	}
}