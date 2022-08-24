public class Animal {
	public String Color, Nombre, Tamano;
	public int Patas;
	public Animal(String col, String nom, String tam, int pat) {
		setColor(col);
		setNombre(nom);
		setTamano(tam);
		setPatas(pat);
	}

	public void setColor(String col) {
		Color = col;
	}
	public String getColor() {
		return Color;
	}
	public void setNombre(String nom) {
		Nombre = nom;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setTamano(String tam) {
		Tamano = tam;
	}
	public String getTamano() {
		return Tamano;
	}
	public void setPatas(int pat) {
		Patas = pat;
	}
	public int getPatas() {
		return Patas;
	}	
}