package clasePractica8;

public class Prueba {
	public static void main (String [] args) {
		final int ALTURA_MAXIMA = 10000;
		Avion avion = new Avion(35000, 50000, 0, "i15f52gr");
	    Aeropuerto a = new Aeropuerto(avion, 10);
	    AeropuertoInternacional ai = new AeropuertoInternacional(5);
	       
	    a.agregarAvion(avion);
	    boolean despegue = avion.despegar(50000, ALTURA_MAXIMA);
	    System.out.println(despegue);
	    if(despegue){
	    	avion.aterrizar(10000);
	    }
	    
	    PilotoComercial p = new PilotoComercial();
	    p.setNombre("Patricio");
	    System.out.println(p.saludarPasajeros());
	    
	    PilotoDeCarga pc = new PilotoDeCarga();
	    System.out.println(pc.getNombre());
	    System.out.println(pc.getEdad());
	}

}
