public class Empleado {
	public String nombre, puesto;
	public double salario, aumento;
	public Empleado(String nom, String pue, double sal, double aum) {
		setnombre(nom);
		setpuesto(pue);
		setsalario(sal);
		setaumento(aum);
		
	}
	public void setnombre(String nom) {
		nombre = nom;
	}
	public String getnombre() {
		return nombre;
	}
	public void setpuesto(String pue) {
		puesto = pue;
	}
	public String getpuesto() {
		return puesto;
	}
	public void setsalario(double sal) {
		salario = sal;
	}
	public double getsalario() {
		return salario;
	}
	public void setaumento(double aum) {
		aumento = aum*0.10;
	}
	public double getaumento() {
		return aumento+salario;
	}

	public void printStackTrace() {
		
	}
	
	public String toString() {
		return "Empleado [nombre=" + nombre + ", puesto= " + puesto + ", salario= " + salario +", aumento= " + aumento + "]";
	}
	
}