package clasePractica4.hogar;

import java.util.ArrayList;

public class Hogar {
	public static void main(String[] args) {
        Familia familia = new Familia();
        familia.agregarMiembro(new Persona("Gaston"));
        familia.agregarMiembro(new Persona("Carmen"));
        Persona p;
        ArrayList<Persona> personas = familia.getPersonas();
        for (int i = 0; i < personas.size(); i++) {
            p = personas.get(i);
            System.out.println(p.getNombre());
        }
    }
}
