public class Persona {
	
	public String nombre, lugarnacimiento, fechanacimiento;
	public char sexo;
	
	public Persona (String n, String Ln, String Fn, char s) {
		setnombre (n);
		setlugarnacimiento (Ln);
		setfechanacimiento (Fn);
		setsexo (s);
		
	}
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String n) {
		nombre = n;
	}
	
	public String getLugarnacimiento() {
		return lugarnacimiento;
	}
	public void setlugarnacimiento(String Ln) {
		lugarnacimiento = Ln;
	}
	
	public String getfechanacimiento() {
		return fechanacimiento;
	}
	public void setfechanacimiento(String Fn) {
		fechanacimiento = Fn;
	}
	
	public char getsexo() {
		return sexo;
	}
	public void setsexo(char s) {
		sexo = s;
	}
	
}
