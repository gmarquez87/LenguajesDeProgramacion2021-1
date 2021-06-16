package claseTeorica8;

//public class PruebaIMC {
	//public static void main (String[] args ) {
	//	Persona p= new Persona();
	//	p.altura=1.80*39.370079; //pulgadas
	//	p.peso=80*2.205;//libras
		
	//	System.out.println(p.obtenerIMC());
	//}

//}

public class PruebaIMC {
	public static void main (String[] args ) {
		Persona p= new Persona();
		p.establecerAlturaEnPulgadas(1.80*39.370079);
		p.establecerPesoEnLibras(80*2.205);
		System.out.println(p.obtenerIMC());
	}
}