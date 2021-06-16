package claseTeorica8;

//public class Persona {
	
//	public String nombre;
//	public double peso;
//	public double altura;
	
//	public Persona() {
		
//	}
	
//	public double obtenerIMC() {
//		return peso/(peso*peso);
//	}

//}
		

public class Persona{
	private double peso;
	private double altura;
	
	public Persona () {
		
	}
	
	public void establecerPesoEnKilogramos (double k) {
		peso=k;
	}
	
	public void establecerPesoEnLibras (double l) {
		peso=l/2.205;
	}
	
	public void establecerAlturaEnMetros(double m) {
		altura=m;
	}
	
	public void establecerAlturaEnPulgadas(double p) {
		altura=p/39.370079;
	}
	
	public double obtenerIMC() {
		return peso/(altura*altura);
	}
}
