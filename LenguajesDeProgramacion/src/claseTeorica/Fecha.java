package claseTeorica;

public class Fecha {
	/*atributos de la clase Fecha*/
	private int dia, mes, anio;
	
	/*Constructor vacío*/
	public Fecha() {
		
	}
	
	/*Constructor con variables*/
	public Fecha (int dia, int mes, int anio) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	
	/*Método que obtiene el día*/
	public int obtieneDia() {
		return dia;
	}
	
	/*Método que obtiene el mes*/
	public int obtieneMes() {
		return mes;
	}
	
	/*Método que obtiene el año*/
	public int obtieneAnio() {
		return anio;
	}
	
	/*Método que retorna la fecha en un formato específico*/
	public String toString() {
		return dia+"***"+mes+"***"+anio;
	}
	
	/*Método que verifica si dos fechas son iguales*/
	public boolean esIgual(int d, int m, int a) {
		return dia==d && mes == m && anio ==a;
	}
	
	/*Método que verifica si dos fechas son iguales con un parámetro del tipo Fecha*/
	public boolean esIgual(Fecha f) {
		return dia==f.dia && mes==f.mes && anio ==f.anio;
	}
	
	/*Método que compara si una fecha es mayor que la otra*/
	public boolean esMayor(Fecha f) {
		if(anio>f.anio) {
			return true;
		}else {
			if(anio==f.anio) {
				if(mes>f.mes) {
					return true;
				}else {
					if(mes==f.mes) {
						if(dia>f.dia) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	/*Método que permite modificar Fechas*/
	public void asigna(int d, int m, int a) {
		dia=d;
		mes=m;
		anio=a;
	}

}
