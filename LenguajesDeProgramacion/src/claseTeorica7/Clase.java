package claseTeorica7;

public class Clase implements MiInterface {
	
	public void metodoA() {
		System.out.println("Probando el metodo A");
	}
	
	public int metodoB() {
		return 23;
	}
	
	public String metodoC(int a, int b) {
		return "a = " + a + ", b = " + b;
	}

}
