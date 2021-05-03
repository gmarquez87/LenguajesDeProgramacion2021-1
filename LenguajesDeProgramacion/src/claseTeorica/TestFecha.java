package claseTeorica;

public class TestFecha {
	public static void main (String [] args) {
		/*Declaración de variables que ocuparemos en esta clase*/
		int dd, mm, aa;
		
		/*Declaración de dos variables del tipo Fecha*/
		Fecha f1, f2;
		
		f1=new Fecha();
		f2=new Fecha(6,5,2021);
		
		/*Asignamos una fecha*/
		f1.asigna(5, 5, 2021);
		
		/*Mostrar la fecha f1*/
		System.out.println("La fecha es: "+f1.toString());
		
		/*Mostrar el día de f1*/
		System.out.println("El dia es: "+f1.obtieneDia());
		
		/*Mostrar el mes de f1*/
		System.out.println("El mes es: "+f1.obtieneMes());
		
		/*Mostrar el año de f1*/
		System.out.println("El anio es: "+f1.obtieneAnio());
		
		/*Determinar si f1=f2*/
		if(f1.esIgual(f2)) {
			System.out.println("Las fechas son iguales");
		}else {
			System.out.println("Las fechas NO son iguales");
		}
		
		/*Determinar si f1>f2*/
		if(f1.esMayor(f2)) {
			System.out.println("La fecha es mayor");
		}else {
			System.out.println("La fecha es menor");
		}
	}

}
