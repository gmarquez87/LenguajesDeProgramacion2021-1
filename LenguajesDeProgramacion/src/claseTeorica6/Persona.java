package claseTeorica6;

public class Persona {
	protected String nombre;
	protected String direccion;
	protected int edad;
	
	public Persona(String nombre, String direccion, int edad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
	}
	
	public void Print() {
		System.out.println(nombre + "vive en" + direccion +  "y tiene" + edad + "anios");
	}
	
	public String quienEs() {
		return nombre;
	}

}
