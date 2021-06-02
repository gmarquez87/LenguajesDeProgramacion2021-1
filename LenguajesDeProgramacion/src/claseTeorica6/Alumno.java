package claseTeorica6;

public class Alumno extends Persona {
	private String carrera;
	
	public Alumno(String nombre, String direccion, int edad, String carrera){
		super(nombre, direccion, edad);
		this.carrera=carrera;
	}
	
	public void imprimir() {
		System.out.println(nombre + " estudia " + carrera);
	}

}
