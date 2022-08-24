public class Productos {
	public double manzana1, uva2, naranja3, fresa4, kiwi5;
	public Productos(double manz, double uva, double nara, double fres, double kiw) {
		setmanzana1(manz);
		setuva2(uva);
		setnaranja3(nara);
		setfresa4(fres);
		setkiwi5(kiw);
	}
	
	public void setmanzana1(double manz) {
		manzana1 = manz;
	}
	public double getmanzana1() {
		return manzana1;
	}
	public void setuva2(double uva) {
		uva2 = uva;
	}
	public double getuva2() {
		return uva2;
	}
	public void setnaranja3(double nara) {
		naranja3 = nara;
	}
	public double getnaranja3() {
		return naranja3;
	}
	public void setfresa4(double fres) {
		fresa4 = fres;
	}
	public double getfresa4() {
		return fresa4;
	}
	public void setkiwi5(double kiw) {
		kiwi5 = kiw;
	}
	public double getkiwi5() {
		return kiwi5;
	}
}